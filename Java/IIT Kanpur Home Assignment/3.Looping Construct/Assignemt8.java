//WAP to print the following pattern
//1 3 7 13 21… till 100
// not made

public class Assignemt8 
{

    public static void main(String[] args) 
    {
        int n = 100;
        for(int i = 0; i<=n; i++){

            if(i == Math.pow(i, 2)-i-1)
            {
                System.out.println(i);
            }
            
        }

    }
    
}
