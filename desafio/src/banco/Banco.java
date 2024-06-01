package banco;


import java.util.HashMap;
import java.util.Map;
import cliente.Cliente;
import conta.Conta;
import lombok.Getter;
import lombok.ToString;

@Getter
public class Banco{
    private String nome;
    private Map<Cliente, Conta> listaContas;
    private static Banco instancia;

    public Banco() {
        this.listaContas = new HashMap<>();
    }

    public static Banco getInstancia(){
        if(instancia == null){
            instancia = new Banco();
        }
        return instancia;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + "\nLista de Contas=" + listaContas + "\n";
    }

    public void apagarConta(int id){
        if(listaContas.isEmpty()){
            throw new NullPointerException("Lista Vazia");
        }else{
            listaContas.remove(id);
        }
    }

    public void registrarCliente(Cliente cliente){
        listaContas.put(cliente, cliente.getConta());
    };

}