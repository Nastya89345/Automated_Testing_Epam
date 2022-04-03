import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GroupLogic {
    public List<String> outputStudentsOfFaculty(List<Student> students, String faculty) {
        List<String> studentsNames = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                studentsNames.add(student.getFullname());
            }
        }
        return studentsNames;
    }

    public void outputStudentsByFacultiesAndCourses(List<Student> students) {
        students.sort(Comparator.comparingInt(Student::getCourse).thenComparing(Student::getFaculty));
        System.out.println(students);
        printStudentsByFacultiesAndCourses(students);
    }

    private void printStudentsByFacultiesAndCourses(List<Student> students) {
        for (int i = 1; i < 6; i++) {
            System.out.println(i + "-й курс:");
            List<Student> listOfCourse = new ArrayList<>();
            for (Student student : students) {
                if (student.getCourse() == i) {
                    listOfCourse.add(student);
                }
            }
            for (int j = 1; j < listOfCourse.size() + 1; j++) {
                System.out.println('\t' + "факультет: " + listOfCourse.get(j - 1).getFaculty());
                System.out.println('\t' + listOfCourse.get(j - 1).getFullname());
                while (j < listOfCourse.size() && listOfCourse.get(j).getFaculty().equals(listOfCourse.get(j - 1).getFaculty())) {
                    System.out.println('\t' + listOfCourse.get(j).getFullname());
                    j++;

                }
            }

        }
    }

    public List<String> outputStudentsAfterYearOfBirth(List<Student> students, int year) {
        List<String> studentsNames = new ArrayList<>();
        for (Student student : students) {
            String[] arrayDate = student.getDateOfBirth().split("\\.");
            if (Integer.parseInt(arrayDate[2]) > year) {
                studentsNames.add(student.getFullname());
            }
        }
        return studentsNames;
    }

    public List<String> outputStudentsOfGroup(List<Student> students, String group) {
        List<String> studentsNames = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                studentsNames.add(student.getFullname());
            }
        }
        return studentsNames;
    }

}
