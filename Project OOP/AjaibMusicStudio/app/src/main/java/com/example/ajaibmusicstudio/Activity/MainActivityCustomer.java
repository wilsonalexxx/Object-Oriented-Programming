package com.example.ajaibmusicstudio.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ajaibmusicstudio.R;
import com.example.ajaibmusicstudio.bookingRoomCustomer;
import com.example.ajaibmusicstudio.selectionRoomType;

public class MainActivityCustomer extends AppCompatActivity {
    private Button AvailableBtnC;
    private Button BookingRoomBtnC;
    private Button CancelBookingBtnC;
    private Button BookingHistoryBtnC;
    private Button LogoutBtnC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_customer);
        InitViews();

        AvailableBtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), selectionRoomType.class);
                startActivity(intent);
            }
        });

        BookingRoomBtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), bookingRoomCustomer.class);
                startActivity(intent2);
            }
        });

        CancelBookingBtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Available Soon!!",Toast.LENGTH_SHORT).show();
            }
        });

        BookingHistoryBtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Available Soon!!",Toast.LENGTH_SHORT).show();
            }
        });

        LogoutBtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void InitViews(){
        AvailableBtnC = (Button) findViewById(R.id.List_Room);
        BookingRoomBtnC = (Button) findViewById(R.id.BookingRm);
        CancelBookingBtnC = (Button) findViewById(R.id.CancelBook);
        BookingHistoryBtnC = (Button) findViewById(R.id.BookingH);
        LogoutBtnC = (Button) findViewById(R.id.LogoutBtnC);
    }
}