//Dyanamic method of java by calling of object

class phone{
    public void on(){
        System.out.println("Please turn on the phone");
    }

    public void test(){
        System.out.println("I'm your normal phone");
    }

    public void music(){
        System.out.println("I'm not your smartphone");
    }
}

class smartphone extends phone{
public void test(){
        System.out.println("I'm your Smart  phone");
    }
    public void on1(){
        System.out.println("Please turn on the smartphone");
    }

    public void smartmusic(){
        System.out.println("Music playing..............");
    }
}

public class DyanamicMethod {
    
    public static void main(String[] args) {
        phone p1 = new phone();  // making a object of only parent class so the out put will be only of parent class
        p1.on(); //Please turn on the phone
        p1.music(); //I'm not your smartphone

        System.out.println("---------");

        smartphone sm =new smartphone(); // after making an object of sub-class i.e child class object it will inherit all the properties of parent class and when we call then it will print parent class as well as child class property
        sm.on(); //Please turn on the phone
        sm.music(); //I'm not your smartphone
        sm.on1(); //Please turn on the smartphone
        sm.smartmusic(); //Music playing..............
        
        System.out.println("______________");
        // smartphone sm1 =new phone();  this will not allow because sub-class will not be super class, in simple way child will not be adopt parent but 
        phone p2 = new smartphone(); // parent will be adopt child  
        p2.on(); // this will call only parent class property
        // p2.on1(); // not child class
        p2.music(); // this will also call only parent class 
        // p2.smartmusic(); // this will not 
        p2.test(); // but there is same name of same object then it will call the child class object 

        //Because this refernce will be parent so the object will made only off parent class

    }
}
