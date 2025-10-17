public class No {
    private Produto info;
    private No proximo;
    public No (Produto produto) {
        info = produto;
    }
    public Produto getInfo() {
        return info;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return "[" + info + "]";
    }
    
}
