public class Student {
    private String name;
    private boolean isPresent;
    private int mark;
    private boolean isAnswered;

    public Student(String name, boolean isPresent, int mark, boolean isAnswered) {
        this.name = name;
        this.isPresent = isPresent;
        this.mark = mark;
        this.isAnswered = isAnswered;
    }

    public String getName() {
        return name;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public int getMark() {
        return mark;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setAnswered() {
        isAnswered = true;
    }
}
