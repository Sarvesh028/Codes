// Constructor banane k liye jo bhi class ka name h ussi k through banta h 
// constructor ka use basically long code ko small me likhna hota h.


public class Constructorstry {

    Constructorstry(){
    System.out.println("this is no argument constructor ");
}
    Constructorstry(int a ){
        System.out.println("this is argument Constructor with have an interger number "+a);
    }

    public static void main(String[] args) {
        Constructorstry cs= new Constructorstry(); // this object is created to call no argument constructor 
        Constructorstry cs1= new Constructorstry(50); // this object is created to call argument constructor which takes arguments

    }
}
