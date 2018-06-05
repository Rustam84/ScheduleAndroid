package com.example.rshaghivaliev.schedule.fragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.rshaghivaliev.schedule.Data;
import com.example.rshaghivaliev.schedule.R;
import com.example.rshaghivaliev.schedule.model.ScheduleForGroup;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.rshaghivaliev.schedule.utils.Constants.PADDING_BETWEEN_LECTURER_AND_CABINET;
import static com.example.rshaghivaliev.schedule.utils.Constants.PADDING_BETWEEN_PAIR_AND_LECTURER;
import static com.example.rshaghivaliev.schedule.utils.Constants.PADDING_BETWEEN_TIME_AND_PAIR;

public class Tuesday extends Fragment {


    public Tuesday() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ScrollView view = (ScrollView) inflater.inflate(R.layout.tuesday, container, false);
        ViewGroup viewGroup = (ViewGroup) view.getChildAt(0);
        List<ScheduleForGroup> scheduleForGroupList = Data.getList();
        for(ScheduleForGroup scheduleForGroup: scheduleForGroupList){
            if(scheduleForGroup.getDay().equals("Tuesday")){
                viewGroup.addView(createCardView(inflater, container, scheduleForGroup));
            }
        }
        return view;
    }

    private View createCardView(LayoutInflater inflater, ViewGroup container, ScheduleForGroup scheduleForGroup){
        CardView cardView = (CardView) inflater.inflate(R.layout.cell, container, false);

        ViewGroup viewGroup = (ViewGroup) cardView.getChildAt(0);

        TextView time = (TextView) viewGroup.getChildAt(0);
        time.setText(scheduleForGroup.getTime());

        TextView pair = (TextView) viewGroup.getChildAt(1);
        pair.setText(scheduleForGroup.getCellForGroup().getPair());

        TextView lecturer = (TextView) viewGroup.getChildAt(2);
        lecturer.setText(scheduleForGroup.getCellForGroup().getLecturer());

        TextView cabinet = (TextView) viewGroup.getChildAt(3);
        cabinet.setText(scheduleForGroup.getCellForGroup().getCabinet());
        return cardView;
    }
}