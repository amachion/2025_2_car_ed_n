//implementação de pilhas utilizando vetor
public class Pilha {
    private int topo;
    private int[] v;
    public Pilha () {
        this(10);
    }
    public Pilha (int capacidade) {
        topo = -1;
        v = new int[capacidade];
    }
    public boolean estaVazia () {
        return topo == -1;
        //return topo == -1 ? true : false;
    }
    public boolean estacheia () {
        return topo == v.length - 1;
    }
    public boolean push (int elemento) {
        if (estacheia()) return false;
        v[++topo] = elemento;
        return true;
    }
    public int pop() {
        int aux = v[topo--];
        return aux;
    }
    public int tamanho () {
        return topo+1;
    }
    @Override
    public String toString () {
        String s = "";
        if (estaVazia()) s += "esta vazia\n";
        else
            for (int i=topo; i>=0; i--)
                s += v[i] + "\n";
        return s + "----------\n";
    }
}