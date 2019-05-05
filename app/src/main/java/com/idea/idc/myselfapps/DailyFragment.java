package com.idea.idc.myselfapps;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.idea.idc.myselfapps.adapter.DailyAdapter;
import com.idea.idc.myselfapps.adapter.FriendAdapter;
import com.idea.idc.myselfapps.model.DailyModel;
import com.idea.idc.myselfapps.model.FriendModel;

import java.util.ArrayList;

public class DailyFragment extends Fragment {

    private RecyclerView recyclerViewD, recyclerViewF;
    private DailyAdapter adapterD, adapterD2;
    private FriendAdapter adapterF;
    private ArrayList<DailyModel> dailyModelArrayList;
    private ArrayList<FriendModel> friendModelArrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daily, container, false);

        addDataDaily();
        addDataFriend();

        // recycleview 1
        recyclerViewD = view.findViewById(R.id.recycler_viewDaily);
        adapterD = new DailyAdapter(dailyModelArrayList);
        RecyclerView.LayoutManager layoutManagerD = new LinearLayoutManager(getActivity() , LinearLayoutManager.VERTICAL, false);
        recyclerViewD.setLayoutManager(layoutManagerD);
        recyclerViewD.setAdapter(adapterD);

        // recycleview 2
        recyclerViewF = view.findViewById(R.id.recycler_viewFriend);
        adapterF = new FriendAdapter(friendModelArrayList);
        RecyclerView.LayoutManager layoutManagerD2 = new LinearLayoutManager(getActivity() , LinearLayoutManager.HORIZONTAL, false);
        recyclerViewF.setLayoutManager(layoutManagerD2);
        recyclerViewF.setAdapter(adapterF);

        //Your three recyclerview
        recyclerViewD.setNestedScrollingEnabled(false);
        recyclerViewF.setNestedScrollingEnabled(false);


        return view;
    }

    void addDataDaily(){
        dailyModelArrayList = new ArrayList<>();
        dailyModelArrayList.add(new DailyModel("Bangun Tidur", "04:20"));
        dailyModelArrayList.add(new DailyModel("Wudlu", "04:25"));
        dailyModelArrayList.add(new DailyModel("Sholat Subuh", "04:30"));
        dailyModelArrayList.add(new DailyModel("Mandi", "05:00"));
        dailyModelArrayList.add(new DailyModel("Makan", "05:15"));
        dailyModelArrayList.add(new DailyModel("Persiapan Kuliah", "05:30"));
        dailyModelArrayList.add(new DailyModel("Berangkat Kuliah", "06:00"));
        dailyModelArrayList.add(new DailyModel("Sampai Kampus", "08:00"));
        dailyModelArrayList.add(new DailyModel("Masuk Kelas", "09:15"));
        dailyModelArrayList.add(new DailyModel("Keluar Kelas", "11:00"));
        dailyModelArrayList.add(new DailyModel("Istirahat", "11:30"));
        dailyModelArrayList.add(new DailyModel("Sholat Dzuhur", "12:00"));
        dailyModelArrayList.add(new DailyModel("Istirahat", "12:15"));
        dailyModelArrayList.add(new DailyModel("Masuk Kelas", "13.00"));
        dailyModelArrayList.add(new DailyModel("Keluar Kelas", "15.15"));
        dailyModelArrayList.add(new DailyModel("Sholat Ahsar", "15:20"));
        dailyModelArrayList.add(new DailyModel("Persiapan Pulang", "15:30"));
        dailyModelArrayList.add(new DailyModel("Pulang", "15:45"));
        dailyModelArrayList.add(new DailyModel("Sampai Rumah", "17:45"));
        dailyModelArrayList.add(new DailyModel("Istirahat", "17:50"));
        dailyModelArrayList.add(new DailyModel("Sholat magrib", "18:00"));
        dailyModelArrayList.add(new DailyModel("Makan Malam", "18:15"));
        dailyModelArrayList.add(new DailyModel("Istirahat", "18:30"));
        dailyModelArrayList.add(new DailyModel("Sholat Isya", "19:00"));
        dailyModelArrayList.add(new DailyModel("Latihan", "19:20"));
        dailyModelArrayList.add(new DailyModel("Tidur", "22:00"));
        dailyModelArrayList.add(new DailyModel("Bangun Malam", "01:00"));
        dailyModelArrayList.add(new DailyModel("Tidur Lagi", "02:00"));
    }

    void addDataFriend(){
        friendModelArrayList = new ArrayList<>();
        friendModelArrayList.add(new FriendModel("Reza Achmad", "123456789101"));
        friendModelArrayList.add(new FriendModel("Fata El Islami", "123456789101"));
        friendModelArrayList.add(new FriendModel("Tandang", "123456789101"));
        friendModelArrayList.add(new FriendModel("Iqbal Shorfana", "123456789101"));
        friendModelArrayList.add(new FriendModel("Ilham Prasetyo", "123456789101"));
        friendModelArrayList.add(new FriendModel("Nurcahya Eko", "123456789101"));
        friendModelArrayList.add(new FriendModel("Esa Maulana", "123456789101"));
        friendModelArrayList.add(new FriendModel("Muhammad Fajar", "123456789101"));
        friendModelArrayList.add(new FriendModel("Adhit KJ", "123456789101"));
        friendModelArrayList.add(new FriendModel("Moch Star", "123456789101"));
        friendModelArrayList.add(new FriendModel("Rifki Hanafi", "123456789101"));
        friendModelArrayList.add(new FriendModel("Gerdi A", "123456789101"));
    }
}
