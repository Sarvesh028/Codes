public class Qout57 {
    public static void main(String[] args) {


        String str2 = "Hello World";
        System.out.println(str2.contains(" World ")+ " ");
        System.out.println(str2.isEmpty());

        /*
         * The contains(CharSequence sequence) method checks if the string contains the specified character sequence.
         *  In this case, the string "Hello, World!" does not contains the sequence " World " because of the extra space after World, 
         * so the method returns false.
         * The isEmpty() method checks if the string is empty (i.e., it has no characters). In this case, 
         * the string "Hello" is not empty, so the method returns false.
         */
    }
}
