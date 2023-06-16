// Variable arugments in java 
// which is used to do a work in onle step as see the example

public class Method5 {
    
    static int sum(int a, int b){ // here i pass a two int value which is printed and return a value of only two 
        //but i can add more without any boundary of any number then we can use var-arr; as we can see example;
        return a+b;
    }
    
    static int sum(int ...arr){
        int result = 0 ;
        for(int a : arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of two number is "+ sum(3, 5)); 

        System.out.println("The Sum of Number 3, 5 , 6, 7 ,8 ,9 are "+sum(3,5,6,7,8,9));
    }
}
