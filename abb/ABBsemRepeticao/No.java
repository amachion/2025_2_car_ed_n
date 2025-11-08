public class No {
    private int info;
    private int ocorrencias;
    private No esquerda;
    private No direita;
    public No (int info) {
        this.info = info;
        this.ocorrencias = 1;
    }
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public int getOcorrencias() {
        return ocorrencias;
    }
    public void setOcorrencias(int ocorrencias) {
        this.ocorrencias = ocorrencias;
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
    @Override
    public String toString() {
        return "[info = " + info + ", ocorrencias = " + ocorrencias + "] ";
    }
}