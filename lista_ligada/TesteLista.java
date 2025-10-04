public class TesteLista {
    public static void main(String[] args) {
        Lista lista  = new Lista();
        System.out.println("lista criada: " + lista);
        lista.insereInicio(10);
        lista.insereInicio(20);
        lista.insereInicio(30);
        System.out.println("lista depois das insercoes de inicio:");
        System.out.println(lista);
        System.out.println(lista.removeInicio() + " saiu do inicio");
        System.out.println("lista depois da remocao de inicio");
        System.out.println(lista);
        lista.insereFim(15);
        lista.insereFim(25);
        lista.insereFim(35);
        System.out.println("lista depois das insercoes de fim");
        System.out.println(lista);
    }
}
