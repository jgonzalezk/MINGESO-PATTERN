public class RemoveSongImp implements Command {
    private Playlist playlist;
    private String cancion;

    public RemoveSongImp(Playlist playlist, String cancion){
        this.playlist = playlist;
        this.cancion = cancion;
    }

    @Override
    public void execute(){
        this.playlist.eliminar(cancion);
    }
}
