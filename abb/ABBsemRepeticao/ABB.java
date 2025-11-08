public class ABB {
    private No raiz;

    public boolean estaVazia() {
        return raiz == null;
    }

    public void insere(int i) {
        if (estaVazia())
            raiz = new No(i);
        else
            insereRec(raiz, i);
    }

    private void insereRec (No atual, int i) {
        if (i == atual.getInfo()) {
            atual.setOcorrencias(atual.getOcorrencias() + 1);
        }
        else if (i>atual.getInfo()){
            if (atual.getDireita() == null) {
                No novo = new No(i);
                atual.setDireita(novo);
            } else
                insereRec(atual.getDireita(), i);
        }
        else {
            if (atual.getEsquerda() == null) {
                No novo = new No(i);
                atual.setEsquerda(novo);
            } 
            else
                insereRec(atual.getEsquerda(), i);
        }
    }
    public String percorreEmOrdem () {
        if (estaVazia()) return "arvore vazia";
        return percorreEmOrdemRec(raiz);
    }
    private String percorreEmOrdemRec (No atual) {
        if (atual != null)
            return 
                percorreEmOrdemRec(atual.getEsquerda()) + 
                atual + " " +
                percorreEmOrdemRec(atual.getDireita());
        else 
            return "";
    }
    public boolean buscaBinaria (int i) {
        if (estaVazia()) return false;
        return buscaBinariaRec(i, raiz);
    }
    private boolean buscaBinariaRec (int i, No atual) {
        if (i == atual.getInfo()) return true;
        if (i > atual.getInfo()) {
            if (atual.getDireita() == null) return false;
            return buscaBinariaRec(i, atual.getDireita());
        }
        else {
            if (atual.getEsquerda() == null) return false;
            return buscaBinariaRec(i, atual.getEsquerda());
        }
    }
    public int altura () {
        if (estaVazia()) return -1;
        return altura_rec (raiz);
    }
    private int altura_rec (No atual) {
        if (atual == null) return -1;
        int altEsq = altura_rec(atual.getEsquerda());
        int altDir = altura_rec(atual.getDireita());
        return altEsq > altDir ? altEsq + 1 : altDir + 1;
    }
    public int contarNos() {
        return contarNosRec(raiz);
    }
    private int contarNosRec(No atual) {
        if (atual == null) {
            return 0;
        } 
        else {
            return 1 + contarNosRec(atual.getEsquerda()) + contarNosRec(atual.getDireita());
        }
    }
}

