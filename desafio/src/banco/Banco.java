package banco;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import cliente.Cliente;
import conta.Conta;
import conta.Corrente;
import conta.Poupanca;
import lombok.Getter;
import lombok.ToString;
import servicos.GeradorNumeroRandom;


@Getter
@ToString
public class Banco extends GeradorNumeroRandom{
    private String nome;
    private Map<Integer, Conta> listaContas;

    public Banco(String nome) {
        this.nome = nome;
        this.listaContas = new HashMap<>();
    }

    public void apagarConta(int id){
        if(listaContas.isEmpty()){
            throw new NullPointerException("Lista Vazia");
        }else{
            listaContas.remove(id);
        }
    }

    public void criarConta(boolean tipo){
        Cliente cliente = new Cliente(gerador(7), "Thyago", LocalDate.of(2000, 7, 12), 33333333333l);
        Conta contaNova;

        if(tipo){
            contaNova = new Corrente(this.getNome(), cliente.getId() / 1000, cliente.getId() % 1000, "BR", cliente);
        }else{
            contaNova = new Poupanca(this.getNome(), cliente.getId() / 1000, cliente.getId() % 1000, "BR", cliente);
        }
        
        listaContas.put(gerador(6), contaNova);
    };

    public static void main(String[] args) {
        Banco banco = new Banco("Bancola");

        banco.criarConta(true);
        
        System.out.println(banco.getListaContas());
    }
}