import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class XMLSaxParser {

    public ArrayList<Employee> parse() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();
        SAXParser parser;
        try {
            parser = factory.newSAXParser();
            File file = new File("employees.xml");
            parser.parse(file, handler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return handler.getEmployees();
    }
}
