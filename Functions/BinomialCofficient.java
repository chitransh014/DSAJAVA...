public class BinomialCofficient {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int Bincoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nminr = factorial(n - r);
        int Bincoff = fact_n / (fact_r * fact_nminr);
        return Bincoff;
    }

    public static void main(String args[]) {
        System.out.println(Bincoff(5, 2));
    }
}
