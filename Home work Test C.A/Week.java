import java.util.Scanner;

class week
{
    public static void main(String [] asd)
    {
        System.out.println("Enter the Number from 1 to 7 to show the name of day");
        Scanner dk =new Scanner(System.in);
        int n = dk.nextInt();
        
        switch(n)
        {
            case 1 :  System.out.println("Monday");
            break;
            case 2 :  System.out.println("Tueday");
            break;
            case 3 :  System.out.println("Wednesday");
            break;
            case 4 :  System.out.println("Thrusday");
            break;
            case 5 :  System.out.println("Friday");
            break;
            case 6 :  System.out.println("Saturday");
            break;
            case 7 :  System.out.println("Sunday");
            break;
            default :  System.out.println("Please Enter numbers between 1 to 7! Wrong Input! ");
            break;
            
        }
        
    }
}
