public class WatchingContext {

    private WatchingStrategy strategy;

    public void setWatchingMethod(WatchingStrategy strategy) {
        this.strategy = strategy;
    }

    public void watchingSerie(String name) {
        this.strategy.watching(name);
    }
}
