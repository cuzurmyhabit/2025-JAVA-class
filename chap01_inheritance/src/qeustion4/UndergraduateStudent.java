package qeustion4;

class UndergraduateStudent extends Student {
	public UndergraduateStudent(String name) {
        super(name);
    }

    @Override
    public void computeGrade() {
        if (score >= 70) {
            grade = "통과";
        } else {
            grade = "낙제";
        }
    }
}
    
