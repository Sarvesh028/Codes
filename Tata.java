public class Tata {

    int employee;
    String mainBranch;

    public static void main(String[] args) {
        
        Tata tatamotor = new Tata();
        tatamotor.employee=1000;
        tatamotor.mainBranch="Mumbai";
        System.out.println("The number of Employee "+tatamotor.employee + " and the main Branch is "+tatamotor.mainBranch );

        Tata tcs = new Tata();
        tcs.employee=100;
        tcs.mainBranch="Banglore";
        System.out.println("The number of Employee "+tcs.employee + " and the main Branch is "+tcs.mainBranch );

        Tata starbucks = new Tata();
        starbucks.employee=500;
        starbucks.mainBranch="Kolkata";
        System.out.println("The number of Employee "+starbucks.employee + " and the main Branch is "+starbucks.mainBranch );
    }
}
