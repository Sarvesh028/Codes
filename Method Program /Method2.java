// without the use of static, how can i call a method; 

public class Method2 {
  

    int sum(int x, int y){
        return x + y;
    }


    public static void main(String[] args) {
       //  System.out.println(sum); not calling the method directly because static is not decleared, Static decleare only for the main
       //  method, so now we have to make a obj to call the method !

       Method2 m=new Method2();
       System.out.println(m.sum(3, 5));

    }

}
