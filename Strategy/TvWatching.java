public class TvWatching implements WatchingStrategy {

    @Override
    public void watching(String name) {
        System.out.println("\n--------- TV ---------\n");
        System.out.println("Viendo la serie: " + name + " por TV.\n");
    }
}