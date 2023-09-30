import java.util.Scanner;

public class Faltas {
    private double nota1;
    private double nota2;
    private int faltas;

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public int getFaltas() {
        return faltas;
    }

    public void resultado() {
        if (faltas > 7) {
            System.out.println("Infelizmente, o aluno foi reprovado por excesso de faltas.");
        } else {
            double media = (nota1 + nota2) / 2;
            System.out.println("Média: " + media);

            if (media >= 7.0) {
                System.out.println("Parabéns! O aluno foi aprovado!");
            } else if (media < 7.0) {
                double notaNecessaria = 7.0 - media;
                System.out.println("Infelizmente o aluno está em recuperação, precisa pontuar mais " + notaNecessaria + " para passar.");
            } else {
                System.out.println("Lamento, mas o aluno foi reprovado!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Faltas nota = new Faltas();

        System.out.print("Informe a nota 1: ");
        double nota1 = scanner.nextDouble();
        nota.setNota1(nota1);

        System.out.print("Informe a nota 2: ");
        double nota2 = scanner.nextDouble();
        nota.setNota2(nota2);

        System.out.print("Informe o número de faltas: ");
        int faltas = scanner.nextInt();
        nota.setFaltas(faltas);

        nota.resultado();
        scanner.close();
    }
}

