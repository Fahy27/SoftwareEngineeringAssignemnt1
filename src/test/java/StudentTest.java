import PartA.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class StudentTest {
    Student student;

    @Before public void start() {
        // Reset student at the start of each test
        student = new Student("Evan Fahy", 21, "27/11/1999", 18391616);
    }

    @Test public void checkGetUserName() {
        assertEquals("Evan Fahy21", student.getUsername());
    }

    @Test public void checkCoursesAddedToStudent() {
        Course course = new Course("CS & IT", DateTime.now(), DateTime.now());
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course);
        student.setCourses(courses);
        assertEquals(courses, student.getCourses());
    }

    @Test public void checkModulesAddedToStudent() {
        Module module = new Module("Software Engineering","CT417");
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);
        student.setModules(modules);
        assertEquals(modules, student.getModules());
    }



    @Test public void checkToString() {
        Module module = new Module("Software Engineering","CT417");
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(module);
        student.setModules(modules);
        Course course = new Course("CS & IT",DateTime.now(), DateTime.now());
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(course);
        student.setCourses(courses);
        String str = student.toString();
        assertEquals("Evan Fahy21\nModules:\n\tSoftware Engineering\nCourses:\n\tCS & IT\n", str);
    }
}
