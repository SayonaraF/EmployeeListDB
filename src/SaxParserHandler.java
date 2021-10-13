import org.w3c.dom.ls.LSOutput;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class SaxParserHandler extends DefaultHandler {
    private ArrayList<Employee> employees = new ArrayList<>();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        String name = attributes.getValue("name");
        String birthday = attributes.getValue("birthday");
        String employmentDate = attributes.getValue("employmentDate");
        String post = attributes.getValue("post");
        String subordinates = attributes.getValue("subordinates");
        String description = attributes.getValue("description");

        if (name != null) {
            Employee employee = new Employee(name, birthday, employmentDate, post, subordinates, description);
            employees.add(employee);
        }
    }
}
