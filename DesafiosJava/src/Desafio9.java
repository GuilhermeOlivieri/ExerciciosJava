/*Escreva um programa que leia o código de um produto e informe a sua categoria:
 */
import java.util.Scanner;
public class Desafio9 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o código do produto:");
    int codigo = sc.nextInt();
    if(codigo<0 || codigo>40){
        System.out.println("Código inválido");
    }else if (codigo<=10) {
        System.out.println("O produto é um Alimento não-perecível.");
    } else if (codigo<=20){
        System.out.println("O produto é um Alimento perecível.");
    } else if (codigo<=30){
        System.out.println("O produto é um Vestuário.");
    } else if (codigo<=40){
        System.out.println("O produto é um Eletrônico.");
    }
    sc.close();
}
}

