package com.idea.idc.myselfapps.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.idea.idc.myselfapps.R;
import com.idea.idc.myselfapps.model.GaleryModel;

import java.util.ArrayList;

public class GaleryAdapter extends RecyclerView.Adapter<GaleryAdapter.GaleryViewHolder> {

    private ArrayList<GaleryModel> dataList;

    public GaleryAdapter(ArrayList<GaleryModel> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public GaleryAdapter.GaleryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.galery_item, viewGroup, false);
        return new GaleryAdapter.GaleryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GaleryAdapter.GaleryViewHolder galeryViewHolder, int i) {
        //galeryViewHolder.txt_nama.setText(dataList.get(i).getNama());
        galeryViewHolder.image_file.setImageResource(dataList.get(i).getImage_file());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class GaleryViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_nama;
        private ImageView image_file;

        public GaleryViewHolder(@NonNull View itemView) {
            super(itemView);
            //txt_nama = itemView.findViewById(R.id.tv_nama);
            image_file = itemView.findViewById(R.id.img_android);
        }
    }
}
