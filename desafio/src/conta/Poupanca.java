package conta;

import cliente.Cliente;
import lombok.ToString;


@ToString(callSuper = true)
public class Poupanca extends Conta{
    public Poupanca(String banco, int numero, int digito, String local, Cliente cliente) {
        super(banco, numero, digito, local, cliente);
    }

}
