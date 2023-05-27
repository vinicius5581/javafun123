package OsmarDeViniciusPS;

public class Professor extends Pessoa {
    private String matricula;

    public Professor(String nome, int ano_nascimento, String email, String matricula) {
        super(nome, ano_nascimento, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return super.getOsmarDeViniciusNome();
    }
}