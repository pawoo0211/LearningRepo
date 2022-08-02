package collection;

import java.util.*;

public class Student{

    private final int studentId;
    private String name;

    public Student(int studentId, String name){
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId(){
        return this.studentId;
    }

    public static void main(String[] args){

        Student A = new Student(32197252, "Park");
        Student B = new Student(32197253,"Kwon");
        Student C = new Student(32197254,"Sang");

        Map<Long, Student> studentMap = new HashMap();

        studentMap.put(0L,A);
        studentMap.put(1L,B);
        studentMap.put(2L,C);

        Iterator<Long> studentCount = studentMap.keySet().iterator();
        while(studentCount.hasNext()){
            Long key = studentCount.next();
            Student student = studentMap.get(key);
            System.out.println("학번: "+student.getStudentId());
        }

    }
}
