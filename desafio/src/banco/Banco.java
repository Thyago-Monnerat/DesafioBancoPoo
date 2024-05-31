package banco;


import java.util.HashMap;
import java.util.Map;
import cliente.Cliente;
import conta.Conta;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Banco{
    private String nome;
    private Map<Integer, Cliente> listaContas;
    private Conta contaNova;
    private static Banco instancia;

    public Banco() {
        this.listaContas = new HashMap<>();
    }

    public static Banco getIntancia(){
        if(instancia == null){
            instancia = new Banco();
        }
        return instancia;
    }

    public void apagarConta(int id){
        if(listaContas.isEmpty()){
            throw new NullPointerException("Lista Vazia");
        }else{
            listaContas.remove(id);
        }
    }

    public void registrarCliente(Cliente cliente){
        listaContas.put(cliente.getId(), cliente);
    };

}