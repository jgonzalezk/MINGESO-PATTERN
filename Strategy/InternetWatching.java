public class InternetWatching implements WatchingStrategy {
    
    @Override
    public void watching(String name) {
        System.out.println("\n--------- INTERNET ---------\n");
        System.out.println("Viendo la serie: " + name + " por INTERNET.\n");
    }
}
