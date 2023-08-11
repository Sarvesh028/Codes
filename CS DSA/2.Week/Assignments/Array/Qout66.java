public class Qout66 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
