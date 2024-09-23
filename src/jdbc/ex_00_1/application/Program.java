package jdbc.ex_00_1.application;

import jdbc.ex_00_1.db.DB;
import jdbc.ex_00_1.db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from department");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString(
                        "Name"
                ));
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(resultSet);
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
