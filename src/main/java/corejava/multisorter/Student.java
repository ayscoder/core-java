package corejava.multisorter;

/**
 * How to sort list of class objects
 * @author www.instanceofjava.com
 */
 
public class Student {
    
    String name;
    int Rollno;
    float marks;
 
Student(String name, int Rollno, float marks){
        
        this.name=name;
        this.marks=marks;
        this.Rollno=Rollno;
}
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return Rollno;
    }
    public void setRollno(int rollno) {
        Rollno = rollno;
    }
    public float getMarks() {
        return marks;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }
    
public String toString() {
        return ("Name:"+name+"\tRollNo:"+Rollno+"\tMarks"+marks);
    }
 
}
