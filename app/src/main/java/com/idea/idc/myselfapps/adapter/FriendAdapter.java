package com.idea.idc.myselfapps.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.idea.idc.myselfapps.R;
import com.idea.idc.myselfapps.model.FriendModel;

import java.util.ArrayList;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.FriendViewHoldder> {

    private ArrayList<FriendModel> dataList;

    public FriendAdapter(ArrayList<FriendModel> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public FriendViewHoldder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.friend_item, viewGroup, false);
        return new FriendViewHoldder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHoldder friendViewHoldder, int i) {
        friendViewHoldder.txt_teman.setText(dataList.get(i).getTeman());
        friendViewHoldder.txt_phone.setText(dataList.get(i).getPhone());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class FriendViewHoldder extends RecyclerView.ViewHolder{
        private TextView txt_teman, txt_phone;

        public FriendViewHoldder(@NonNull View itemView) {
            super(itemView);
            txt_teman = itemView.findViewById(R.id.txt_teman);
            txt_phone = itemView.findViewById(R.id.txt_phone);
        }
    }
}
