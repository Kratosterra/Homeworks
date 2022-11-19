import java.util.ArrayList;

public class Seminar {
    private ArrayList<Student> students;

    public Seminar() {
        this.students = GenerateStudents();
    }

    private ArrayList<Student> GenerateStudents() {
        ArrayList<Student> stud = new ArrayList<Student>();
        for (int i = 0; i < 30; i++) {
            stud.add(new Student(Integer.toString(i), false , -1, false));
        }
        return stud;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Student> getAnsweredStudents() {
        ArrayList<Student> find = new ArrayList<Student>();
        for(Student s : students){
            if((s.isPresent()) && (s.getMark() >= 0)){
                find.add(s);
            }
        }
        return find;
    }

    public Student GetStudentByName(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public boolean CheckIfStudentAlreadyAnswered(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s.isAnswered();
            }
        }
        return true;
    }

    public void PrintList() {
        System.out.println("Лист-------------------------------\n");
        for(Student s : students){
            if((s.isPresent()) && (s.getMark() >= 0)){
                System.out.printf("Имя: %s ", s.getName());
                System.out.printf("Пристусвие: %s ", s.isPresent());
                System.out.printf("Оценка: %s \n", s.getMark());
            } else if (s.isAnswered()){
                System.out.printf("Имя: %s ", s.getName());
                System.out.print("Спрошен, но не приствовал на паре!\n");
            } else {
                System.out.printf("Имя: %s ", s.getName());
                System.out.print("Не спрошен\n");
            }
        }
        System.out.println("");
    }
}
