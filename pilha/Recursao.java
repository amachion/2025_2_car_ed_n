public class Recursao {
    static double fatorial (int n) {
        if (n <= 1) return 1;
        return n * fatorial(n-1);
    }
    static int fibonacci (int n) {
        if (n <= 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    static void exibe1aN(int i, int n) {
        System.out.println(i);
        if (i < n)  exibe1aN(i+1, n);
    }
    static void exibe1aN (int n) {
        if (n>1) exibe1aN(n-1);
        System.out.println(n);
    }
    //somar os valores de 1 a n
    static int soma1aN (int n) {
        if (n==0) return 0;
        return n + soma1aN(n-1);
    }
    static int soma1aN (int i, int n) {
        if (i==n) return n;
        return i + soma1aN(i+1, n);
    }
    static int somaVetor (int[] v, int i) {
        if (i == v.length-1) return v[i];
        return v[i] + somaVetor(v, i+1);
    }
    static int potencia (int base, int expoente) {
        if (expoente == 0) return 1;
        return base * potencia(base, expoente-1);
    }
    static int multiplicacao (int fator1, int fator2) {
        if (fator1 == 0 || fator2 == 0) return 0;
        return fator1 + multiplicacao(fator1, fator2-1);
    }
    public static void main(String[] args) {
        // for (int i=0; i <= 20; i++)
        //     System.out.printf("fatorial de %d = %.0f\n", i ,fatorial(i));
        // for (int i=0; i <= 45; i++)
        //     System.out.println ("Fibonacci em " + i + " = " + fibonacci(i));
        exibe1aN(1, 5);
        exibe1aN(5);
        System.out.println(soma1aN(4));
        System.out.println(soma1aN(1, 4));
        int[] v = {1, 2, 3, 4};
        System.out.println(somaVetor(v,0));
        System.out.println(potencia(3, 4));
        System.out.println(multiplicacao(3, 4));
    }
}
