//WAP to print all prime number between 2 to 20.


public class Assignment9 {
    
    public static void main(String[] args) {
    int num = 20, count;

    for (int i = 1; i <= num; i++) {
    count = 0;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
            count++;
            break;
            }
        }

        if (count == 0) {
            System.out.println(i);
            }
         } 
    }
}
