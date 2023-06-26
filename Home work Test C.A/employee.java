
class employees{
    
    double salary;
    String name;
    
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name; 
    }
    public void setName(String n){
        name = n;
    }
}


public class employee {
    public static void main(String[] args) {
        employees rahul = new employees();
        rahul.setName("Rahul Kumar");
        rahul.salary = 500;
        System.out.println(rahul.getSalary());
        System.out.println(rahul.getName());
    }
}
