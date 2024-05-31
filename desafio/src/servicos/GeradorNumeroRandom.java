package servicos;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import lombok.Getter;

@Getter
public class GeradorNumeroRandom {
    private int conta;
    private int digito;
    private Set<Integer> listaNumeros;

    public GeradorNumeroRandom() {
        this.listaNumeros = new HashSet<>();
    }

    protected int gerador(int tamanho) {
        Random random = new Random();
        StringBuilder numeroConta = new StringBuilder();
        for(int i=0;i<tamanho;i++){
            numeroConta.append(random.nextInt(10));
        }

        try{
            listaNumeros.add(Integer.parseInt(numeroConta.toString()));
            return Integer.parseInt(numeroConta.toString());   
        }catch(Exception e){
            gerador(tamanho);
        }
        return 0;
    }

}
