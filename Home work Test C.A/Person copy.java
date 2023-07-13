public class Person {
    String name;
    int age;

    Person(String name , int age ){
        System.out.println("the name of Person is "+name);
        System.out.println("the age of person is "+age);
    }
    public int compareAge(int age){
        if(this.age >=age){
            System.out.println("Constructor Age is elder");
        }else if(this.age <= age ){
            System.out.println("Method age is Elder");
        }else{
            System.out.println("Both are equal in age");
        }
        return 0;
    }
    public static void main(String[] args) {
        Person p1=new Person("Ram", 25);
        p1.compareAge(30);
        
    }
}
