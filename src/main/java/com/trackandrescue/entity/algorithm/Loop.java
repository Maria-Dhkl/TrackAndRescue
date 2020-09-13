package com.trackandrescue.entity.algorithm;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/1/20
 * Time: 5:20 PM
 */
public class Loop {
    public static void main(String[] args) {
        int x=6;
        int y=6;
       int indexOfPoliceStation = difference(x,y);
        System.out.print("Nearest police station  is:"+ indexOfPoliceStation);


        }



    public static int difference(int a, int b){
        double[] x1 = {1.1,2.2,3.3,4.55555555,5.77777,6.5554545,7.88776,8.889993};
        double[] y1 = {1.334,2.5445,3.786,4.876767,5.65656,6.2323,7.545,8.454};
        double[] temp1 =new double[50];
        double[] temp2 =new double[50];
        double[] tempz =new double[x1.length];
        for (int i=0;i<x1.length;i++)
        {
            temp1[i] = x1[i] -a ;
            temp1[i] = temp1[i]*temp1[i];


            temp2[i] =  y1[i] -b ;
            temp2[i] = temp2[i]*temp2[i];
    //        System.out.println(temp2[i]);
             tempz[i] = Math.abs(temp1[i]-temp2[i]);
             tempz[i] = Math.sqrt(tempz[i]);
//           System.out.println(tempz[i]);
      //     System.out.println("\r\n");

        }
       double[] tempk = new double[tempz.length];
//        for(int k=0;k<tempk.length;k++){
//        System.out.println(tempk[k]);}

        int n = tempz.length;
        QuickSort quickSort = new QuickSort();
        quickSort.sort(tempz, 0, n-1);
        //System.out.println(tempz[0]);
        int nearestIndex=0;
      // for nearest police station
        for ( int i=0;i<x1.length;i++)
        {

           // System.out.println("it is loop " + i);
//            System.out.println(tempz[i]);
//            temp1[i] = x1[i] -a ;
//            temp2[i] =  y1[i] -b ;
//            tempk[i] = temp1[i]-temp2[i];
        //    System.out.println(temp1[i]);
         //   System.out.println(temp2[i]);
            tempk[i] = Math.abs(temp1[i]-temp2[i]);
          //  System.out.println(tempk[i]);
            tempk[i] = Math.sqrt(tempk[i]);
//            System.out.println(tempk[i]);
//            System.out.println(tempz[0]);
//            System.out.println("\r\n");

            //  System.out.println(tempz[i]);
            if (tempk[i]==tempz[0]){
                System.out.println(i);
                nearestIndex = i;
                break;
            }

        }
        return nearestIndex;


    }



}
