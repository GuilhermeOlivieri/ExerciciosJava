/*Escreva um programa que leia um número inteiro e informe se ele é par ou ímpar.
 */
import java.util.Scanner;
public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        if((valor%2) == 0) {
            System.out.println( valor + " é par");
        }
        else {
            System.out.println( valor + " é impar");
        }
        sc.close();

    }
}
