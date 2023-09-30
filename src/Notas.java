import java.util.Scanner;

class Notas2 {
    private double nota1;
    private double nota2;

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void resultado() {
        double media = (nota1 + nota2) / 2;
        System.out.println("A nota média é: " + media);

        if (media >= 7.0) {
            System.out.println("Parabéns! O aluno foi aprovado!");
        } else if (media <7.0) {
            double notaNecessaria = 7.0 - media;
            System.out.println("Infelizmente o aluno está em recuperação, precisa pontuar mais " + notaNecessaria + " na avaliação.");
        } else {
            System.out.println("Lamento, mas o aluno foi reprovado!");
        }
    }

    public static void main(String[] args) {
        Scanner valorNota = new Scanner(System.in);
        Faltas nota = new Faltas();

        System.out.print("Digite a nota 1: ");
        double nota1 = valorNota.nextDouble();
        nota.setNota1(nota1);

        System.out.print("Digite a nota 2: ");
        double nota2 = valorNota.nextDouble();
        nota.setNota2(nota2);

        nota.resultado();
        valorNota.close();
    }
}


