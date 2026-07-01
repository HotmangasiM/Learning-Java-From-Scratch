// package WEEK 3.Projects;

public class Student extends Person{
    private String studentId;
    private int score;

    public Student(String studentId, String name, int score){
        // memanggil contructor dari parentnya
        super(name);
        this.studentId = studentId;
        this.score = score;
    }

    public String getStudentId(){
        return studentId;
    }

    public int getScore(){
        return score;
    }

    public GradeStatus getStatus(){
        if(score >= 75){
            return GradeStatus.PASSED;
        } else {
            return GradeStatus.FAILED;
        }
    }

    public void showInfo(){
        System.out.println("ID      : "+ studentId);
        System.out.println("Name    : "+ name);
        System.out.println("Score   : "+ score);
        System.out.println("Status      : "+ getStatus());
        System.out.println("----------------------");


    }
}
