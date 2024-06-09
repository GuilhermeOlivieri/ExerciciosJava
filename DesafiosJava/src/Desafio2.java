/*Escreva um programa que leia um número inteiro e informe se ele é positivo, negativo ou zero.
 */
import java.util.Scanner;
public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        if(valor<0){
            System.out.println(valor + " é negativo");
        } else if (valor>0){
            System.out.println(valor + "é positivo");
        }
        else {
            System.out.println("O número é o zero");
        }
        sc.close();

    }
}
