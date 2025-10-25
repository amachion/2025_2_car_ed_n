public class Produto {
    private int codigo;
    private String nome;
    private int estoque;
    public Produto (int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEstoque() {
        return estoque;
    }
    @Override
    public String toString() {
        return "codigo=" + codigo + ", nome=" + nome + ", estoque=" + estoque;
    }
    public void atualizaEstoque (int valor) {
        if (estoque + valor < 0)
            estoque = 0;
        else 
            estoque = estoque + valor;
    }
}