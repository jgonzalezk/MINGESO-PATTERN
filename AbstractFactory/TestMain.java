import java.util.Scanner;

// Problema: Se quiere crear una suite de aplicaciones para Android y iOS,
// pero como son arquitecturas distintas se deben crear diferente las aplicaciones.
public class TestMain {

    public static void main(String[] args) {
        AbstractAppFactory factory;
        App app;
        Scanner lector = new Scanner(System.in);
        boolean exit = false;
        int op;

        while(!exit){
            System.out.println("\nSeleccione el tipo de sistema operativo:\n");
            System.out.println("1) Android\n");
            System.out.println("2) iOS\n");
            System.out.println("3) Salir.");
            String leido = lector.nextLine();

            try{
                op = Integer.parseInt(leido.trim());
            }
            catch(NumberFormatException e){
                System.out.println("No ingreso un numero.\n\n\n");
                op = -1;
            }

            switch (op) {
                case 1:
                    factory = new AndroidAppFactory();
                    app = new App(factory);
                    app.printInfo();
                    exit = true;
                    break;

                case 2:
                    factory = new IOSAppFactory();
                    app = new App(factory);
                    app.printInfo();
                    exit = true;
                    break;

                case 3:
                    exit = true;
                    break;
            
                default:
                    System.out.println("Ingrese una opcion valida.\n\n\n");
                    break;
            }
        }
    }
}