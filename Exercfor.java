/*Faça um programa que imprima os números entre 10 e -10 e diga se o número é ou não é divisor de 3. */


public class Exercfor {
    public static void main(String[] args) {
        for (int i =-10; i<=10; i++) {
            if(i % 3 == 0){
                System.out.printf("%d\n",i);  
            }
        }
    }
}
