package student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student A = new Student(32197252,"Park");
    Student B = new Student(32197253,"Sang");

    @Test
    void hashCodeTest(){
        Assertions.assertEquals(1130478920, A.hashCode());
    }

}