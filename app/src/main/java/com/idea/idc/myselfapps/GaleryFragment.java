package com.idea.idc.myselfapps;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idea.idc.myselfapps.adapter.DailyAdapter;
import com.idea.idc.myselfapps.adapter.GaleryAdapter;
import com.idea.idc.myselfapps.model.DailyModel;
import com.idea.idc.myselfapps.model.GaleryModel;

import java.util.ArrayList;

public class GaleryFragment extends Fragment {

    private RecyclerView recyclerView;
    private GaleryAdapter adapter;
    private ArrayList<GaleryModel> galeryModelArrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_galery, container, false);

        addDataGalery();

        // recycleview 1
        recyclerView = view.findViewById(R.id.recycler_viewGalery);
        adapter = new GaleryAdapter(galeryModelArrayList);
        RecyclerView.LayoutManager layoutManagerD = new GridLayoutManager(getActivity() , 3);
        recyclerView.setLayoutManager(layoutManagerD);
        recyclerView.setAdapter(adapter);

        return view;
    }

    void addDataGalery(){
        galeryModelArrayList = new ArrayList<>();
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.certificate));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto2));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.certificate));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto3));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto6));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto2));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto4));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto5));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto6));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.certificate));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto2));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.certificate));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto3));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto6));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto2));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto4));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto5));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto));
        galeryModelArrayList.add(new GaleryModel("Imam Dwi Cahyo", R.drawable.userphoto6));
    }
}
