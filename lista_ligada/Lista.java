public class Lista {
    private No primeiro;
    //construtor é só o padrão
    //não teremos get e set, pois o atributo primeiro não é de interesse externo
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        No novoNo = new No(info);
        if (!estaVazia()) {
            novoNo.setProximo(primeiro);
        }
        primeiro = novoNo;
    }
    public int removeInicio () {
        if (estaVazia()) return -1;
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
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
        if (estaVazia()) {
            primeiro = novoNo;
        }
        else {
            No atual = primeiro;
            while (atual.getProximo() != null) { //vai até o último
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
    }
    public int removeFim() {
        if (estaVazia()) {
            return -1;
        }
        else if (primeiro.getProximo() == null) {//tem um só
            int temp = primeiro.getInfo();
            primeiro = null; //esvaziou a lista
            return temp;
        }
        else {
            No atual = primeiro;
            while (atual.getProximo().getProximo() != null) {
                atual = atual.getProximo();
            }
            int temp = atual.getProximo().getInfo();
            atual.setProximo(null);
            return temp;
        }
    }
}
