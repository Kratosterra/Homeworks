import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Seminar seminar = new Seminar();
        System.out.print("Начался семинар, для завершения введите команду \\end!\n");
        System.out.print("\\h - типо старт?\n\\r - выбрать случайного студента\n\\l - лист студентов с оценками\n");
        String input = "";
        while (!Objects.equals(input, "\\end")) {
            input = in.nextLine();
            switch (input) {
                case ("\\h") -> System.out.println("Типо старт...");
                case ("\\r") -> {
                    int randomName = ((int) (Math.random() * 30));
                    String name = Integer.toString(randomName);
                    Student student = seminar.GetStudentByName(name);
                    if (seminar.CheckIfStudentAlreadyAnswered(name)) {
                        System.out.println("Студент уже отвечал!");
                    } else {
                        System.out.printf("Отвечает Студент %s\n", student.getName());
                        System.out.println("Присутсвует ли студент на паре (y/n)?");
                        String r_input = in.nextLine();
                        if (Objects.equals(r_input, "y")) {
                            student.setPresent(true);
                            System.out.print("Оценка за ответ (0-10): ");
                            int num = in.nextInt();
                            student.setMark(num);
                        } else {
                            student.setPresent(false);
                        }
                    }
                    student.setAnswered();
                    System.out.println("Студент завершено.");
                    break;
                }
                case ("\\l") -> seminar.PrintList();
                case ("\\end") -> System.out.println("Завершение!");
                default -> System.out.println("Я не знаю такой команды");
            }
        }
    }
}