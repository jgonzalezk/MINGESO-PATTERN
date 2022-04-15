import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> comandos = new ArrayList<>();

    public void recibirComando(Command comando){
        this.comandos.add(comando);
    }

    public void ejecutarComandos() {
        this.comandos.forEach(x-> x.execute());
        this.comandos.clear();
    }
}
