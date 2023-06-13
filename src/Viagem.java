// Classe Viagem
public class Viagem {
    private String origem;
    private String destino;
    private String data;
    
    // Construtor
    public Viagem(String origem, String destino, String data) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }
    
    // Getters e Setters
    public String getOrigem() {
        return origem;
    }
    
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
}
