public class Lista {
    private No primeiro;
    private No ultimo;

    //construtor é só o padrão
    //não teremos get e set, pois os atributos primeiro e último não são de interesse externo
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        No novoNo = new No(info);
        if (estaVazia()) {
            ultimo = novoNo;
        }
        else {
            novoNo.setProximo(primeiro);
        }
        primeiro = novoNo;
    }
    public int removeInicio () {
        if (estaVazia()) return -1;
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (estaVazia()) //esvaziou a lista = if (primeiro == null)
            ultimo = null;
        return temp;
    }
    @Override
    public String toString () {
        String s = "";
        if (estaVazia()) s += "lista vazia";
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
    public void insereFim (int info) {
        No novoNo = new No(info);
        if (estaVazia())
            primeiro = novoNo;
        ultimo = novoNo;
    }
    public int removeFim() {
        if (estaVazia()) return -1;
        if (primeiro == ultimo) {//tem um só
            int temp = primeiro.getInfo();
            primeiro = null; //esvaziou a lista
            ultimo = null;
            return temp;
        }
        else {
            No atual = primeiro;
            while (atual.getProximo().getProximo() != null) { //vai até o penúltimo
                atual = atual.getProximo();
            }
            int temp = ultimo.getInfo();
            ultimo = atual;
            atual.setProximo(null);
            return temp;
        }
    }
}
