class Staff extends Person { 
    private String department;

    public Staff (String AccountName, int Id, String department) {
        super(AccountName, Id);
        this.department = department;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    System.out.println("Department: " + department);
    
    }
}