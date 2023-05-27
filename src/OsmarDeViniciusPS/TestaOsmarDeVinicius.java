package OsmarDeViniciusPS;

public class TestaOsmarDeVinicius {
    public static void main(String[] args) {
        // Criação de objetos
        OsmarDeVinicius osmar = new OsmarDeVinicius("Osmar de Vinicius", 1981, "vinicisu@example.com", "123456789");
        OsmarDeVinicius rian = new OsmarDeVinicius("Rian", 2003, "vinicius@example.com", "123456789");
        OsmarDeVinicius ayla = new OsmarDeVinicius("Ayla", 2022, "ayla@example.com", "123456789");
        Professor professor = new Professor("Fernanda", 1987, "rian@example.com", "987654321");
        
        Pessoa zette = new Pessoa();
        
        System.out.println(zette);
        
        zette.setOsmarDeViniciusNome("Zette");
        
        System.out.println(zette.getOsmarDeViniciusNome());
        System.out.println(zette.getAnoNascimento());
        
        zette.setAnoNascimento(1955);
        
        System.out.println(zette.getAnoNascimento());
        
        
        // Teste dos métodos
//        System.out.println("Nome do Osmar: " + osmar.getOsmarDeViniciusNome());
//        System.out.println("Matrícula do Professor: " + professor.getMatricula());
//        System.out.println("Identidade do Osmar: " + osmar.getIdentidade());

        // Chama o método mensagem() da classe Pessoa
//        osmar.mensagem(); 
        
        // Chama o método mensagem(String msg) da classe Pessoa
//        professor.mensagem("Olá!");
    }
}