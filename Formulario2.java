import javax.swing.*;

public class Formulario2 extends JFrame{

  private JLabel label1;
  private JLabel label2;

  public Formulario2(){
    setLayout(null);
    label1 = new JLabel("Interfaz grafica");
    label1.setBounds(10,20,300,30);
    add(label1);
    label2 = new JLabel("Version 1.0");
    label2.setBounds(10,100,100,30);
    add(label2);
  }

  public static void main(String args[]){
    Formulario2 formulas = new Formulario2();
    formulas.setBounds(0,0,300,200);
    formulas.setResizable(false);
    formulas.setVisible(true);
    formulas.setLocationRelativeTo(null);
  }

}
