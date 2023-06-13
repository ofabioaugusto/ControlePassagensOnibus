// Classe Bilhete
public class Bilhete {
    private Passageiro passageiro;
    private Viagem viagem;
    
    // Construtor
    public Bilhete(Passageiro passageiro, Viagem viagem) {
        this.passageiro = passageiro;
        this.viagem = viagem;
    }
    
    // Getters e Setters
    public Passageiro getPassageiro() {
        return passageiro;
    }
    
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    
    public Viagem getViagem() {
        return viagem;
    }
    
    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }
}