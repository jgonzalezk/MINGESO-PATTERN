import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("-> Ingese la serie que desea ver: ");
        Scanner lector = new Scanner(System.in);
        String name = lector.nextLine();

        //Estrategia TV
        WatchingContext context = new WatchingContext();
        context.setWatchingMethod(new TvWatching());
        context.watchingSerie(name);

        //Estrategia Internet
        System.out.println("\n\n");
        context.setWatchingMethod(new InternetWatching());
        context.watchingSerie(name);
    }
}