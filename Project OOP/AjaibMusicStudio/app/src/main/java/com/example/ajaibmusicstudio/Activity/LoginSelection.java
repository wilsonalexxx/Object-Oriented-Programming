package com.example.ajaibmusicstudio.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ajaibmusicstudio.R;

public class LoginSelection extends AppCompatActivity {
    private Button CustomerBtn, AdminBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_selection);
        InitViews();

        CustomerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CustomerLoginPage.class);
                startActivity(intent);
            }
        });

        AdminBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AdminLoginPage.class);
                startActivity(intent);
            }
        });
    }

    private void InitViews(){
        CustomerBtn = (Button) findViewById(R.id.BtnCostumer);
        AdminBtn = (Button) findViewById(R.id.BtnAdmin);
    }
}