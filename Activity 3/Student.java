class Student extends Person { 
    private String gradeLevel;

    public Student (String AccountName, int Id, String gradeLevel) {
        super(AccountName, Id);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    System.out.println("Grade Level: " + gradeLevel);
    }


}
