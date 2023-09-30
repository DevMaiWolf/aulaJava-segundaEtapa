import java.text.DecimalFormat;
import java.util.InputMismatchException;
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

    public static double obterNotaValida(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print(mensagem);
                nota = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine(); // limpa buffer do teclado
            }
        } while (!entradaValida);

        return nota;
    }

    public static void main(String[] args) {
        double nota1 = obterNotaValida("Digite a nota 1: ");
        double nota2 = obterNotaValida("Digite a nota 2: ");
        double nota3 = obterNotaValida("Digite a nota 3: ");

        Medias medias = new Medias(nota1, nota2, nota3);

        double mediaAritmetica = medias.calcularMediaAritmetica();
        double mediaPonderada = medias.calcularMediaPonderada();
        // aprendendo ainda a lidar com o formato deciaml
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("A Média Aritmética obtida é: " + df.format(mediaAritmetica));
        System.out.println("A Média Ponderada obtida é: " + df.format(mediaPonderada));
    }
}
