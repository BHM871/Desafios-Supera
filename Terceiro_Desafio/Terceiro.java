package Desafios_Supera.Terceiro_Desafio;

import java.util.*;

public class Terceiro {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n, k, r;
        n = in.nextInt();
        k = in.nextInt();
        r = 0;

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for(int num : arr) {
            for(int numI : arr) {
                if(num - numI == k) {
                    r++;
                }
            }
        }

        System.out.println(r);
    }
}