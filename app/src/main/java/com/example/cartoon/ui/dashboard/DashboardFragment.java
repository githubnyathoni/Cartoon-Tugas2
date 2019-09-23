package com.example.cartoon.ui.dashboard;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.cartoon.R;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {
    private String[] dataName;
    private String[] dataNpm;
    private TypedArray dataPhoto;
    private TeamAdapter adapter;
    private ArrayList<Team> teams;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        adapter = new TeamAdapter(getActivity());
        ListView listView = view.findViewById(R.id.lv_list);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Toast.makeText(getActivity(), teams.get(i).getName(),Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
    private void addItem(){
        teams = new ArrayList<>();
        for (int i=0;i<dataName.length;i++){
            Team team = new Team();
            team.setPhoto(dataPhoto.getResourceId(i,-1));
            team.setName(dataName[i]);
            team.setNpm(dataNpm[i]);
            teams.add(team);
        }
        adapter.setTeams(teams);
    }
    private void prepare(){
        dataName = getResources().getStringArray(R.array.data_nama);
        dataNpm = getResources().getStringArray(R.array.data_npm);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
    }
}