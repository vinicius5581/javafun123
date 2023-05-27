package OsmarDeViniciusPS;

public class OsmarDeVinicius extends Pessoa {
    private String identidade;

    public OsmarDeVinicius(String osmarDeViniciusNome, int ano_nascimento, String email, String identidade) {
        super(osmarDeViniciusNome, ano_nascimento, email);
        this.identidade = identidade;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    @Override
    public String getOsmarDeViniciusNome() {
        return super.getOsmarDeViniciusNome();
    }
}