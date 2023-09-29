import java.text.DecimalFormat;
import java.util.Scanner;

class Medias {
    private double nota1;
    private double nota2;
    private double nota3;

// usei o this para deixar claro que me refiro à classe e não ao parâmetro do método
    public Medias(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMediaAritmetica() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public double calcularMediaPonderada() {
        return (2 * nota1 + 3 * nota2 + 4 * nota3) / (2 + 3 + 4);
    }

    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = notas.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = notas.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = notas.nextDouble();

        notas.close();

        Medias medias = new Medias(nota1, nota2, nota3);

        double mediaAritmetica = medias.calcularMediaAritmetica();
        double mediaPonderada = medias.calcularMediaPonderada();

// aprendendo ainda a lidar com o formato deciaml
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("A Média Aritmética obtida é: " + df.format(mediaAritmetica));
        System.out.println("A Média Ponderada obtida é: " + df.format(mediaPonderada));
    }
}
