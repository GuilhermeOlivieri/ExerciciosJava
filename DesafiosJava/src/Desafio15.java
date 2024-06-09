/*Escreva um programa que leia o peso e a altura de uma pessoa, calcule o IMC e informe a categoria: .
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Desafio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu pedo: ");
        float peso = sc.nextFloat();
        System.out.println("Digite sua altura: ");
        float altura = sc.nextFloat();
        double imc = peso/(Math.pow(altura, 2));

        DecimalFormat df = new DecimalFormat("##.##");


        if (imc<18.5) {
            System.out.println("Seu IMC é: " + df.format(imc) + " e você está abaixo do peso." );
        } else if (imc<24.9) {
            System.out.println("Seu IMC é: " + df.format(imc) + " e você está com o peso normal." );
        } else if (imc<29.9) {
            System.out.println("Seu IMC é: " + df.format(imc) + " e você está com sobrepeso." );
        } else if (imc<34.9) {
            System.out.println("Seu IMC é: " + df.format(imc) + " e você está com Obesidade grau I." );
        } else if (imc<39.9) {
            System.out.println("Seu IMC é: " + df.format(imc) + " e você está com Obesidade grau II." );
        } else {
            System.out.println("Seu IMC é: " + df.format(imc) + " e você está com Obesidade grau III." );
        }
        sc.close();
    }
}

