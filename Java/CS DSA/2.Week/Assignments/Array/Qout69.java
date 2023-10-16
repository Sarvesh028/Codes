public class Qout69 {
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int traget = 5;
        boolean found = false; 

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == traget){
                    found = true;
                break;
                }
            }
        if (found)   {
            break;
        }            
        }
        System.out.println(found);
    }
}
