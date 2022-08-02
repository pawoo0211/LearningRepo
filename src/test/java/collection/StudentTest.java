package collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void studentEqualsTest(){
        // given
        Student A = new Student(32197252, "Park");
        Student B = new Student(32197252,"Kwon");

        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(A);
        studentHashSet.add(B);

        // expected
        Assertions.assertSame(A, B);



    }


}