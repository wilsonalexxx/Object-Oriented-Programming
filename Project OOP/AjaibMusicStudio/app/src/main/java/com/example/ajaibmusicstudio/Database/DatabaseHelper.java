package com.example.ajaibmusicstudio.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.ajaibmusicstudio.Object.Admin;
import com.example.ajaibmusicstudio.Object.Booking;
import com.example.ajaibmusicstudio.Object.Customer;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper{
    // Admin Table
    public static final String ADMIN_TABLE = "ADMIN_TABLE";
    public static final String ID_ADMIN= "ID_ADMIN";
    public static final String AFIRST_NAME = "AFIRST_NAME";
    public static final String ALAST_NAME = "ALAST_NAME";
    public static final String AEMAIL = "AEMAIL";
    public static final String AUSERNAME = "AUSERNAME";
    public static final String APASSWORD = "APASSWORD";

    // Customer Table
    public static final String CUSTOMER_TABLE = "CUSTOMER_TABLE";
    public static final String ID_CUSTOMER= "ID_CUSTOMER";
    public static final String CFIRST_NAME = "CFIRST_NAME";
    public static final String CLAST_NAME = "CLAST_NAME";
    public static final String CEMAIL = "CEMAIL";
    public static final String CUSERNAME = "CUSERNAME";
    public static final String CPASSWORD = "CPASSWORD";
    // Booking Table
    public static final String BOOKING_TABLE = "BOOKING_TABLE";
    public static final String ID_BOOKING = "ID_BOOKING";
    public static final String ID_CUSTOMER_BOOKING = "ID_CUSTOMER_BOOKING";
    public static final String ROOM = "Room";
    public static final String DATE = "DATE";
    public static final String TIME = "TIME";
    public static final String DURATION = "DURATION";
    public static final String STATUS = "STATUS";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "StudioMusic.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String Admin_Table = "CREATE TABLE " + ADMIN_TABLE + " (" + ID_ADMIN + " INTEGER PRIMARY KEY AUTOINCREMENT, " + AFIRST_NAME + " TEXT, " + ALAST_NAME + " TEXT, " + AEMAIL + " TEXT," + AUSERNAME + " TEXT," + APASSWORD + " TEXT)";
        String Customer_Table = "CREATE TABLE " + CUSTOMER_TABLE + " (" + ID_CUSTOMER + " INTEGER PRIMARY KEY AUTOINCREMENT, " + CFIRST_NAME + " TEXT, " + CLAST_NAME + " TEXT, " + CEMAIL + " TEXT, " + CUSERNAME + " TEXT, " + CPASSWORD + " TEXT)";
        String Booking_Table = "CREATE TABLE " + BOOKING_TABLE + "(" + ID_BOOKING + " INTEGER PRIMARY KEY AUTOINCREMENT, " + ID_CUSTOMER_BOOKING + " INT, " + ROOM + " TEXT," + DATE + " TEXT," + TIME + " TEXT, " + DURATION + " TEXT, " + STATUS + " TEXT)";

        db.execSQL(Admin_Table);
        db.execSQL(Customer_Table);
        db.execSQL(Booking_Table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ADMIN_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + CUSTOMER_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + BOOKING_TABLE);
    }

    public boolean AddOneCustomer(Customer customer){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(CFIRST_NAME,customer.getFirstName());
        cv.put(CLAST_NAME, customer.getLastName());
        cv.put(CEMAIL,customer.getEmail());
        cv.put(CUSERNAME,customer.getUsername());
        cv.put(CPASSWORD,customer.getPassword());
        long insert = db.insert(CUSTOMER_TABLE, null,cv);
        db.close();

        if(insert == -1){
            return false;
        }else {
            return true;
        }

    }

    public boolean AddOneBooking(Booking booking){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(ID_CUSTOMER,booking.getId_customer());
        cv.put(ROOM,booking.getRoomname());
        cv.put(DATE,booking.getDate());
        cv.put(TIME,booking.getTime());
        cv.put(DURATION,booking.getDuration());
        cv.put(STATUS,booking.getStatue());

        long insert = db.insert(BOOKING_TABLE,null,cv);
        db.close();

        if(insert == -1){
            return false;
        } else {
            return true;
        }
    }

    public Admin getadmin(String Email){
        Admin admin = null;
        String query = "SELECT * FROM" + ADMIN_TABLE + " WHERE AEMAIL " + Email;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query,null);

        if(cursor.moveToFirst()){
            int id_admin = cursor.getInt(0);
            String firstname = cursor.getString(1);
            String lastname = cursor.getString(2);
            String email = cursor.getString(3);
            String username = cursor.getString(4);
            String password = cursor.getString(5);

            admin = new Admin(id_admin,firstname,lastname,email,username,password);
        }else {

        }
        cursor.close();
        db.close();

        return admin;
    }

    public Customer getcustomer(String Email){
        Customer cs = null;
        String query = "SELECT * FROM" + CUSTOMER_TABLE + " WHERE CEMAIL " + Email;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query,null);

        if(cursor.moveToFirst()){
            int id_customer = cursor.getInt(0);
            String firstname = cursor.getString(1);
            String lastname = cursor.getString(2);
            String email = cursor.getString(3);
            String username = cursor.getString(4);
            String password = cursor.getString(5);

            cs = new Customer(id_customer,firstname,lastname,email,username,password);
        }else {

        }
        cursor.close();
        db.close();

        return cs;
    }


    public List<Booking> getEveryOneHistory(){
        List<Booking> returnlist = new ArrayList<>();
        String queryString = "SELECT * FROM " + BOOKING_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString,null);

        if(cursor.moveToFirst()){
            do{
                int id_booking = cursor.getInt(0);
                int id_customer = cursor.getInt(1);
                String roomname = cursor.getString(2);
                String date = cursor.getString(3);
                String time = cursor.getString(4);
                String duration = cursor.getString(5);
                String statue = cursor.getString(6);

                Booking newBooking = new Booking(id_booking,id_customer,roomname,date,time,duration,statue);
                returnlist.add(newBooking);
            }while (cursor.moveToNext());

        }else {
            //
        }
        cursor.close();
        db.close();
        return returnlist;
    }

    public boolean CheckEmailAndPasswordAdmin(String Email,String Password){
        String[] colums = {ID_ADMIN};
        SQLiteDatabase DB = getReadableDatabase();
        String Selection = AEMAIL + "=?" + " AND " + APASSWORD + "=?";
        String[] Selection1 = {Email,Password};
        Cursor cursor = DB.query(ADMIN_TABLE, colums,Selection,Selection1,null,null,null);
        int count = cursor.getCount();
        DB.close();

        if (count > 0){
            return true;
        } else {
            return  false;
        }
    }

    public boolean CheckEmailAndPasswordCustomer(String Email,String Password){
        String[] colums = {ID_CUSTOMER};
        SQLiteDatabase DB = getReadableDatabase();
        String Selection = CEMAIL + "=?" + " AND " + CPASSWORD + "=?";
        String[] Selection1 = {Email,Password};
        Cursor cursor = DB.query(CUSTOMER_TABLE,colums,Selection,Selection1,null,null,null);
        int count = cursor.getCount();
        DB.close();

        if(count > 0){
            return true;
        } else {
            return false;
        }
    }
    /*
    public boolean DeleteOne(Booking booking){
        SQLiteDatabase db = this.getWritableDatabase();
        String Query = "De"
    }
    */
}
