public class AddSongImp implements Command {
    private Playlist playlist;
    private String cancion;

    public AddSongImp(Playlist playlist, String cancion){
        this.playlist = playlist;
        this.cancion = cancion;
    }

    @Override
    public void execute(){
        this.playlist.agregar(this.cancion);
    }
}
