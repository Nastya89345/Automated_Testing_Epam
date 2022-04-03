public class Demo {
    public static void main(String[] args) {
        GeneralGroup generalGroup = new GeneralGroup();
        generalGroup.addStudentToGeneralGroup(new Student(123, "Alisson Ramses Becker", "02.10.1992", "IPK", 5, "I-5"));
        generalGroup.addStudentToGeneralGroup(new Student(124, " Aderbar Melo dos Santos Neto", "17.03.1990", "NPK", 4, "N-4"));
        generalGroup.addStudentToGeneralGroup(new Student(125, " Éverson Felipe Marques Pires", "22.06.1990", "MPK", 3, "M-3"));
        generalGroup.addStudentToGeneralGroup(new Student(126, " Marcos Aoás Corrêa", "14.05.1994", "MPK", 5, "M-5"));
        generalGroup.addStudentToGeneralGroup(new Student(127, " Éder Gabriel Militão", "18.01.1998", "NPK", 5, "N-5"));
        generalGroup.addStudentToGeneralGroup(new Student(128, " Felipe Augusto de Almeida", "16.05.1989", "IPK", 5, "I-5"));
        generalGroup.addStudentToGeneralGroup(new Student(129, " Thiago Emiliano da Silva", "22.09.1984", "NPK", 4, "N-4"));
        generalGroup.addStudentToGeneralGroup(new Student(130, " Alex Nicolao Telles", "15.12.1992", "MPK", 4, "M-4"));
        generalGroup.addStudentToGeneralGroup(new Student(131, " Guilherme Arana", "14.14.1997", "IPK", 3, "I-3"));
        generalGroup.addStudentToGeneralGroup(new Student(132, " Daniel Alves da Silva", "16.05.1983", "NPK", 3, "N-3"));
        generalGroup.addStudentToGeneralGroup(new Student(133, "Fabio Henrique Tavares", "23.10.1993", "IPK", 4, "I-4"));
        generalGroup.addStudentToGeneralGroup(new Student(134, "Carlos Henrique José Francisco Venancio Casimiro", "23.02.1992", "MPK", 2, "M-2"));
        generalGroup.addStudentToGeneralGroup(new Student(135, " Bruno Guimarães Rodrigues Moura", "16.11.1997", "IPK", 3, "I-3"));
        generalGroup.addStudentToGeneralGroup(new Student(136, "Frederico Rodrigues de Paula Santos", "05.03.1993", "NPK", 3, "N-3"));
        generalGroup.addStudentToGeneralGroup(new Student(137, "Arthur Henrique Ramos de Oliveira Melo", "12.08.1996", "MPK", 3, "M-3"));
        generalGroup.addStudentToGeneralGroup(new Student(138, " Lucas Tolentino Coelho de Lima", "27.08.1997", "MPK", 3, "M-3"));
        generalGroup.addStudentToGeneralGroup(new Student(139, "Vinicius José Paixão de Oliveira Junior", "12.07.2000", "NPK", 2, "N-2"));
        generalGroup.addStudentToGeneralGroup(new Student(140, "Neymar da Silva Santos Júnior", "05.02.1992", "IPK", 2, "I-2"));
        generalGroup.addStudentToGeneralGroup(new Student(141, " Gabriel Teodoro Martinelli Silva", "18.07.2001", "MPK", 2, "M-2"));
        generalGroup.addStudentToGeneralGroup(new Student(142, "Philippe Coutinho Correia", "12.07.1992", "IPK", 1, "I-1"));
        generalGroup.addStudentToGeneralGroup(new Student(143, "Rodrygo Silva de Goes", "09.01.2001", "NPK", 1, "N-1"));
        generalGroup.addStudentToGeneralGroup(new Student(144, "Antony Matheus dos Santos", "24.02.2000", "IPK", 1, "I-1"));
        generalGroup.addStudentToGeneralGroup(new Student(145, " Richarlison de Andrade", "10.05.1997", "IPK", 1, "I-1"));
        GroupLogic groupLogic = new GroupLogic();
        System.out.println(groupLogic.outputStudentsOfFaculty(generalGroup.getStudents(), "IPK"));
        groupLogic.outputStudentsByFacultiesAndCourses(generalGroup.getStudents());
        System.out.println(groupLogic.outputStudentsAfterYearOfBirth(generalGroup.getStudents(), 2000));
        System.out.println(groupLogic.outputStudentsOfGroup(generalGroup.getStudents(), "I-1"));


    }
}
