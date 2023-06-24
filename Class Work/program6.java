class Tatamotor{
    public void headquator(){
        System.out.println("Mumbai");
    }
    public void employee(){
        System.out.println("1 Lac Employee");
    }
}

class Tcs{
    public void headquator(){
        System.out.println("Banglore");
    }
    public void employee(){
        System.out.println("50 Thousand Employee");
    }
}

class Starbucks{
    public void headquator(){
        System.out.println("Kolkata");
    }
    public void employee(){
        System.out.println("20 thousand Employee");
    }
}
public class program6 {
    public static void main(String[] args) {
        
        Tatamotor tt = new Tatamotor();
        tt.headquator();
        tt.employee();

        System.out.println("___________");

        Tcs tc = new Tcs();
        tc.headquator();
        tc.employee();

        System.out.println("___________");

        Starbucks st = new Starbucks();
        st.headquator();
        st.employee();
    }
}
