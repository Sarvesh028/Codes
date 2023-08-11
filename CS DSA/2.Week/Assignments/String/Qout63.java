public class Qout63 {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(str.charAt(4));

        /*
         * The charAt(int index) method returns the character at the specified index of the string.
         *  In this case, the string "Java" has a length of 4, and the index provided (4) is out of the valid range (0 to 3). 
         *  As a result, the method throws a StringIndexOutOfBoundsException.
         */
    }
}
