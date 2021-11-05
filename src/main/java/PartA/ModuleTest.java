package PartA;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.joda.time.DateTime;


public class ModuleTest {
    Module module;

    @Before public void start() {
        // Reset module at the start of each test
        module = new Module("Software Engineering", "CT417");
    }

    @Test public void checkCoursesAddedToModule() {
        Course course = new Course("CS & IT",DateTime.now(), DateTime.now());
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course);
        module.setCourses(courses);
        assertEquals(courses, module.getCourses());
    }

    @Test public void checkStudentsAddedToModule() {
        Student student = new Student("Evan Fahy", 21, "27/11/1999", 18391616);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        module.setStudents(students);
        assertEquals(students, module.getStudents());
    }
}
