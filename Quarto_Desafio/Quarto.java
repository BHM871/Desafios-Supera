package Desafios_Supera.Quarto_Desafio;

import java.util.*;

public class Quarto {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] txts = new String[n];
        
        in.nextLine();
        for(int i = 0; i < txts.length; i++) {
            txts[i] = in.nextLine();
        }

        for(String txt : txts) {
            txt = correct(txt);
            System.out.println(txt);
        }
    }

    public static String correct(String txt) {
        String out = "";

        int m = txt.length() / 2; 
        String initial = txt.substring(0, m);
        String finall = txt.substring(m);

        out += invert(initial);
        out += invert(finall);

        return out;
    }

    public static String invert(String txt) {
        String temp = "";

        for(int i = txt.length() - 1; i >= 0; i--) {
            temp += txt.charAt(i);
        }

        return temp;
    }
}