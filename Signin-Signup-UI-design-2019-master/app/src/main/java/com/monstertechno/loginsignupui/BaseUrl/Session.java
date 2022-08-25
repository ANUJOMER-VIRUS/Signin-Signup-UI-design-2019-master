package com.monstertechno.loginsignupui.BaseUrl;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.monstertechno.loginsignupui.LoginActivity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Raghvendra Sahu on 04/11/2019.
 */
public class Session extends Object {
    private static final String TAG = Session.class.getSimpleName();
    private static final String PREF_NAME = "Rapidine_pref2";
    private static final String IS_LOGGEDIN = "isLoggedIn";
    private static final String KYC = "KYC";
    private  static final String OTP="otp";
    private static final String Mobile = "mobile";
    private static final String Email = "email";
    private static final String UserId = "user_id";
    private static final String User_name = "user_name";
    private static final String Pro_Image = "pro_img";
    private static final String role = "user_role";
    private static final String onclick_ = "onclick";
    private static final String lattitude = "latt";
    private static final String longitude = "lang";
    private static final String address = "adrs";
    private static final String addressID = "adrs";
    private static final String country_id = "country_id";
    private static final String Firebase_token_id = "Firebase_token_id";
    private static final String About_us      = "about_us";
    private static final String Privacy_policy= "privacy_policy";
    private static final String Tmc          = "tmc";
    public Session session;
    private Context _context;
    public static final List<String> nami=new ArrayList<>();
    private SharedPreferences  Rapidine_pref;
    private SharedPreferences.Editor  editor;

    private Object File;

    public Session(Context context) {
        this._context = context;
        Rapidine_pref = _context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = Rapidine_pref.edit();
        editor.apply();
    }
    public void setAddress(String lang) {
        editor.putString(address, lang);
        editor.apply();
        editor.commit();
    }

    public String getAddress()
    {
        return Rapidine_pref.getString(address, "");
    }

 public void setAddressID(String lang) {
        editor.putString(addressID, lang);
        editor.apply();
        editor.commit();
    }
 public String getAbout_us()
    {
        return Rapidine_pref.getString(About_us, "");
    }

 public void setAbout_us(String ab) {
        editor.putString(About_us, ab);
        editor.apply();
        editor.commit();
    }


    public String getTmc()
    {
        return Rapidine_pref.getString(Privacy_policy, "");
    }

 public void setTmc(String tmc) {
        editor.putString(Tmc, tmc);
        editor.apply();
        editor.commit();
    }
 public String getPrivacy_policy()
    {
        return Rapidine_pref.getString(Privacy_policy, "");
    }

 public void setPrivacy_policy(String pp) {
        editor.putString(Privacy_policy, pp);
        editor.apply();
        editor.commit();
    }

    public String getAddressID()
    {
        return Rapidine_pref.getString(addressID, "");
    }



   public void setcountry_id(String countid) {
        editor.putString(country_id, countid);
        editor.apply();
        editor.commit();
    }

    public String getcountry_id() {
        return Rapidine_pref.getString(country_id, "");
    }


   public void setFirebase_token_id(String fcm) {
        editor.putString(Firebase_token_id, fcm);
        editor.apply();
        editor.commit();
    }

    public String getFirebase_token_id() {
        return Rapidine_pref.getString(Firebase_token_id, "");
    }


    public void setMobile(String mobile, String email) {
        editor.putString(Mobile, mobile);
        editor.putString(Email, email);
        editor.apply();
        editor.commit();
    }


    public String getMobile() {
        return Rapidine_pref.getString(Mobile, "");

    }



    public void setLattitude(String lang) {
        editor.putString(lattitude, lang);
        editor.apply();
        editor.commit();
    }

    public String getLattitude()
    {
        return Rapidine_pref.getString(lattitude, "");
    }


    public void setLongitude(String lang) {
        editor.putString(longitude, lang);
        editor.apply();
        editor.commit();
    }

    public String getLongitude()
    {
        return Rapidine_pref.getString(longitude, "");
    }

    public  void setPhoto(File file){
        editor.apply();
        editor.commit();

}
 public  String getPro_Image(){
        return  Rapidine_pref.getString( Pro_Image , "");
 }
  public  void  setPro_Image(String pro_Image){
         editor.putString( Pro_Image ,pro_Image);
      editor.apply();
      editor.commit();
  }


    public void setOnclick(String onclick) {
        editor.putString(onclick_, onclick);
        editor.apply();
        editor.commit();
    }

    public String getOnclick() {
        return Rapidine_pref.getString(onclick_, "");

    }


    public String getUser_name() {
        return Rapidine_pref.getString(User_name, "");

    }
    public void setUserId(String userId) {
        editor.putString(UserId, userId);
        this.editor.apply();
    }




    public String getUserId() {
        return Rapidine_pref.getString(UserId, "");
    }




    public void setUser_name(String user_name) {
        editor.putString(User_name, user_name);
        this.editor.apply();
    }

    public String getEmail() {
        return Rapidine_pref.getString(Email, "");
    }

    public void setOtp(String otp) {
        editor.putString(OTP ,otp);
        this.editor.apply();
    }
    public String getOtp(){
        return Rapidine_pref.getString(OTP,"");
    }

    public String getKYC() {
        return Rapidine_pref.getString(KYC,"");

    }
    public void setKYC(String kyc) {
        editor.putString(KYC, kyc);
        this.editor.apply();
    }



    public void logout() {
        editor.clear();
        editor.apply();
        Intent showLogin = new Intent(_context, LoginActivity.class);
        showLogin.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        showLogin.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        _context.startActivity(showLogin);
    }




    public void setLogin(boolean isLoggedIn) {
        editor.putBoolean(IS_LOGGEDIN, isLoggedIn);
        editor.commit();
    }

    public boolean isLoggedIn() {
        return Rapidine_pref.getBoolean(IS_LOGGEDIN, false);
    }
    
}
