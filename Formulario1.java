import javax.swing.*;

public class Formulario1 extends JFrame{

  public Formulario1(){
    setLayout(null);
  }

  public static void main(String args[]){
    Formulario1 formulas = new Formulario1();
    formulas.setBounds(0,0,400,550);
    formulas.setVisible(true);
    formulas.setLocationRelativeTo(null);  //omite el setBounds;
    formulas.setResizable(false);          //no se pueda modificar el tamaño de la ventana
    
  }
}
