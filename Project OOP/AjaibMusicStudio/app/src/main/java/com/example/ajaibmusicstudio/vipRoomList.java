package com.example.ajaibmusicstudio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ajaibmusicstudio.Adapter.AdapterVIPRoom;
import com.example.ajaibmusicstudio.Object.VIP;
import com.example.ajaibmusicstudio.R;
import com.example.ajaibmusicstudio.databinding.ReyclevieweerviproomBinding;

import java.util.ArrayList;

public class vipRoomList extends AppCompatActivity {
    // Data
    ArrayList<VIP> VIProomList;

    //Adapter View
    RecyclerView recyclerViewVIP;

    //Adapter
    AdapterVIPRoom adapterVIPRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vip_room_list);
        InitViews();
    }

    private void InitViews(){
        recyclerViewVIP = findViewById(R.id.ReyclerViewVIPRoom);
        VIProomList = new ArrayList<>();

        adapterVIPRoom = new AdapterVIPRoom(this,VIProomList);

        VIProomList.add(new VIP("VIP1","Ruangan dilengkapi AC dan beberapa Alat Music Tambahan Berkualitas Mahal",R.drawable.vip1));
        VIProomList.add(new VIP("VIP2","Ruangan dilengkapi AC dan beberapa Alat Music Tambahan Berkualitas Mahal",R.drawable.vip2));
        VIProomList.add(new VIP("VIP3","Ruangan dilengkapi AC dan beberapa Alat Music Tambahan Berkualitas Mahal",R.drawable.vip3));
        VIProomList.add(new VIP("VIP4","Ruangan dilengkapi AC dan beberapa Alat Music Tambahan Berkualitas Mahal",R.drawable.vip2));
        VIProomList.add(new VIP("VIP5","Ruangan dilengkapi AC dan beberapa Alat Music Tambahan Berkualitas Mahal",R.drawable.vip3));
        VIProomList.add(new VIP("VIP6","Ruangan dilengkapi AC dan beberapa Alat Music Tambahan Berkualitas Mahal",R.drawable.vip1));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerViewVIP.setLayoutManager(layoutManager);
        recyclerViewVIP.setAdapter(adapterVIPRoom);
    }
}