public class NovoTeste {
    public static void main(String[] args) {
        NossoVetor nVetor = new NossoVetor(4);
        for (int i=1; i<=36; i++) {
            nVetor.insereElemento(i);
            System.out.println(nVetor);
        }
    }
}
