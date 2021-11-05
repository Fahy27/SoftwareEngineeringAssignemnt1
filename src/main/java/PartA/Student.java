package PartA;



import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String DOB;
    private long id;
    private String username;
    private ArrayList<Module> modules;
    private ArrayList<Course> courses;

    public Student(String name, int age, String DOB, long id){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getDOB(){
        return DOB;
    }

    public void setDOB(String DOB){
        this.DOB = DOB;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getUsername(){
        return  name + age;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Course> getCourses() { return courses; }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }



    @Override
    public String toString() {
        String str = getUsername() + "\n" + "Modules:\n";

        for (Module m : modules) {
            str += "\t" + m.getModuleName() + "\n";
        }
        str += ("Courses:\n");
        for (Course c : courses) {
            str += "\t" + c.getCourseName() + "\n";
        }
        return str;
    }


}
