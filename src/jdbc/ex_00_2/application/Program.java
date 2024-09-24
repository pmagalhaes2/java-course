package jdbc.ex_00_2.application;

import jdbc.ex_00_1.db.DbException;
import jdbc.ex_00_2.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();
            //            preparedStatement = connection.prepareStatement(
            //                    "INSERT INTO seller (name, email, birthdate, basesalary, departmentid) VALUES ( ?, ?, ?, ?," +
            //                            " ?)", Statement.RETURN_GENERATED_KEYS);
            //
            //            preparedStatement.setString(1, "Carl Purple");
            //            preparedStatement.setString(2, "carl@gmail.com");
            //            preparedStatement.setDate(3, new Date(sdf.parse("12/03/1658").getTime()));
            //            preparedStatement.setDouble(4, 6500.0);
            //            preparedStatement.setInt(5, 2);

            preparedStatement = connection.prepareStatement("insert into department (name) values ('d1'), ('d2')",
                    Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rows affected!");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
//        catch (ParseException e) {
//            throw new RuntimeException(e);
//        }

    }
}
