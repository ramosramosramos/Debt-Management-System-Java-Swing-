package Pages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Account {

    static Connection conn = Configurations.JavaConnection.getConnection();

    String name;
    String phone;
    String city;
    String address;
    String age;
    String created_at;

    String globalUsername;

    String phone_verified_at;

    public Account(String username) {
        try {

            PreparedStatement pst = conn.prepareStatement("Select * from users where username=?");
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                name = rs.getString("name");
                phone = rs.getString("phone");
                city = rs.getString("city");
                address = rs.getString("address");
                age = rs.getString("age");
                created_at = rs.getString("created_at");
                phone_verified_at = rs.getString("phone_verified_at");
                globalUsername= rs.getString("username");
                if (phone_verified_at == null) {
                    phone_verified_at = "Unverified";
                }

            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getPhone_verified_at() {
        return phone_verified_at;
    }

    public String getGlobalUsername() {
        return globalUsername;
    }

}
