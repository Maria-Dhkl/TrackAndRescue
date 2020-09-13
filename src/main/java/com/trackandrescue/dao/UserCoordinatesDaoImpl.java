package com.trackandrescue.dao;

import com.trackandrescue.entity.Customer;
import com.trackandrescue.entity.PoliceStation;
import com.trackandrescue.entity.SmsApi;
import com.trackandrescue.entity.UserCoordinates;
import com.trackandrescue.entity.algorithm.KnnAlgorithm;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/21/20
 * Time: 5:46 PM
 */
public class UserCoordinatesDaoImpl  implements UserCoordinatesDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void addUserCoordinates(UserCoordinates userCoordinates) {
        SmsApi smsApi = new SmsApi();

        if (userCoordinates.getNoOfClick() == 2) {
            try {
                int userId = userCoordinates.getUid();
//                System.out.println(userId);
                String check = "SELECT uid FROM user_coordinates WHERE uid=?";
                String uId = template.queryForObject(check, new Object[]{
                        userCoordinates.getUid()}, String.class);
                String sql = "UPDATE user_coordinates SET active='" + userCoordinates.getActive() + "',x_coordinates='" + userCoordinates.getxCoordinates() + "',y_coordinates='" + userCoordinates.getyCoordinates() + "' WHERE uid='" + userId + "'";
                template.update(sql);
            } catch (Exception exception) {
//yesma family member ko number taneko xu

                String familyMemberNumberQry = "SELECT family_member_number FROM customers WHERE id=?";
                String familyMemberNumber = template.queryForObject(familyMemberNumberQry, new Object[]{
                        userCoordinates.getUid()}, String.class);
                //yesma family member ko name taneko xu
                String familyMemberNameQry = "SELECT family_member_name FROM customers WHERE id=?";
                String familyMemberName = template.queryForObject(familyMemberNameQry, new Object[]{
                        userCoordinates.getUid()}, String.class);
                //   yesma userko first name taneko xu
                String userNameQry = "SELECT first_name FROM customers WHERE id=?";
                String firstName = template.queryForObject(userNameQry, new Object[]{
                        userCoordinates.getUid()}, String.class);


                smsApi.sendSms("+1" + familyMemberNumber, "hello " + familyMemberName + ",I am" + firstName + ",I am really  In big problem please trace me.Find me at http://localhost:8080/TrackAndRescue/FamilyMemberView/"+userCoordinates.getUid());

                String sql = "INSERT INTO user_coordinates(uid,pid,active,x_coordinates,y_coordinates)VALUES('" + userCoordinates.getUid() + "','0','" + userCoordinates.getActive() + "','" + userCoordinates.getxCoordinates() + "','" + userCoordinates.getyCoordinates() + "')";
                template.update(sql);
            }
        } else {


            try {
                int userId = userCoordinates.getUid();
                String check = "SELECT uid FROM user_coordinates WHERE uid=?";
                String uId = template.queryForObject(check, new Object[]{
                        userCoordinates.getUid()}, String.class);
                String sql = "UPDATE user_coordinates SET active='" + userCoordinates.getActive() + "',x_coordinates='" + userCoordinates.getxCoordinates() + "',y_coordinates='" + userCoordinates.getyCoordinates() + "' WHERE uid='" + userId + "'";
                template.update(sql);
            } catch (Exception exception) {
//yesma family member ko number taneko xu

                String familyMemberNumberQry = "SELECT family_member_number FROM customers WHERE id=?";
                String familyMemberNumber = template.queryForObject(familyMemberNumberQry, new Object[]{
                        userCoordinates.getUid()}, String.class);
                //yesma family member ko name taneko xu
                String familyMemberNameQry = "SELECT family_member_name FROM customers WHERE id=?";
                String familyMemberName = template.queryForObject(familyMemberNameQry, new Object[]{
                        userCoordinates.getUid()}, String.class);
                //   yesma userko first name taneko xu
                String userNameQry = "SELECT first_name FROM customers WHERE id=?";
                String firstName = template.queryForObject(userNameQry, new Object[]{
                        userCoordinates.getUid()}, String.class);


                smsApi.sendSms("+1" + familyMemberNumber, "hello " + familyMemberName + ",I am" + firstName + ",I am In trouble please trace me.Find me at http://localhost:8080/TrackAndRescue/FamilyMemberView/"+userCoordinates.getUid());

//                String sql = "INSERT INTO user_coordinates(uid,pid,active,x_coordinates,y_coordinates)VALUES('" + userCoordinates.getUid() + "','0','" + userCoordinates.getActive() + "','" + userCoordinates.getxCoordinates() + "','" + userCoordinates.getyCoordinates() + "')";
//                template.update(sql);
//            }


            //yesma knn alg ko xa

            int counter = 1;
            double[] xCoordinates = new double[100];
            double[] yCoordinates = new double[100];
            boolean condition = true;


//            System.out.println("-------------------------------");
            do {
                try {
                    String xCoordinateQuery = "SELECT address_x_coordinate FROM police_stations WHERE pid=?";
                    double xCoordinate = template.queryForObject(xCoordinateQuery, new Object[]{
                            counter}, double.class);
                    xCoordinates[counter] = xCoordinate;

                    String yCoordinateQuery = "SELECT address_y_coordinate FROM police_stations WHERE pid=?";
                    double yCoordinate = template.queryForObject(yCoordinateQuery, new Object[]{
                            counter}, double.class);
                    yCoordinates[counter] = yCoordinate;
                    counter++;
                } catch (Exception e) {
                    // System.out.println("exception vayo hae");
                    condition = false;
                }
            } while (condition);
//           for (int i=1;i<counter;i++){
//               System.out.println(xCoordinates[i]);
//               System.out.println(yCoordinates[i]);
//           }


//            System.out.println("-------------------------------");
            double userXCoordinate = userCoordinates.getxCoordinates();
            double userYCoordinate = userCoordinates.getyCoordinates();
            KnnAlgorithm knnAlgorithm = new KnnAlgorithm();
            int policeStationId = knnAlgorithm.getPoliceStationId(userXCoordinate, userYCoordinate, xCoordinates, yCoordinates);
            //   System.out.println("nearest police station id is"+ policeStationId);

            //  System.out.println("*************");
            String sql = "INSERT INTO user_coordinates(uid,pid,active,x_coordinates,y_coordinates)VALUES('" + userCoordinates.getUid() + "','" + policeStationId + "','" + userCoordinates.getActive() + "','" + userCoordinates.getxCoordinates() + "','" + userCoordinates.getyCoordinates() + "')";
            template.update(sql);
        }
    }

}

    @Override
    public List<UserCoordinates> getUserCoordinates() {
        return template.query("select * from user_coordinates WHERE active=1",new RowMapper<UserCoordinates>(){
            public UserCoordinates mapRow(ResultSet rs, int row) throws SQLException {
                UserCoordinates userCoordinates = new UserCoordinates();
                userCoordinates.setId(rs.getInt(1));
               userCoordinates.setUid(rs.getInt(2));
               userCoordinates.setPid(rs.getInt(3));
               userCoordinates.setActive(rs.getInt(4));
               userCoordinates.setxCoordinates(rs.getDouble(5));
               userCoordinates.setyCoordinates(rs.getDouble(6));
                return userCoordinates;
            }
        });

    }

    @Override
    public UserCoordinates getUserCoordinatesById(int uid) {
        try {
            String sql = "SELECT * from user_coordinates where uid=?";
            return template.queryForObject(sql, new Object[]{uid}, new BeanPropertyRowMapper<UserCoordinates>(UserCoordinates.class));
        }catch (Exception e){
//            System.out.println("exception vayo hae");
            return null;
        }

    }
}
