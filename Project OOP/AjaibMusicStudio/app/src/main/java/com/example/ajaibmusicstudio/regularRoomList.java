package com.example.ajaibmusicstudio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ajaibmusicstudio.Adapter.AdapterRegularRoom;
import com.example.ajaibmusicstudio.Object.Regular;
import com.example.ajaibmusicstudio.R;

import java.util.ArrayList;

public class regularRoomList extends AppCompatActivity {
    // Data
    ArrayList<Regular> regularroomlist;

    // Adapter View
    RecyclerView recyclerView;

    // Adapter
    AdapterRegularRoom AdapterRegularRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_room_list);
        InitViews();
    }

    private void InitViews(){
        recyclerView = findViewById(R.id.ReyclerViewRegularRoom);
        regularroomlist = new ArrayList<>();

        regularroomlist.add(new Regular("REG1","Ruangan dilengkapi AC dan beberapa Alat Music Tambahan",R.drawable.regular1));
        regularroomlist.add(new Regular("REG2","Ruangan dilengkapi AC dan beberapa Alat Music Tambahan",R.drawable.regular2));
        regularroomlist.add(new Regular("REG3","Ruangan dilengkapi AC dan beberapa Alat Music Tambahan",R.drawable.regular3));
        regularroomlist.add(new Regular("REG4","Ruangan dilengkapi AC dan beberapa Alat Music Tambahan",R.drawable.regular2));
        regularroomlist.add(new Regular("REG5","Ruangan dilengkapi AC dan beberapa Alat Music Tambahan",R.drawable.regular3));
        regularroomlist.add(new Regular("REG6","Ruangan dilengkapi AC dan beberapa Alat Music Tambahan",R.drawable.regular1));


        AdapterRegularRoom = new AdapterRegularRoom(this,regularroomlist);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(AdapterRegularRoom);
    }

}