import java.util.Scanner;

public class TesteAltura {
    public static void main(String[] args) {
        ABB abb = new ABB();
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<=1000; i++) {
            abb.insere(scanner.nextInt());
        }
        System.out.println("altura = " + abb.altura());
        System.out.println("numero de nos = " + abb.contarNos());
        scanner.close();
    }
}
