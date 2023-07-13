import java.io.*;
import java.util.*;

class Arithmetic{
    public int sum(int a, int b){
        return a+b;
    }
}

class Adder extends Arithmetic{
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder a = new Adder();
        System.out.println("My superclass is: Arithmetic "+a.sum(40,2)+" "+a.sum(10,3)+" "+a.sum(10,10));
    }
}