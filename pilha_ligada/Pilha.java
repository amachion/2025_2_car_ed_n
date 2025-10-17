public class Pilha {
    private No primeiro;
    //construtor é só o padrão
    //não teremos get e set, pois o atributo primeiro não é de interesse externo
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void push (int info) {
        No novoNo = new No(info);
        if (!estaVazia())
            novoNo.setProximo(primeiro);
        primeiro = novoNo;
    }
    public int pop () {
        if (estaVazia()) return -1;
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return temp;
    }
    @Override
    public String toString () {
        String s = "";
        if (estaVazia()) s += "pilha vazia";
        else {
            No atual = primeiro;
            while (atual != null) { //vai até o fim
                s = s + atual + " -> ";
                atual = atual.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
}
