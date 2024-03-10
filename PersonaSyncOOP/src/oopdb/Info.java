package oopdb;

public class Info {
    
    // Global Variables
    String fname, lname, mname;
    int age;
    char sex;
    static int count = 0;
    
    // Local variables
    Info(String fname, String lname, String mname, int age, char sex) {
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.age = age;
        this.sex = sex;
        count++; // Increment count for each new object
        if (count == 1) { // Print column headers only for the first person
			       //Displayed Arrangement
            System.out.printf("\n%-12s%-17s%-16s%-19s%-8s%s\n", "No", "First Name", "Last Name", "Middle Name", "Age", "Sex");
        }
            System.out.printf("\n%-12s%-17s%-16s%-19s%-8s%s\n", + count, fname, lname, mname, age, sex);
      
   }
}



