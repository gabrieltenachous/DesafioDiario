/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.Scanner;

/**
 *
 * Dada uma lista de números e um número k, retorne se dois números da lista
 * somam k. Por exemplo, dados [10, 15, 3, 7] e k de 17, retorne verdadeiro,
 * pois 10 + 7 é 17. Bônus: você pode fazer isso de uma só vez?
 *
 * @author gabri
 */
public class Desafio_01 {

    public static boolean somaK(int k) {
        int[] lista = {10, 15, 1, 1};
        int test = 0;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < i; j++) {
                test = lista[i] + lista[j];
                if (test == k) {

                    System.out.println("Porque:" + lista[i] + " + " + lista[j] + " = " + test);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(somaK(2));
    }

}
