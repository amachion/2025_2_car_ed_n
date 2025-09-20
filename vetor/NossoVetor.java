import java.util.Random;

public class NossoVetor {
    private int[] v;
    private int ocupacao;

    // blocos especiais de construção de objetos
    // 1. padrão
    public NossoVetor() {
        v = new int[10];
        ocupacao = 0; // por clareza
    }

    public NossoVetor(int capacidade) {
        v = new int[capacidade];
        ocupacao = 0;
    }

    // acessa posição vetor
    public int getPosicaoVetor(int posicao) {
        return v[posicao];
    }

    // altera posição do vetor
    public void setPosicaoVetor(int posicao, int valor) {
        v[posicao] = valor;
    }

    // acessa o vetor
    public int[] getV() {
        return v;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    public boolean estaCheio() {
        return ocupacao == v.length;
    }

    // private void dobra() {
    // int[] vLocal = new int[v.length * 2];
    // for (int i=0; i<ocupacao; i++)
    // vLocal[i] = v[i];
    // v = vLocal;
    // }
    // private void reduzirMetade () {
    // int[] vLocal = new int[v.length / 2];
    // for (int i=0; i < ocupacao; i++)
    // vLocal[i] = v[i];
    // v = vLocal;
    // }
    // faz o redimensionamento do vetor
    private void redimensiona(int novoTamanho) {
        int[] vLocal = new int[novoTamanho];
        for (int i = 0; i < ocupacao; i++)
            vLocal[i] = v[i];
        v = vLocal;
    }

    // inserir um elemento no vetor
    public void insereElemento(int elemento) {
        if (estaCheio())
            redimensiona(v.length * 2);
        v[ocupacao++] = elemento;
    }

    // remover o último elemento, se não estiver vazio
    public int remove() {
        if (!estaVazio()) {
            ocupacao--;
            if (v.length > 4 && ocupacao <= v.length / 4)
                redimensiona(v.length / 2);
            return v[ocupacao];
        }
        return -1;
    }

    // verificar se um elemento está ou não no vetor: busca simples
    public boolean contem(int x) {
        for (int i = 0; i < ocupacao; i++)
            if (v[i] == x)
                return true;
        return false;
    }

    public boolean buscaBinaria(int x) {
        int ini = 0, fim = v.length - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (x == v[meio])
                return true;
            if (x > v[meio])
                ini = meio + 1;
            else
                fim = meio - 1;
        }
        return false;
    }

    // devolver o número de elementos na lista
    public int tamanho() {
        return ocupacao;
    }

    public void preencheVetor() {
        Random random = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(v.length * 10);
        }
        ocupacao = v.length;
    }

    public void bubbleSort() {
        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < v.length - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < v.length - 1; i++) {
            int pos = i;
            for (int j = i + 1; j < v.length; j++)
                if (v[j] < v[pos])
                    pos = j;
            if (pos != i) {
                int aux = v[pos];
                v[pos] = v[i];
                v[i] = aux;
            }
        }
    }
    int partition (int p, int r) { 
		int x = v[r];     /* O pivô é o último elemento do vetor */
        int i = p-1;
		for(int j = p; j < r; j++) {
	     	if (v[j] <= x) {
	            i = i + 1;
	          	int aux = v[i];
	 	  	    v[i] = v[j]; 
                v[j] = aux;
            }
        }
        i = i + 1;
        int aux = v[r]; 
		v[r] = v[i]; 
		v[i] = aux;
		return i;
    }
    void quickSort (int p, int r) {
        //System.out.println ("\np = " + p + ", r = " + r);
        if (p < r) {
            int q = partition(p, r);
            //System.out.println ("\nq = " + q);
            quickSort(p, q-1);
            quickSort(q+1, r);
        }
    }
    void insertionSort() {
        for (int j = 1; j < v.length; ++j) {
            int x = v[j];
            int i;
            for (i = j - 1; i >= 0 && v[i] > x; --i)
                v[i + 1] = v[i];
            v[i + 1] = x;
        }
    }

    @Override
    public String toString() {
        String s = "tamanho = " + v.length + "\nocupacao = " + ocupacao + "\n";
        for (int i = 0; i < v.length; i++) {
            s += v[i] + " ";
        }
        return s;
    }
}
