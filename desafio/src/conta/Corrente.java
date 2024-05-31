package conta;

import cliente.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString(callSuper = true)
public class Corrente  extends Conta{
    @Getter
    @Setter
    private double chequeEsp;

    public Corrente(String banco, int numero, int digito, String local, Cliente cliente) {
        super(banco, numero, digito, local, cliente);
    }

    
}
