package jdbc.ex_00_4.application;

import jdbc.ex_00_1.db.DbException;
import jdbc.ex_00_3.db.DB;
import jdbc.ex_00_4.db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();

            preparedStatement = connection.prepareStatement("DELETE FROM department WHERE " +
                    "id = ?");

            preparedStatement.setInt(1, 2);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}
