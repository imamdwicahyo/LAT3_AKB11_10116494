package com.idea.idc.myselfapps.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.idea.idc.myselfapps.R;
import com.idea.idc.myselfapps.model.DailyModel;

import java.util.ArrayList;

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.DailyViewHolder>{

    private ArrayList<DailyModel> dataList;

    public DailyAdapter(ArrayList<DailyModel> dataList) {
        this.dataList = dataList;
    }


    @NonNull
    @Override
    public DailyAdapter.DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.daily_item, viewGroup, false);
        return new DailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DailyAdapter.DailyViewHolder dailyViewHolder, int i) {
        dailyViewHolder.txt_nama.setText(dataList.get(i).getNama());
        dailyViewHolder.txt_waktu.setText(dataList.get(i).getWaktu());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class DailyViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_nama, txt_waktu;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nama = itemView.findViewById(R.id.txt_nama);
            txt_waktu = itemView.findViewById(R.id.txt_waktu);
        }
    }
}
