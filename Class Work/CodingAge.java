public class CodingAge {
    /*
    int noOfStudents; //object ka variable 

    static int totalNoOfStudents; // class ka variable -- har jagah call ho jayega

    // method -- return -- no return 
    // entity data (variable) --> entity behaviour(Method)

    int Classes;
    int Batches;

    void noOfClasses(int Classes){
        System.out.println("the number of classes in a month "+Classes);
    }

    int noOfBatches(int Batches){
        System.out.println("");
    }

    public static void main(String[] args) {
     CodingAge codingkank =new CodingAge();
     codingkank.noOfStudents = 100;
     System.out.println(" Kankarbagh Branch has "+ codingkank.noOfStudents);
     codingkank.totalNoOfStudents = codingkank.noOfStudents;
     codingkank.noOfClasses=20;


     CodingAge codingbelley =new CodingAge();
     codingbelley.noOfStudents = 50;
     System.out.println(" Belley road Branch has "+ codingbelley.noOfStudents);
     codingbelley.totalNoOfStudents = codingbelley.noOfStudents+codingkank.noOfStudents;
     System.out.println(totalNoOfStudents);

    }
    */
     //entity data----variable --(instance var --object ka variable -)
    int no_of_student;//<object ka variable>
    static int total_no_of_student;//class ka variable

    int noOfClasses;
    int noOfBatches;

    //method -- return --no return

    //entity data<variable> //entity behaviour<methods>\
static void totalNoOfBatches(int totalnoofbatches){
    System.out.println("The Total no of batches in all branches are "+totalnoofbatches);
}

    void noOfClassesInAMonthInKankarbagh(int noOfClasses){
        System.out.println("The no of classes in a month in Kankrbagh branch "+noOfClasses);

    }

    int noOfBatchesInBoringroad(int noOfbatches){
        System.out.println("The no of batches in boringroad are "+noOfbatches);
        return noOfbatches;
    }



    public static void main(String[] args) {
        CodingAge codingkank=new CodingAge();
        codingkank.no_of_student=100;
        System.out.println("Kankarbagh branch has "+codingkank.no_of_student);
        Codingage.total_no_of_student=codingkank.no_of_student;
        codingkank.noOfClasses=20;
        codingkank.noOfBatches=5;

       int noOfClass=20;

        codingkank.noOfClassesInAMonthInKankarbagh(noOfClass);

       // codingkank.noOfClassesInAMonthInKankarbagh(codingkank.noOfClasses);

        CodingAge codingageBoringroad=new CodingAge();
        codingageBoringroad.no_of_student=50;
        System.out.println("Boringroad has "+codingageBoringroad.no_of_student);
        Codingage.total_no_of_student=codingageBoringroad.no_of_student+codingkank.no_of_student;

        System.out.println("The total noof students in all branches are "+total_no_of_student);
        codingageBoringroad.noOfBatches=4;
        codingageBoringroad.noOfBatchesInBoringroad(codingageBoringroad.noOfBatches);

        Codingage.totalNoOfBatches(codingageBoringroad.noOfBatches+codingkank.noOfBatches);

    }

}
