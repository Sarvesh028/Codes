
class cellphone{
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void Vibrate(){
        System.out.println("Vibrating.....");
    }
}
public class Phone {

    public static void main(String[] args) {
        cellphone nokia = new cellphone();
        nokia.Vibrate();
        nokia.ring();
    }
}
