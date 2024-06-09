/*Escreva um programa que leia três notas de um aluno e calcule a média. Informe se o aluno está aprovado (média >= 7), em recuperação (5 <= média < 7) ou reprovado (média < 5).
 */
import java.util.Scanner;
public class Desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno: ");
        int nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota do aluno: ");
        int nota2 = sc.nextInt();
        System.out.println("Digite a terceira nota do aluno: ");
        int nota3 = sc.nextInt();


        double Media = sc.nextDouble();
        Media = ((nota1 + nota2 + nota3)/ 3);

        if(Media>=7){
            System.out.println("O aluno está aprovado, com a media de " + Media);
        } else if ((5<=Media) && (Media<7)){
            System.out.println("O aluno está de recuperação, com a media de " + Media);
        }
        else {
            System.out.println("O aluno está reprovado, com a media de " + Media);
        }

        sc.close();

    }
}