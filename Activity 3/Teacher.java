class Teacher extends Person { 
    private String subject;

    public Teacher  (String AccountName, int Id, String subject) {
        super(AccountName, Id);
        this.subject = subject;

    }

    @Override
    public void displayInfo() {
    super.displayInfo();
    System.out.println("Subject: " + subject);

    }
}