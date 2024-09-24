package jdbc.ex_00_3.application;

import jdbc.ex_00_1.db.DbException;
import jdbc.ex_00_3.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();

            preparedStatement = connection.prepareStatement("UPDATE seller SET basesalary = basesalary + ? WHERE " +
                    "departmentid = ?");

            preparedStatement.setDouble(1, 200.00);
            preparedStatement.setInt(2, 2);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}
