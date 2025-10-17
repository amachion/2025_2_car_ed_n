public class FilaLigadaProdutos {
    private No primeiro;
    private No ultimo;
    //construtor padrão
    public boolean estaVazia() {
        return primeiro==null;
    }
    public void enfileirar (Produto produto) { //inserção de fim
        No novo = new No(produto);
        if (estaVazia()) primeiro = novo;
        else ultimo.setProximo(novo);
        ultimo = novo;
    }
    public Produto desenfileirar () {
        if (estaVazia()) return null;
        Produto temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) //esvaziou
            ultimo = null;
        return temp;
    }
    @Override 
    public String toString () {
        if (estaVazia()) return "Nao chegou o carregamento";
        String s = "";
        No atual = primeiro;
        while (atual != null) {
            s += atual.getInfo() + " -> ";
            atual = atual.getProximo();
        }
        return s + "//";
    }
}
