// it is basically a take user input unlimited to solve any thing see the example ;

public class Varrrg {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static int add(int a, int b, int c, int d, int e) { // here we can write code to sum it manually one by one
        return a + b + c + d + e;
    }

    // now using var-arr method

    static int add(int... t) {
        int value = 0;
        for (int x : t) {
            value += x;
        }
        return value;
    }

    // here we can use the var arg using loop to calculate

    static int sum(int... w) {
        int sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum = sum + w[i];
        }
        System.out.println(sum);
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(add(40, 30));
        System.out.println(add(2, 4, 07));
        System.out.println(add(1, 3, 4, 5));
        System.out.println(add(44, 22, 99, 87, 89));

        System.out.println(add(1, 3, 4, 5, 6, 7, 8, 4, 4, 5, 6, 3, 5));
        Varrrg.sum(1, 2, 3, 4, 6, 7, 8);

        // System.out.println(mul(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}
