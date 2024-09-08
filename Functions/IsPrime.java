
public class IsPrime {
    public static boolean Isprime(int n) {
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0)

                    return false;

            }
            return true;
        }
    }
    // function for when we want range prime number

    public static void Inrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (Isprime(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static void main(String args[]) {
        Inrange(20);
    }
}
