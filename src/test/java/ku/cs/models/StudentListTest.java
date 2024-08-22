package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList students;

    @BeforeEach
    void init() {
        students = new StudentList();
        students.addNewStudent("6600000000", "Bright", 70.0);
        students.addNewStudent("6600000001", "Nest", 80.0);
        students.addNewStudent("6600000002", "Aock", 80.0);
    }

    @Test
    void testAddNewStudent() {
        students.addNewStudent("6600000004", "Karn");
        assertEquals("Karn", students.getStudents().get(students.getStudents().size()-1).getName());

        students.addNewStudent("6600000003", "Ton", 80.0);
        assertEquals("Ton", students.getStudents().get(students.getStudents().size()-1).getName());
    }

    @Test
    void testFindStudentById() {
        Student exist = students.findStudentById("6600000000");
        assertEquals("Bright", exist.getName());
    }

    @Test
    void testGiveScoreToId() {
        students.giveScoreToId("6600000000", 30);
        assertEquals(100, students.findStudentById("6600000000").getScore());
    }

    @Test
    void testViewGradeOfId() {
        assertEquals("B", students.viewGradeOfId("6600000000"));
    }

}