public class Alunos {
    private double nota;
// usei o this para diferenciar classe e parametro de construtores
    public Alunos(double nota) {
        this.nota = nota;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
}

class Aluno {
    private String nome;
    private String curso;
    private Alunos avaliacao;

    public Aluno(String nome, String curso, Alunos avaliacao) {
        this.nome = nome;
        this.curso = curso;
        this.avaliacao = avaliacao;
    }
// confundi um pouco set e get, mas deppois lembrei que get verifica e set altera
    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public Alunos getAvaliacao() {
        return avaliacao;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Nota da avaliação: " + avaliacao.getNota());
    }

    public static void main(String[] args) {
        // nova avaliação
        Alunos avaliacao1 = new Alunos(10);

        // novo aluno
        Aluno aluno1 = new Aluno("Maiara", "Scrum Master", avaliacao1);

        // informações do aluno
        aluno1.imprimirInformacoes();
    }
}
