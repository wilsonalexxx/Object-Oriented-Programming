package com.example.ajaibmusicstudio.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ajaibmusicstudio.Object.Regular;
import com.example.ajaibmusicstudio.R;

import java.util.ArrayList;

public class AdapterRegularRoom extends RecyclerView.Adapter<AdapterRegularRoom.ViewHolder> {

    // Data
    private Context context;
    private ArrayList<Regular> RegularList;

    // Constructor
    public AdapterRegularRoom(Context context, ArrayList<Regular> RegularList) {
        this.context = context;
        this.RegularList = RegularList;
    }

    // View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView roomImg;
        private TextView roomname;
        private TextView descRoom;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            roomImg = itemView.findViewById(R.id.cardViewImgRegular);
            roomname = itemView.findViewById(R.id.RoomnameRegular);
            descRoom = itemView.findViewById(R.id.RoomDescRegular);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclevieweerregularroom,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Regular roomReg = RegularList.get(position);
        holder.roomImg.setImageResource(roomReg.getImg_room());
        holder.roomname.setText(roomReg.getRoom_name());
        holder.descRoom.setText(roomReg.getDesc_room());
    }

    @Override
    public int getItemCount() {
        return RegularList.size();
    }
}
