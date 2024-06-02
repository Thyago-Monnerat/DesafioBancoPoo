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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listaContas == null) ? 0 : listaContas.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Banco other = (Banco) obj;
        if (listaContas == null) {
            if (other.listaContas != null)
                return false;
        } else if (!listaContas.equals(other.listaContas))
            return false;
        return true;
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