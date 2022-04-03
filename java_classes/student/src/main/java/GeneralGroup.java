import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneralGroup {
    private List<Student> students;

    public GeneralGroup() {
        this.students = new ArrayList<>();
    }

    public void addStudentToGeneralGroup(Student newStudent) {
        newStudent.setId(correctId(newStudent.getId()));
        students.add(newStudent);
    }

    private static Set<Integer> setIdForCorrectId = new HashSet<>();

    private int correctId(int id) {
        while (!setIdForCorrectId.add(id)) {
            id = id + 1;
        }
        setIdForCorrectId.add(id);
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "GeneralGroup{" +
                "students=" + students +
                '}';
    }
}
