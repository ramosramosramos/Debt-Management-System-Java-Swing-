/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class DashBoard {

    static Connection conn = Configurations.JavaConnection.getConnection();

    String countUser;
    String countUnverified;

    String countMale;
    String countFemale;


    String unpaidUser;
    String paidUser;

    public DashBoard() {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT COUNT(users.id) AS 'user_count', "
                    + "COUNT(CASE WHEN users.phone_verified_at IS NULL THEN 1 END) AS 'unverified',"
                    + "count(case when users.gender ='Male' then 1 end) as 'male', "
                    + "count(case when users.gender ='Female' then 1 end) as 'female' ,"
                    + "count(case when debts.status='Uncomplete' then 1 end ) as 'unpaid',"
                    + "count(case when debts.status='Fully paid' then 1 end ) as 'paid'"
                    + "FROM users  join debts on users.id = debts.user_id WHERE role = 'customer'");

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                countUser = rs.getString("user_count");
                countUnverified = rs.getString("unverified");
                countMale = rs.getString("male");
                countFemale = rs.getString("female");
                unpaidUser = rs.getString("unpaid");
                paidUser = rs.getString("paid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getCountUser() {
        return countUser;
    }

    public String getCountUnverified() {
        return countUnverified;
    }

    public String getCountMale() {
        return countMale;
    }

    public String getCountFemale() {
        return countFemale;
    }
        public String getUnpaidUser() {
        return unpaidUser;
    }

    public String getPaidUser() {
        return paidUser;
    }
}
