package com.trackandrescue.entity;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/30/20
 * Time: 2:06 PM
 */
public class SmsApi {


    public static final String ACCOUNT_SID = "AC98cd6d2d856feb71dd4ba2d72187b8d4";
    public static final String AUTH_TOKEN = "d01a6c5c35095d15735ba4b0e47fb130";
    //private String phoneNumber;
//private String message;
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
    public void sendSms(String phoneNumber,String msg){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(new PhoneNumber(phoneNumber),
                new PhoneNumber("+18064244997"),
                msg).create();
    }

//    public static void main(String[] args) {
//            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//            Message message = Message.creator(new PhoneNumber("+13322200418"),
//                    new PhoneNumber("+12026883912"),
//                    "Aba kam gariraxa").create();
//            /* yo garda ne hunxa
//            Message message = Message.creator(new PhoneNumber("+13322200418"),
//                    new PhoneNumber("+12026883912"),
//                    "Aba kam gariraxa")
//                    .setMediaUrl("localhost:8080/ddfdfdf")
//                    .create();
//
//            System.out.println(message.getSid());
//
//             */
//
//    }
}