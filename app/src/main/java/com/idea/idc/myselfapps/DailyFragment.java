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
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
        dailyModelArrayList.add(new DailyModel("Dimas Maulana", "1414370309"));
        dailyModelArrayList.add(new DailyModel("Fadly Yonk", "1214234560"));
        dailyModelArrayList.add(new DailyModel("Ariyandi Nugraha", "1214230345"));
        dailyModelArrayList.add(new DailyModel("Aham Siswana", "1214378098"));
    }

    void addDataFriend(){
        friendModelArrayList = new ArrayList<>();
        friendModelArrayList.add(new FriendModel("Dimas Maulana", "1414370309"));
        friendModelArrayList.add(new FriendModel("Fadly Yonk", "1214234560"));
        friendModelArrayList.add(new FriendModel("Ariyandi Nugraha", "1214230345"));
        friendModelArrayList.add(new FriendModel("Aham Siswana", "1214378098"));
        friendModelArrayList.add(new FriendModel("Dimas Maulana", "1414370309"));
        friendModelArrayList.add(new FriendModel("Fadly Yonk", "1214234560"));
        friendModelArrayList.add(new FriendModel("Ariyandi Nugraha", "1214230345"));
        friendModelArrayList.add(new FriendModel("Aham Siswana", "1214378098"));
        friendModelArrayList.add(new FriendModel("Dimas Maulana", "1414370309"));
        friendModelArrayList.add(new FriendModel("Fadly Yonk", "1214234560"));
        friendModelArrayList.add(new FriendModel("Ariyandi Nugraha", "1214230345"));
        friendModelArrayList.add(new FriendModel("Aham Siswana", "1214378098"));
        friendModelArrayList.add(new FriendModel("Dimas Maulana", "1414370309"));
        friendModelArrayList.add(new FriendModel("Fadly Yonk", "1214234560"));
        friendModelArrayList.add(new FriendModel("Ariyandi Nugraha", "1214230345"));
        friendModelArrayList.add(new FriendModel("Aham Siswana", "1214378098"));
        friendModelArrayList.add(new FriendModel("Dimas Maulana", "1414370309"));
        friendModelArrayList.add(new FriendModel("Fadly Yonk", "1214234560"));
        friendModelArrayList.add(new FriendModel("Ariyandi Nugraha", "1214230345"));
        friendModelArrayList.add(new FriendModel("Aham Siswana", "1214378098"));
        friendModelArrayList.add(new FriendModel("Dimas Maulana", "1414370309"));
        friendModelArrayList.add(new FriendModel("Fadly Yonk", "1214234560"));
        friendModelArrayList.add(new FriendModel("Ariyandi Nugraha", "1214230345"));
        friendModelArrayList.add(new FriendModel("Aham Siswana", "1214378098"));
        friendModelArrayList.add(new FriendModel("Dimas Maulana", "1414370309"));
        friendModelArrayList.add(new FriendModel("Fadly Yonk", "1214234560"));
        friendModelArrayList.add(new FriendModel("Ariyandi Nugraha", "1214230345"));
        friendModelArrayList.add(new FriendModel("Aham Siswana", "1214378098"));
        friendModelArrayList.add(new FriendModel("Dimas Maulana", "1414370309"));
        friendModelArrayList.add(new FriendModel("Fadly Yonk", "1214234560"));
        friendModelArrayList.add(new FriendModel("Ariyandi Nugraha", "1214230345"));
        friendModelArrayList.add(new FriendModel("Aham Siswana", "1214378098"));
        friendModelArrayList.add(new FriendModel("Dimas Maulana", "1414370309"));
        friendModelArrayList.add(new FriendModel("Fadly Yonk", "1214234560"));
        friendModelArrayList.add(new FriendModel("Ariyandi Nugraha", "1214230345"));
        friendModelArrayList.add(new FriendModel("Aham Siswana", "1214378098"));
        friendModelArrayList.add(new FriendModel("Dimas Maulana", "1414370309"));
        friendModelArrayList.add(new FriendModel("Fadly Yonk", "1214234560"));
        friendModelArrayList.add(new FriendModel("Ariyandi Nugraha", "1214230345"));
        friendModelArrayList.add(new FriendModel("Aham Siswana", "1214378098"));
        friendModelArrayList.add(new FriendModel("Dimas Maulana", "1414370309"));
        friendModelArrayList.add(new FriendModel("Fadly Yonk", "1214234560"));
        friendModelArrayList.add(new FriendModel("Ariyandi Nugraha", "1214230345"));
        friendModelArrayList.add(new FriendModel("Aham Siswana", "1214378098"));
    }
}
