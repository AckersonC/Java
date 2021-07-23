public class StudentsProfile {
    String firstname;
    String lastname;
    String declaredmajor;
    double gpa;
    int expectedyeartograduate;

    public StudentsProfile(String firstname, String lastname, String  declaredmajor, double gpa, int expectedyeartograduate){
        this.firstname = firstname;
        this.lastname = lastname;
        this.declaredmajor = declaredmajor;
        this.gpa = gpa;
        this.expectedyeartograduate = expectedyeartograduate;


    }

    public void incrementexpectedgraduationyear(){
        this.expectedyeartograduate = this.expectedyeartograduate+1;

    }

    public static void main(String[] args) {
        StudentsProfile profileone= new StudentsProfile("Sally","Salmon","Film",3.75,2022 );
        StudentsProfile profiletwo = new StudentsProfile("Max", "Tiffen", "Computer Science", 3.45,2021);
        profiletwo.incrementexpectedgraduationyear();
        System.out.println(profiletwo.expectedyeartograduate);



    }



}
