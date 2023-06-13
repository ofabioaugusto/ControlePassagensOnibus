// Classe Passageiro
public class Passageiro {
    private String nome;
    private String cpf;
    
    // Construtor
    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCPF() {
        return cpf;
    }
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
}