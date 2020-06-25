public class SwitchCase{
  public static void main(String args[]){
    int num1 = 5, num2 = 3, resultado = 0;
    int parametro = 10;

    switch(parametro){
      case 1:
        resultado = num1 + num2;
        System.out.println("El resultado es: " +  resultado);
        break;
      case 2: ;
        resultado = num1 - num2;
        System.out.println("El resultado es: " + resultado);
        break;
      case 3:
        resultado = num1 * num2;
        System.out.println("El resultado es: " + resultado);
        break;
      case 4:
        resultado = num1 / num2;
        System.out.println("El resultado es: " + resultado);
        break;
      default:
        System.out.println("Error, no existe");
        break;
    }
  }
}
