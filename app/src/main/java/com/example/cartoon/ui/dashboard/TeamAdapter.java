package com.example.cartoon.ui.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cartoon.R;

import java.util.ArrayList;

public class TeamAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Team> teams;

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public TeamAdapter(Context context) {
        this.context = context;
        teams = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return teams.size();
    }

    @Override
    public Object getItem(int i) {
        return teams.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
        }
        ViewHolder viewHolder = new ViewHolder(view);
        Team team = (Team)getItem(i);
        viewHolder.bind(team);
        return view;
    }

    private class ViewHolder{
        private TextView txtNama;
        private TextView txtNpm;
        private ImageView imageTeam;

        ViewHolder(View view){
            txtNama = view.findViewById(R.id.team_nama);
            txtNpm = view.findViewById(R.id.team_npm);
            imageTeam = view.findViewById(R.id.team_photo);
        }
        void bind(Team team){
            txtNama.setText(team.getName());
            txtNpm.setText(team.getNpm());
            imageTeam.setImageResource(team.getPhoto());
        }
    }
}
