public class Clock {
    private String nombre;
    private String version;
    private String zona;

    public Clock(String nombre, String version, String zona) {
        this.nombre = nombre;
        this.version = version;
        this.zona = zona;
    }

    public String getNombre() {
        return nombre;
    }
    public String getVersion() {
        return version;
    }
    public String getZona() {
        return zona;
    }
}
