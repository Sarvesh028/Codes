public class Patterns {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            System.out.println("*******");
        }
        System.out.println("_____----_____");
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}