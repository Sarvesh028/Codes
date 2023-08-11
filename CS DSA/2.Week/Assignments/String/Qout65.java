public class Qout65 {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str.contains(null));

        /*
         * The contains(CharSequence sequence) method checks if the string contains the specified character sequence. 
         * In this case, the sequence provided is null and the contains method gives a NullPointerException 
         * if the argument is passed as null.
         */
    }
}
