/*Escreva um programa que leia dois números inteiros e informe qual deles é o maior.
 */
import java.util.Scanner;
public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        System.out.println("Digite outro valor: ");
        int valor2 = sc.nextInt();
        if(valor<valor2){
            System.out.println(valor2 + " é maior que " + valor);
        } else if (valor>valor2){
            System.out.println(valor + " é maior que " + valor2);
        }
        else {
            System.out.println("Os números digitados são iguais");
        }
        sc.close();

    }
}
