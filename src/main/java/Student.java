import java.io.Serializable;

public class Student implements Serializable {
    private String Name;
    private double GPA;

    public Student (String name, double gpa){
        this.Name = name;
        this.GPA = gpa;
    }
    public String getName(){
        return this.Name;
    }

    public String setName(String newName) {
        return (this.Name = newName);
    }

    public double getGPA() {
        return GPA;
    }

    public double setGPA(double GPA) {
        return(this.GPA = GPA);
    }
    @Override
    public String toString(){
        return String.format("%s\t%f", this.Name,this.GPA);
    }
}
