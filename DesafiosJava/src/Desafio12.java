/*Escreva um programa que leia um número e verifique se ele é maior que 100. Se não for, informe o dobro desse número.
 */
import java.util.Scanner;
public class Desafio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número aleatório: ");
        int valor = sc.nextInt();
        if (valor<=100) {
            System.out.println( valor + " é menor que 100.");
        } else {
            System.out.println( valor + " é maior que 100, e o seu dobro é: "+ (valor*2));
        }
        sc.close();
    }
}

