import java.util.Scanner;

// Problema: Un sistema estadounidense requiere
// grados Fahrenheit para ser utilizados pero
// donde se desea utilizar el sistema la temperatura 
// se mide en grados Celsius.

public class TestMain {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en Grados Fahrenhiet para el sistema: ");
        String leido = lector.nextLine();
        double entrada = Double.parseDouble(leido);  
        //Se espera que la entrada sea un entero o un double
        SystemAdapter sistema =  new SystemAdpaterImp();
        //Ejecutar el sistema con entrada en Fahrenheit
        sistema.executeSystem(entrada);
    }
}