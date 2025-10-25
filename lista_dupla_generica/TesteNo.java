public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No<Integer>(10);
        System.out.println(no1);

        No no2 = new No<String>("hello, world");
        System.out.println(no2);

        No no3 = new No<Produto>(new Produto (100, "Martelo"));
        System.out.println(no3);
    }
}
