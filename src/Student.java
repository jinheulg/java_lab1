import java.util.List;

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

    public void setGrade(List<Integer> grade) {
        this.grade = grade;
    }

    public float averageGrade(List<Integer> grade){
        float sum=0;
        for(Integer i : grade) {
            sum += i;
        }
            return sum/grade.size();
        }

    }

