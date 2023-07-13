//here we use the getter and setter using access modifiers
// we can directly call it via option
// it is basically uses in getting secure data using private access modifiers 
// here is example 

class Employee{

    private int id;
    private float salary;
    private String name;

    public void setName(String n){ // here set the name which is in void so there is no return type here
             name = n;
        }

    public String getName() { // here, setter which got set by setter and it will ready to called by object;
        return name;            // getter have always a return type;
    }

    public void setid(int a) { 
        id = a;
    }
    public int getid(){
        return id;
    }

    public void setsalary(float b){
        salary = b;
    }
    public float getsalary(){
        return salary;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Employee ee = new Employee();
        ee.setName("Boby");
        ee.setid(23);
        ee.setsalary(235000.484f);
        System.out.println(ee.getName());
        System.out.println(ee.getid());
        System.out.println(ee.getsalary());
    }
}
