package tung.java.server;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class StudentDAOTest {

    private StudentDAO studentDAO;

    @BeforeEach
    void setUp() {
        studentDAO = new StudentDAO();
       
    }

    @Test
    void testInsertStudent() {
        Student student = new Student("test", "Test", "Student", "test@student.com");
        studentDAO.insertStudent(student);

        
        Student retrievedStudent = studentDAO.selectUserByID("test");
        assertNotNull(retrievedStudent);
        assertEquals("Test", retrievedStudent.getFirstname());
        assertEquals("Student", retrievedStudent.getLastname());
        assertEquals("test@student.com", retrievedStudent.getEmail());
    }

    @Test
    void testSelectUserByID() {
        String testID = "X211"; 
        Student student = studentDAO.selectUserByID(testID);
        assertNotNull(student);
        assertEquals(testID, student.getStudentID());
      
    }

    @Test
    void testDeleteStudent() {
        String testID = "test";
        studentDAO.deleteStudent(testID);
        assertNull(studentDAO.selectUserByID(testID));
    }

    @AfterEach
    void tearDown() {
       
    }
}
