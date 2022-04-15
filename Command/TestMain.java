public class TestMain {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("Musica de pana");

        AddSongImp agregarCancion1 = new AddSongImp(playlist, "New Born - Muse");
        AddSongImp agregarCancion2 = new AddSongImp(playlist, "R U Mine? - Artic Monkeys");
        AddSongImp agregarCancion3 = new AddSongImp(playlist, "Dare - Gorillaz");
        RemoveSongImp removerCancion = new RemoveSongImp(playlist, "R U Mine? - Artic Monkeys");

        Invoker invoker = new Invoker();
        invoker.recibirComando(agregarCancion1);
        invoker.recibirComando(agregarCancion2);
        invoker.recibirComando(agregarCancion3);
        invoker.recibirComando(removerCancion);

        invoker.ejecutarComandos();
    }
}