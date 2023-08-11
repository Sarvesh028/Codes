public class Qout43 {
    public static void main(String[] args) {
        int[][]matrix = new int [3][2];
        System.out.println(matrix[1]);
    }
}

// When a new 2-dimensional array is created, all elements are initialized to their default values.
//  For int arrays, the default value is 0. But If we try to print an array in Java directly, it will simply print the 
// className + '@' + the hex of the hashCode of the array, as defined by Object.toString():