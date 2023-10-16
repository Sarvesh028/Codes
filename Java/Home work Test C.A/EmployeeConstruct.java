// this constructor will call via only one object by this method, example 

public class EmployeeConstruct {
    
    EmployeeConstruct(){
        this("Ramu");
        System.out.println("This is Call of Contructor by object i.e no arg constructor.");
        
    }
    EmployeeConstruct(String name){
        //this();
        this(30,4500.0f);
        System.out.println("This is name of Constructor i.e., name of employee "+name);
    }
    EmployeeConstruct(int id, float salary){
        //this("sarvesh");
        
        System.out.println("This is Id and Salary of Employee"+id +salary);
    }
    
    //Here this will use to call the onstructor via only one object
    

    public static void main(String[] args) {
        //EmployeeConstruct ec = new EmployeeConstruct(2,45000.50f);
        EmployeeConstruct ec = new EmployeeConstruct();
    
    }
}
