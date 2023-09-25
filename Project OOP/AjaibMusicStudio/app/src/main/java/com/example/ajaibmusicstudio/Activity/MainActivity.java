package com.example.ajaibmusicstudio.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ajaibmusicstudio.R;

public class MainActivity extends AppCompatActivity {
    private Button LoginBtn,RegisterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitViews();

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LoginSelection.class);
                startActivity(intent);
            }
        });

        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RegisterPage.class);
                startActivity(intent);
            }
        });
    }

    private void InitViews(){
        LoginBtn = (Button) findViewById(R.id.BtnLogin);
        RegisterBtn = (Button) findViewById(R.id.BtnRegister);
    }
}