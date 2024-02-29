
package Conversor.visual;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



import Conversor.Model.Moneda;
import Conversor.Model.Temperatura;
import Conversor.Model.Temperatura.Tipo;
import Conversor.Model.Unidades;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class Aplication extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
    private JTextField entradaText;
    private JTextField textSalida;
    private JComboBox<Unidades.unidades> unidadesComboBox;
    private JComboBox<?> conversiones=new JComboBox<>();
    private JLabel warning;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Aplication frame = new Aplication();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Aplication() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 557, 372);
        panel = new JPanel();
        panel.setForeground(Color.RED);
        panel.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Conversor de Unidades");
        lblNewLabel.setBackground(UIManager.getColor("ColorChooser.background"));
        lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(123, 12, 281, 49);
        panel.add(lblNewLabel);

        unidadesComboBox = new JComboBox<Unidades.unidades>(Unidades.unidades.values());
        unidadesComboBox.setBounds(152, 62, 230, 25);
        panel.add(unidadesComboBox);

        unidadesComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateComboBox((Unidades.unidades) unidadesComboBox.getSelectedItem());
            }
        });

        entradaText = new JTextField();
        entradaText.setBackground(UIManager.getColor("ComboBox.buttonDarkShadow"));
        entradaText.setFont(new Font("Dialog", Font.ITALIC, 16));
        entradaText.setBounds(152, 138, 230, 39);
        panel.add(entradaText);
        entradaText.setColumns(10);

        JButton btnConvertir = new JButton("Convertir");
        btnConvertir.setForeground(new Color(255, 255, 255));
        btnConvertir.setBackground(new Color(0, 0, 128));
        btnConvertir.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                try{ 
                    double valorEntrada = Double.parseDouble(entradaText.getText());
                    double resultado = 0;
                    if (Objects.equals((Unidades.unidades) unidadesComboBox.getSelectedItem(), Unidades.unidades.Moneda) && valorEntrada>0) {
                        Moneda monedaResultado = new Moneda();
                        resultado = monedaResultado.convertir((Moneda.Tipo) conversiones.getSelectedItem(), valorEntrada);
                        textSalida.setText(String.format("%.2f", resultado));
                        warning.setText(" ");
                       }else if(Objects.equals((Unidades.unidades) unidadesComboBox.getSelectedItem(), Unidades.unidades.Temperatura)){
                        Temperatura tempResultado=new Temperatura();
                        resultado=tempResultado.convertir((Temperatura.Tipo) conversiones.getSelectedItem(), valorEntrada);
                        textSalida.setText(String.format("%.2f", resultado));
                        warning.setText(" ");
                    }
                    
                    
                }catch(Exception e1){
                		warning.setText("¡Solo valores positivos / No caractéres!");
                        e1.printStackTrace();
                        throw new IllegalArgumentException("Valor ingresado incorrecto");
                    }
               
            }
        });
       
        btnConvertir.setBounds(215, 190, 101, 26);
        panel.add(btnConvertir);
      
       
		

        textSalida = new JTextField();
        textSalida.setBackground(UIManager.getColor("ComboBox.disabledForeground"));
        textSalida.setFont(new Font("Dialog", Font.ITALIC, 15));
        textSalida.setBounds(152, 228, 230, 39);
        panel.add(textSalida);
        textSalida.setColumns(10);
        
        warning = new JLabel("");
        warning.setForeground(new Color(255, 0, 0));
        warning.setBounds(152, 270, 230, 25);
        panel.add(warning);
        
        JLabel lblNewLabel_1 = new JLabel("Creado por Anthony");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(189, 307, 153, 16);
        panel.add(lblNewLabel_1);
    }

    private void updateComboBox(Unidades.unidades unidad) {
        
    	panel.remove(conversiones);
        if (Objects.equals(unidad, Unidades.unidades.Temperatura)) {
            conversiones = new JComboBox<Temperatura.Tipo>(Tipo.values());
        } else if (Objects.equals(unidad, Unidades.unidades.Moneda)) {
            conversiones = new JComboBox<Moneda.Tipo>(Moneda.Tipo.values());
        }

        conversiones.setBounds(182,100, 150, 25);
        panel.add(conversiones);

        panel.revalidate();
        panel.repaint();
    }
}
