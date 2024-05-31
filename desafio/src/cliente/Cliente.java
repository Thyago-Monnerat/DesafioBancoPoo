package cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import excecoes.MenorIdadeException;

@Getter
@Setter
public class Cliente {
    private int id;
    private String nome;
    private LocalDate dataNasc;
    private Long cpf;

    public Cliente(int id, String nome, LocalDate dataNasc, Long cpf) {
        this.id = id;
        this.nome = nome;

        if(Period.between(dataNasc, LocalDate.now()).getYears() < 18){
            throw new MenorIdadeException();
        }else{
            this.dataNasc = dataNasc;
        }
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nId= " + id + "\nNome= " + nome + "\nData de nascimento= " + dataNasc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nCPF= " + cpf + "\n";
    }

    
}
