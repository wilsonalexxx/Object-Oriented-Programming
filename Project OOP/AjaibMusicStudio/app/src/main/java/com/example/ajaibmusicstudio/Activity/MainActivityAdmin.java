package com.example.ajaibmusicstudio.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ajaibmusicstudio.R;

public class MainActivityAdmin extends AppCompatActivity {
    private Button BookingListA,BookingHistoryButtonA,LogoutButtonA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admin);
        InitViews();

        BookingListA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Available Soon!!",Toast.LENGTH_SHORT).show();
            }
        });

        BookingHistoryButtonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Available Soon!!",Toast.LENGTH_SHORT).show();
            }
        });

        LogoutButtonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void InitViews(){
        BookingListA = (Button) findViewById(R.id.BookingListA);
        BookingHistoryButtonA = (Button) findViewById(R.id.BookingHistoryButtonA);
        LogoutButtonA = (Button) findViewById(R.id.LogoutButtonA);
    }
}