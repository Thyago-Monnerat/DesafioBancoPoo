package banco;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import cliente.Cliente;
import conta.Conta;
import lombok.Getter;

@Getter
public class Banco{
    private String nome;
    private List<Cliente> listaContas;
    private static Banco instancia;

    public Banco() {
        this.listaContas = new ArrayList<>();
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