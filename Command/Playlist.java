import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nombre;
    private List lista;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.lista = new ArrayList<>();
    }

    public void agregar (String cancion){
        this.lista.add(cancion);
        System.out.println("Se agrego la cancion: " + cancion + " a la playlist " + this.nombre);        
    }

    public void eliminar (String cancion){
        try {
            this.lista.remove(cancion);
            System.out.println("Se elimino la cancion: " + cancion + " de la playlist " + this.nombre);

        } catch (Exception e) {
            System.out.println("No se encontro la cancion en la playlist.");
        }
    }
}
