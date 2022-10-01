import java.util.Scanner;

public class MediaNota {
    public static void main(String[]Args){
        double media, mediaRec;
        Scanner input = new Scanner (System.in);

        System.out.println("Digite nota 1: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite nota 2: ");
        double nota2 = input.nextDouble();

        media = (nota1+nota2)/2;

        if(media >= 6){
            System.out.println("Aluno(a) aprovado com 2 "+ media +" de media");
        }
        else{
            System.out.println("Aluno(a) reprovado com "+ media +" de nota");

            System.out.println("Digite nota de recuperacao: ");
            double notaRec = input.nextDouble();

            mediaRec = (media + notaRec)/2;

            if(mediaRec >= 6){
                System.out.println("Aluno(a) aprovado com "+ mediaRec +" de media de recuperacao");
            }
            else{
                System.out.println("Aluno(a) reprovado com "+ mediaRec +" de nota de recuperacao");
            }
        }
    }
}
