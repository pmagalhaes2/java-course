package jdbc.ex_00.application;

import jdbc.ex_00.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection connection = DB.getConnection();
        DB.closeConnection();
    }
}
