// how many static or non static block are print after making multiple object
// check the priority of the static and main and the instance block

class Demo {

    int a = 10;
    static int ab = 60;

    {
        System.out.println(" Block");

    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        Demo D1 = new Demo();
    }
}

/*
 * Output are here is the
 * static call first if static is available
 * main willbe call if the commond is given to print in the main method.
 * if any instance block is available then it will be assign
 * then call the object
 * 
 * 
 * here when i print the same value of making dual object of it then output will
 * be
 * if static is available then it will goes first then after any
 * so, the answer is
 * static value is print first and only once wheather it is call too many times
 * but instance block is called as is it called number of times depends on the
 * number of object will be created.
 */
