package banco;


import java.util.LinkedHashSet;
import java.util.Set;
import cliente.Cliente;
import lombok.Getter;

@Getter
public class Banco{
    private String nome;
    private Set<Cliente> listaContas;
    private static Banco instancia;

    public Banco() {
        this.listaContas = new LinkedHashSet<>();
    }

    public static Banco getInstancia(){
        if(instancia == null){
            instancia = new Banco();
        }
        return instancia;
    }

    public void apagarConta(Cliente cliente){
        if(listaContas.isEmpty()){
            throw new NullPointerException("Lista Vazia");
        }else{
            listaContas.remove(cliente);
        }
    }

    public void registrarCliente(Cliente cliente){
        listaContas.add(cliente);
    };

}