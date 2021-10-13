public class Employee {

    private String name;
    private String birthday;
    private String employmentDate;
    private String post;
    private String subordinates;
    private String description;

    public Employee(String name, String birthday, String employmentDate, String head, String managerSubs, String description) {
        this.name = name;
        this.birthday = birthday;
        this.employmentDate = employmentDate;
        this.post = head;
        this.subordinates = managerSubs;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public String getPost() {
        return post;
    }

    public String getSubordinates() {
        return subordinates;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name +'}';
    }
}
