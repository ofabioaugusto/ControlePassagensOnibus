import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaControlePassagens {
    private List<Bilhete> bilhetes;
    
    // Construtor
    public SistemaControlePassagens() {
        bilhetes = new ArrayList<>();
    }
    
    // Método para comprar uma passagem
    public void comprarPassagem() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Comprar Passagem ===");
        
        System.out.print("Nome do passageiro: ");
        String nome = scanner.nextLine();
        
        System.out.print("CPF do passageiro: ");
        String cpf = scanner.nextLine();
        
        Passageiro passageiro = new Passageiro(nome, cpf);
        
        System.out.print("Origem: ");
        String origem = scanner.nextLine();
        
        System.out.print("Destino: ");
        String destino = scanner.nextLine();
        
        System.out.print("Data: ");
        String data = scanner.nextLine();
        
        Viagem viagem = new Viagem(origem, destino, data);
        
        Bilhete bilhete = new Bilhete(passageiro, viagem);
        bilhetes.add(bilhete);
        
        System.out.println("Passagem comprada com sucesso!");
        System.out.println();
    }
    
    // Método para exibir as passagens compradas
    public void exibirPassagens() {
        System.out.println("=== Passagens Compradas ===");
        
        for (int i = 0; i < bilhetes.size(); i++) {
            Bilhete bilhete = bilhetes.get(i);
            Passageiro passageiro = bilhete.getPassageiro();
            Viagem viagem = bilhete.getViagem();
            
            System.out.println("Passageiro: " + passageiro.getNome());
            System.out.println("CPF: " + passageiro.getCPF());
            System.out.println("Origem: " + viagem.getOrigem());
            System.out.println("Destino: " + viagem.getDestino());
            System.out.println("Data: " + viagem.getData());
            System.out.println();
        }
    }
    
    // Método principal
    public static void main(String[] args) {
        SistemaControlePassagens sistema = new SistemaControlePassagens();
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("=== Sistema de Controle de Passagens de Ônibus ===");
            System.out.println("1. Comprar passagem");
            System.out.println("2. Exibir passagens compradas");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    sistema.comprarPassagem();
                    break;
                case 2:
                    sistema.exibirPassagens();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
