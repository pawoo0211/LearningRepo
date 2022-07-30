package student;

public class Student {

    private int studentId;
    private String name;

    public Student(int studentId, String name){
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId(){
        return this.studentId;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object object){
        if(object instanceof Student){
            Student student = (Student)object;
            if(this.getStudentId() == student.getStudentId()){
                System.out.println("this studentId is : "+this.getStudentId());
                System.out.println("parameter studentId is : "+this.getStudentId());

                return true;
            }
        else return false;
        }
        return false;
    }

    @Override
    public int hashCode(){
        System.out.println("hashCode was called");
        return studentId;
    }

    public static void main(String[] args){
        Student A = new Student(32197252,"Park");
        Student B = new Student(32197252,"Sang");

        int aHashCode = A.hashCode();
        int bHashCode = B.hashCode();

        System.out.println("A equals B: "+A.equals(B));
        System.out.println("A.hashCode(): "+A.hashCode());
        System.out.println("B.hashCode(): "+B.hashCode());

    }
}
