public class Employee5{
    
    String name;
    int age;
    float salary;

    Employee5(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

    Employee5(String name, int age, float salary){
        System.out.println("The name of Employee is "+name +" \nThe age of Employee is "+age +" The salary of Employee is "+salary);
    }

    public static void main(String[] args) {
        Employee5 E1= new Employee5("Ram", 25);
        Employee5 E2= new Employee5("Krishna", 50, 45000);
    }
}
