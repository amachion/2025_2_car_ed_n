public class ABB {
    private No raiz;
    //lembremos que temos somente o construtor padrão

    public boolean estaVazia() {
        return raiz == null;
    }
    public void insere (int i) {
        if (estaVazia()) 
            raiz = new No(i);
        else 
            insereRec(raiz, i);
    }
    private void insereRec (No atual, int i) {
        if (i > atual.getInfo()) {//vou para direita
            if (atual.getDireita() == null) {
                No novo = new No(i);
                atual.setDireita(novo);
            }
            else 
                insereRec(atual.getDireita(), i);
        }
        else { //vou para esquerda
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
    public int altura () throws ExcecaoArvoreVazia{
        if (estaVazia()) 
            throw new ExcecaoArvoreVazia("arvore vazia");
        return altura_rec (raiz);
    }
    private int altura_rec (No atual) {
        if (atual == null) return -1;
        int altEsq = altura_rec(atual.getEsquerda());
        int altDir = altura_rec(atual.getDireita());
        // if (altEsq > altDir) return altEsq + 1;
        // return altDir + 1;
        //outra possibilidade
        return altEsq > altDir ? altEsq + 1 : altDir + 1;
        //mais uma
        // return 1 + Math.max(altDir, altEsq);
        // outra
        // return 1 + Math.max(altura_rec(atual.getDireita()), altura_rec(atual.getEsquerda()));
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

class No {
    private int info;
    private No esquerda;
    private No direita;
    public No (int info) {
        this.info = info;
    }
    public No getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
    public No getDireita() {
        return direita;
    }
    public void setDireita(No direita) {
        this.direita = direita;
    }
    public int getInfo() {
        return info;
    }
    @Override
    public String toString() {
        return "[" + info + "]";
    }
}
class ExcecaoArvoreVazia extends Exception {
    public ExcecaoArvoreVazia (String msg) {
        super(msg);
    }
}