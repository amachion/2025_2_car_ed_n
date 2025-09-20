import java.util.Random;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        Random random = new Random();
        do {
            if (random.nextBoolean()) {
                if (pilha.push(random.nextInt(10)))
                    System.out.println("empilhamento realizado com sucesso");
                else {
                    System.out.println("falha no empilhamento");
                };
            }
            else {
                if (!pilha.estaVazia())
                    System.out.println(pilha.pop() + " foi desempilhado");
            }
            System.out.println(pilha);
        } while (!pilha.estaVazia());
    }
}
