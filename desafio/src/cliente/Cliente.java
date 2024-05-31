package cliente;

import lombok.Getter;
import lombok.Setter;
import servicos.GeradorNumeroRandom;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import banco.Banco;
import conta.Conta;
import conta.Corrente;
import conta.Poupanca;
import excecoes.MenorIdadeException;

@Getter
@Setter
public class Cliente{
    private int id;
    private String nome;
    private LocalDate dataNasc;
    private Long cpf;
    private Conta conta;
    public Banco banco =  Banco.getIntancia();

    public Cliente(int id, String nome, LocalDate dataNasc, Long cpf, boolean tipo) {
        this.id = id;
        this.nome = nome;
        if(tipo){
            this.conta = new Corrente(id / 10000, id % 1000, "BR");
        }else{
            this.conta = new Poupanca(id / 10000, id % 1000, "BR");
        }  
        if(Period.between(dataNasc, LocalDate.now()).getYears() < 18){
            throw new MenorIdadeException();
        }else{
            this.dataNasc = dataNasc;
        }
        this.cpf = cpf;

        banco.registrarCliente(this);
    }

    @Override
    public String toString() {
        return "Id= " + id + "\nNome= " + nome + "\nData de nascimento= " + dataNasc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nCPF= " + cpf + "\n";
    }

    public static void main(String[] args) {
        Banco banco =  Banco.getIntancia();

        Cliente cliente1 = new Cliente(1001001, "Alice", LocalDate.of(1995, 3, 15), 12345678901L, true);
        Cliente cliente2 = new Cliente(1001002, "Bob", LocalDate.of(1990, 8, 21), 23456789012L, false);
        Cliente cliente3 = new Cliente(1001003, "Charlie", LocalDate.of(1988, 12, 5), 34567890123L, true);
        Cliente cliente4 = new Cliente(1001004, "David", LocalDate.of(1997, 5, 9), 45678901234L, false);
        Cliente cliente5 = new Cliente(1001005, "Emma", LocalDate.of(1993, 10, 30), 56789012345L, true);
        Cliente cliente6 = new Cliente(1001006, "Fiona", LocalDate.of(1985, 4, 18), 67890123456L, false);
        Cliente cliente7 = new Cliente(1001007, "George", LocalDate.of(1998, 7, 7), 78901234567L, true);
        Cliente cliente8 = new Cliente(1001008, "Hannah", LocalDate.of(1992, 9, 12), 89012345678L, false);
        Cliente cliente9 = new Cliente(1001009, "Ian", LocalDate.of(1987, 2, 25), 90123456789L, true);
        Cliente cliente10 = new Cliente(1001010, "Jessica", LocalDate.of(1996, 11, 3), 12345098765L, false);
        
        System.out.println(banco.getListaContas());
    }

    
}
