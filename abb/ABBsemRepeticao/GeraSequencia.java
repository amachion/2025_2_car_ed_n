import java.util.Random;

public class GeraSequencia {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i=1; i<=1000; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
