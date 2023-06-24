class rectangle{
    int length, breadth;

    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2 * (length + breadth);
    }
}

public class program3 {
    public static void main(String[] args) {
    
        rectangle lb = new rectangle();
        lb.length = 4;
        lb.breadth = 5;
        System.out.println(lb.area());
        System.out.println(lb.perimeter());
        
    }
}
