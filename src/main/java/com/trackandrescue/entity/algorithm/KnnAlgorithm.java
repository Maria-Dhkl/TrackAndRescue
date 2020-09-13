package com.trackandrescue.entity.algorithm;

import com.trackandrescue.dao.PoliceStationDao;
import com.trackandrescue.dao.PoliceStationDaoImpl;
import com.trackandrescue.dao.UserCoordinatesDao;
import com.trackandrescue.dao.UserCoordinatesDaoImpl;
import com.trackandrescue.entity.PoliceStation;
import com.trackandrescue.util.DBConnnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/1/20
 * Time: 5:20 PM
 */
public class KnnAlgorithm {
  // public static void main(String[] args) {
//        double xCoordinate=6;
//        double yCoordinate=6;
//        double[] xCoordinates = {1.1,2.2,3.3,4.55555555,5.77777,6.5554545,7.88776,8.889993};
//        double[] yCoordinates ={1.334, 2.5445, 3.786, 4.876767, 5.65656, 6.2323, 7.545, 8.454};
//
//        int indexOfPoliceStation = difference(xCoordinate,yCoordinate,xCoordinates,yCoordinates);
//        System.out.print("Nearest police station  is:"+ indexOfPoliceStation);
//
//    }
   // public static void  calculateCoordinates()  {

//        List<PoliceStation> policeStationList = new ArrayList<PoliceStation>();
//        DBConnnection connnection = new DBConnnection();
//        String sql = "SELECT * from police_stations";
//        ResultSet rs = connnection.executeQuery(sql);
//        while(rs.next()){
//            PoliceStation policeStation = new PoliceStation();
//
//        }
      //  PoliceStationDao policeStationDao = new PoliceStationDaoImpl();
//        for(PoliceStation policeStation:policeStationDao.getAllPoliceStation()){
//
//        }


  //  }
//public void display() throws SQLException, ClassNotFoundException {
//DBConnnection dbConnnection = new DBConnnection();
//
//}

    //public static int difference(double xCoordinate,double yCoordinate,double[] xCoordinates,double[] yCoordinates){
    public int getPoliceStationId(double xCoordinate,double yCoordinate,double[] xCoordinates,double[] yCoordinates){
       // double xCoordinate=6;
      // double[] xCoordinates = new double[50];
      //  double yCoordinate=6;
     //  double[] yCoordinates = new double[50];
//       double[] xCoordinates = {1.1,2.2,3.3,4.55555555,5.77777,6.5554545,7.88776,8.889993};
//        double[] yCoordinates ={1.334, 2.5445, 3.786, 4.876767, 5.65656, 6.2323, 7.545, 8.454};

        double[] temp1 =new double[100];
        double[] temp2 =new double[100];
        double[] tempz =new double[xCoordinates.length];
        for (int i=0;i<xCoordinates.length;i++)
        {
            temp1[i] = xCoordinates[i] -xCoordinate ;
            temp1[i] = temp1[i]*temp1[i];
            temp2[i] =  yCoordinates[i] -yCoordinate ;
            temp2[i] = temp2[i]*temp2[i];
            tempz[i] = Math.abs(temp1[i]-temp2[i]);
            tempz[i] = Math.sqrt(tempz[i]);
        }
        double[] tempk = new double[tempz.length];
        int n = tempz.length;
        QuickSort quickSort = new QuickSort();
        quickSort.sort(tempz, 0, n-1);
        int nearestIndex=0;
        for ( int i=0;i<xCoordinates.length;i++)
        {
            tempk[i] = Math.abs(temp1[i]-temp2[i]);
            tempk[i] = Math.sqrt(tempk[i]);
            if (tempk[i]==tempz[0]){
                //System.out.println(i);
                nearestIndex = i;
                break;
            }

        }
        return nearestIndex;


    }



}
