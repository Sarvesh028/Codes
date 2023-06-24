// Question on Acess modifiers and Constructors;
// Create a class cylinder and use getter and setter to set its radius and height ?
// import java.lang.*;
class Cylinder 
{

    private int radius;
    private int height;

//We use getter and setter in private modifier to access private class 
// eg -  if we say give me your number , so the number will bw in integer not in letter then we can tell him give only integer!

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
}
public class Program1 
{
    
    public static void main(String[] args) {
        Cylinder Rh = new Cylinder();
        Rh.setHeight(4);
        Rh.setRadius(2);
        System.out.println(Rh.getHeight());
        System.out.println(Rh.getRadius());
        }
}
