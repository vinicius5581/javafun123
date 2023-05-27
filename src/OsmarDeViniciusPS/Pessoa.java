package OsmarDeViniciusPS;

public class Pessoa {
    private String osmarDeViniciusNome;
    private int ano_nascimento;
    private String email;

    public Pessoa() {
        // Construtor vazio
    }

    public Pessoa(String osmarDeViniciusNome, int ano_nascimento, String email) {
        this.osmarDeViniciusNome = osmarDeViniciusNome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }

    public String getOsmarDeViniciusNome() {
        return osmarDeViniciusNome;
    }

    public void setOsmarDeViniciusNome(String osmarDeViniciusNome) {
        this.osmarDeViniciusNome = osmarDeViniciusNome;
    }

    public int getAnoNascimento() {
        return ano_nascimento;
    }

    public void setAnoNascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mensagem() {
        System.out.println("Olá, eu sou " + osmarDeViniciusNome + "!");
    }

    public void mensagem(String msg) {
        System.out.println(msg);
    }
}