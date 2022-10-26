package Essence;

import Object.*;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Update {


    /**
     * Update service
     * getUpdate ->for get object and don't repeat
     * updateUser -> for users all field update
     * updateField -> for given field users update
     * addUser() -> ProjectDb add user;
     */

    private static final Update update = new Update();

    public static Update getUpdate() {
        return update;
    }


    public void addUser(User user) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String URL = "jdbc:postgresql://localhost:5432/postgres";
        String USERNAME = "postgres";
        String PASSWORD = "1234";
        String QUERY1 = "insert into users_data(first_name,last_name,fathers_name" +
                ",email,gender,ip_address," +
                "username,password,phone_number," +
                "address,country,country_code,jobs)";
        String QUERY2 = "values ("+user.getFathersName()+","+user.getLastName()+","+
                user.getFathersName()+","+user.getEmail()+","+user.getGender()+","+
                user.getIpAddress()+","+user.getUsername()+","+user.getPassword()+","+
                user.getPhoneNumber()+","+user.getAddress()+","+user.getCountry()+","+
                user.getCountryCode()+","+user.getJobs()+");";
        Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        Statement statement = conn.createStatement();
        statement.executeUpdate(QUERY1+QUERY2);
        conn.close();
    }

}
