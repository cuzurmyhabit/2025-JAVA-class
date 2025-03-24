package qeustion4;

abstract class Student {
    protected String name;
    protected int score;
    protected String grade;

    public Student(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public abstract void computeGrade(); // 추상 메소드 정의

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }
}