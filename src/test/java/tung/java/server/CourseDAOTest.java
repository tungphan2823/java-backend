package tung.java.server;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CourseDAOTest {

    private CourseDAO courseDAO;

    @BeforeEach
    void setUp() {
        courseDAO = new CourseDAO();
       
    }

    @Test
    void testAddCourse() {
        Course testCourse = new Course("testID", "Test Course", "Test Teacher");
        courseDAO.insertCourse(testCourse);
        Course retrievedCourse = courseDAO.selectCourseByID("testID");
        assertNotNull(retrievedCourse);
        assertEquals("Test Course", retrievedCourse.getName());
        
    }

    @Test
    void testGetCourseByID() {
        
        Course course = courseDAO.selectCourseByID("COURSE9");
        assertNotNull(course);
        assertEquals("COURSE9", course.getCourseID());
    }

    @Test
    void testGetAllCourses() {
        List<Course> courses = courseDAO.selectAllCourses();
        assertNotNull(courses);
        assertFalse(courses.isEmpty());
    }
    @Test
    void testDeleteStudent() {
        String testID = "testID";
        courseDAO.deleteStudent(testID);
        assertNull(courseDAO.selectCourseByID(testID));
    }

    @AfterEach
    void tearDown() {
        // Clean up resources
    }
}
