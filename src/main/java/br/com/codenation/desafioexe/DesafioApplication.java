package br.com.codenation.desafioexe;

import java.util.List;
import java.util.ArrayList;

public class DesafioApplication {	

    public static List<Integer> fibonacci() {		
        List<Integer> serie = new ArrayList<>();
        Integer anterior = 1, atual = 0, proximo = 0;
        do {
            serie.add(proximo);
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        } while (anterior <= 350);
        return serie;
    }

    public static boolean isFibonacci(Integer num) {
        return fibonacci().contains(num);
    }

    public static void main(String[] args) {
        for (Integer num : fibonacci()) {
            System.out.printf("%d ", num);
        }        
    }
}