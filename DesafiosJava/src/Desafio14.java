/*Escreva um programa que leia um número e informe se ele é positivo ou negativo. Se for positivo, calcule a raiz quadrada; se for negativo, informe o número ao quadrado.
 */
import java.util.Scanner;
public class Desafio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número aleatório: ");
        float valor = sc.nextFloat();
        if (valor<0) {
            System.out.println( valor + " ao quadrado é: "+ (Math.pow(valor, 2)));
        } else {
            System.out.println("A raiz quadrada de " + valor + "é: "+ Math.sqrt(valor));
        }
        sc.close();
    }
}

