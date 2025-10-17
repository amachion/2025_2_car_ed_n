import java.util.Scanner;

public class Almoxarifado {
    
    public static void main(String[] args) {
        Produto[] prateleira = new Produto[100];
        FilaLigadaProdutos esteira = new FilaLigadaProdutos();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            System.out.println("digite o codigo");
            int codigo = scanner.nextInt();
            System.out.println("digite o nome");
            scanner.nextLine();
            String nome = scanner.nextLine();
            Produto p = new Produto(codigo, nome);
            esteira.enfileirar(p);
        }
        System.out.println("Esteira pronta:");
        System.out.println(esteira);
        int i =0;
        System.out.println ("\nindo para prateleira:");
        while (!esteira.estaVazia()) {
            Produto p = esteira.desenfileirar();
            System.out.println("quanto chegou de " + p.getNome());
            int quantidade = scanner.nextInt();
            p.atualizaEstoque(quantidade);
            prateleira[i++] = p;
        }
        System.out.println("prateleira arrumada:");
        for (int j=0; j < i; j++) {
            System.out.println("posicao " + j + ": " + prateleira[j]);
        }
        scanner.close();
    }
}
