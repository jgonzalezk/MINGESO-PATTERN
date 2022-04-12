public class Calendar {
    private String nombre;
    private String version;

    public Calendar(String nombre, String version) {
        this.nombre = nombre;
        this.version = version;
    }

    public String getNombre() {
        return nombre;
    }
    public String getVersion() {
        return version;
    }
}
