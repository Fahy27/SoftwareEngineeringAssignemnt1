import PartA.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.joda.time.DateTime;


public class CourseTest {
    Course course;

    @Before public void start() {
        // Reset course at the start of each test
        course = new Course("CS & IT", DateTime.now(), DateTime.now());
    }

    @Test public void checkModulesAddedToCourse() {
        Module module = new Module("Software Engineering","CT417");
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);
        course.setModules(modules);
        assertEquals(modules, this.course.getModules());
    }

    @Test public void checkStudentsAddedToCourse() {
        Student student = new Student("Evan Fahy", 21, "27/11/1999", 18391616);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        course.setStudents(students);
        assertEquals(students, course.getStudents());
    }
}
