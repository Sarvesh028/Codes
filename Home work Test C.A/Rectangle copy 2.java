public class Rectangle {
    
    int length=6;
    int width=3;

    Rectangle(int length, int width){
        System.out.println("the length is "+length);
        System.out.println("the Width is "+width);
    }

    public int calculateArea(){
        this.length=length;
        this.width=width;
        return length*width;
    }

    public static void main(String[] args) {
        Rectangle R1=new Rectangle(4, 5);
        System.out.println("The area of rectangle is "+R1.calculateArea());
    }
}
