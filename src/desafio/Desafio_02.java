/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

/**
 *
 * #2 Dada uma matriz de números inteiros, retorne uma nova matriz, de modo que
 * cada elemento no índice i da nova matriz seja o produto de todos os números
 * da matriz original, exceto o de i. Por exemplo, se nossa entrada fosse [1, 2,
 * 3, 4, 5], a saída esperada seria [120, 60, 40, 30, 24]. Se nossa entrada
 * fosse [3, 2, 1], a saída esperada seria [2, 3, 6].
 *
 * @author gabri
 */
public class Desafio_02 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        novaMatriz(n, arr);
    }
     public static void novaMatriz(int  n, int[] arr) { 
        if(n==1){
            System.out.println(0);
        }
        
        int left[]  = new int[n];
        int right[] = new int[n];
        int prod[] = new int[n];
        
        int i,j;
        
        left[0] =1;
        right[n-1]=1;
        //1 2 3 4 5
        for(i=1;i<n;i++){
            //left: 1 - 2 - 5 - 20 - 100
            left[i]=arr[i-1]*left[i-1];
        }
        //5 - 20 - 
        for(j=n-2;j>=0;j--){
            right[j] = arr[j+1]*right[j+1];
             
        }
        for(i=0;i<n;i++){
            prod[i]=left[i]*right[i];
        }
        for (i = 0; i < n; i++) 
            System.out.print(prod[i] + " "); 
    }  
}
