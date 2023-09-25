package com.example.ajaibmusicstudio.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ajaibmusicstudio.Object.VIP;
import com.example.ajaibmusicstudio.R;

import java.util.ArrayList;

public class AdapterVIPRoom extends RecyclerView.Adapter<AdapterVIPRoom.ViewHolder> {
    // Data
    private Context context1;
    private ArrayList<VIP> VIPlist;

    //Constructor
    public AdapterVIPRoom(Context context1, ArrayList<VIP> VIPlist) {
        this.context1 = context1;
        this.VIPlist = VIPlist;
    }

    // View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView VIProomImg;
        private TextView VIProomname;
        private TextView VIPdescRoom;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            VIProomImg = itemView.findViewById(R.id.cardViewImgVIP);
            VIProomname = itemView.findViewById(R.id.RoomnameVIP);
            VIPdescRoom = itemView.findViewById(R.id.RoomDescVIP);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reyclevieweerviproom,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        VIP roomVIP = VIPlist.get(position);
        holder.VIProomImg.setImageResource(roomVIP.getImg_room());
        holder.VIProomname.setText(roomVIP.getRoom_name());
        holder.VIPdescRoom.setText(roomVIP.getDesc_room());
    }

    @Override
    public int getItemCount() {
        return VIPlist.size();
    }
}
