package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHandler extends Configs {
    Connection dbConnection;

    private Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser,dbPass);

        return dbConnection;
    }

    public void signUpEmployee(String name, String birthday, String employmentDate, String post, String subordinates, String description) {
        String insert = "INSERT INTO " + Const.EMPLOYEE_TABLE + "(" + Const.EMPLOYEE_NAME + "," + Const.EMPLOYEE_BIRTHDAY + ","
                + Const.EMPLOYEE_EMPLOYMENT_DATE + "," + Const.EMPLOYEE_POST + "," + Const.EMPLOYEE_SUBORDINATES + ","
                + Const.EMPLOYEE_DESCRIPTION + ")" + "VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement statement = getDbConnection().prepareStatement(insert);
            statement.setString(1, name);
            statement.setString(2, birthday);
            statement.setString(3, employmentDate);
            statement.setString(4, post);
            statement.setString(5, subordinates);
            statement.setString(6, description);
            statement.executeUpdate();
        } catch (SQLException | ClassNotFoundException throwable) {
            throwable.printStackTrace();
        }
    }
}
