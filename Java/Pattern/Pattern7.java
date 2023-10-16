public class Pattern7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    //     int n = 6;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 1; j < n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         System.out.print("*");
    //         for (int j = 0; j <= 2 * i - 1; j++) {
    //             if (j == 2 * i - 1) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    // }
    }
}
