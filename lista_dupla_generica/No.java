public class No<E> {
    private E elemento;
    private No<E> anterior, proximo;

    public No (E elemento) {
        this.elemento = elemento;
    }
    public E getElemento() {
        return elemento;
    }
    public No<E> getAnterior () {
        return anterior;
    }
    public No<E> getProximo () {
        return proximo;
    }
    public void setElemento (E elemento) {
        this.elemento = elemento;
    }
    public void setAnterior (No<E> anterior) {
        this.anterior  = anterior;
    }
    public void setProximo (No<E> proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return "[" + elemento + "]";
    }
    
}