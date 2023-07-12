package Desafios_Supera.Primeiro_Desafio;

import java.util.*;

public class Primeiro {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Integer[] numbers = new Integer[n];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);
        
        print(0, numbers);

        Arrays.sort(numbers, Collections.reverseOrder());

        print(1, numbers);
    }

    public static void print(int key, Integer[] arr) {
        for(int num : arr){
            if(num % 2 == key){
                System.out.println(num);
            }
        }
    }
}

            