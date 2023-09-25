package com.example.ajaibmusicstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selectionRoomType extends AppCompatActivity {
    private Button REGULARBtn,VIPBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_room_type);
        InitViews();

        REGULARBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), regularRoomList.class);
                startActivity(intent);
            }
        });

        VIPBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), vipRoomList.class);
                startActivity(intent);
            }
        });
    }

    private void InitViews(){
        REGULARBtn = (Button) findViewById(R.id.REGULARBtn);
        VIPBtn = (Button) findViewById(R.id.VIPBtn);
    }
}