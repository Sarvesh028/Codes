//WAP to print the following pattern:
// 1 3 5 7 9 …….till 100

class Assignment7 {
    
    public static void main(String[] args) {
        int n = 100;
        for(int i = 0; i<= n; i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}