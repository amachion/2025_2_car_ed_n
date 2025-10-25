public class ListaDupla <E>{
    private No<E> primeiro;
    private No<E> ultimo;
    //construtor padrão
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio(E elemento) {
        No novo = new No<E>(elemento);
        if (estaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }   
    public void insereFim(E elemento) {
        No novo = new No<E>(elemento);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }  
    public E removeInicio() {
        if (estaVazia()) return null;
        E temp = primeiro.getElemento();
        if (primeiro == ultimo) { //tem um só
            primeiro = null;
            ultimo  = null;
        }
        else {
            primeiro = primeiro.getProximo();
            primeiro.setAnterior(null);
        }
        return temp;
    }
    public E removeFim() {
        if (estaVazia()) return null;
        E temp = ultimo.getElemento();
        if (primeiro == ultimo) { //tem um só
            primeiro = null;
            ultimo  = null;
        }
        else {
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }
        return temp;
    }
    @Override
    public String toString () {
        if (estaVazia()) return "lista vazia";
        No<E> runner = primeiro;
        String s = "// - ";
        while (runner != null) {
            s += runner.toString() + " - ";
            runner = runner.getProximo();
        }
        s += "//";
        return s;
    }
    public boolean contains (E elemento) {
        if (estaVazia()) return false;
        No<E> runner = primeiro;
        while (runner != null) {
            if (runner.getElemento().equals(elemento)) return true;
            runner = runner.getProximo();
        }
        return false;
    }
}
