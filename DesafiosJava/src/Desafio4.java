/*Escreva um programa que leia três lados de um triângulo e verifique se eles formam um triângulo válido. Para isso, a soma de dois lados deve ser sempre maior que o terceiro lado.
 */
import java.util.Scanner;
public class Desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triangulo: ");
        float valor = sc.nextInt();
        System.out.println("Digite o segundo lado do triangulo: ");
        float valor2 = sc.nextInt();
        System.out.println("Digite o terceiro lado do triangulo: ");
        float valor3 = sc.nextInt();
        if((valor > (valor2+valor3)) || (valor2 > (valor+valor3)) || (valor3 > (valor2+valor))) {
            System.out.println("Não Da para formar um triangulo");
        }
        else  {
            System.out.println(" Da para formar um triangulo");
        }
        sc.close();

    }
}
