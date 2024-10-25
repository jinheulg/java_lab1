import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grade;

    public Student(String name, String group, int course, List<Integer> grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrade() {
        return grade;
    }
}
