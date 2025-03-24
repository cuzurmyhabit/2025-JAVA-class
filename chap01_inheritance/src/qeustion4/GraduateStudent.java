package qeustion4;

class GraduateStudent extends Student {
    public GraduateStudent(String name) {
        super(name);
    }

    @Override
    public void computeGrade() {
        if (score >= 80) {
            grade = "통과";
        } else {
            grade = "낙제";
        }
    }
}

