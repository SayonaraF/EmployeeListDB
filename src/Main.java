import DBConnection.DataBaseHandler;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XMLSaxParser parser = new XMLSaxParser();
        ArrayList<Employee> employees = parser.parse();

        DataBaseHandler handler = new DataBaseHandler();
        for (Employee employee : employees) {
            handler.signUpEmployee(employee.getName(), employee.getBirthday(), employee.getEmploymentDate(), employee.getPost(),
                    employee.getSubordinates(), employee.getDescription());
        }
    }
}
