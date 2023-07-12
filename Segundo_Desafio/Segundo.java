package Desafios_Supera.Segundo_Desafio;

import java.util.*;

public class Segundo {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] notas = {100., 50., 20., 10., 5., 2.};
        double[] moedas = {1., 0.5, 0.25, 0.1, 0.05, 0.01};

        int[] qNotas = new int[notas.length];
        int[] qMoedas = new int[moedas.length];

        double n = in.nextDouble();

        for(int i = 0; i < notas.length; i++) {
            while(n >= notas[i]){
                n -= notas[i];
                qNotas[i]++;
            }
        }
        for(int i = 0; i < moedas.length; i++) {
            while(n >= moedas[i]){
                n -= moedas[i];
                qMoedas[i]++;
            }
        }

        System.out.println("NOTAS:");
        print(notas, qNotas, "nota");

        System.out.println("MOEDAS:");
        print(moedas, qMoedas, "moeda");
    }

    public static void print(double[] n, int[] q, String type) {
        for(int i = 0; i < n.length; i++){
            System.out.println(q[i] + "   " + type + "(s)   de   R$   " + n[i]);
        }
    }
}
