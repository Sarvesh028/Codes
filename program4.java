class circle{
    float radius;

    public double area(){
        return 3.14 * radius * radius;
    }
    
    public double perimeter(){
        return 2 * 3.14 * radius;
    }
}


public class program4 {
    public static void main(String[] args) {
        
        circle pi = new circle();
        pi.radius = 5;
        System.out.println(pi.area());
        System.out.println(pi.perimeter()); 
    }
}
