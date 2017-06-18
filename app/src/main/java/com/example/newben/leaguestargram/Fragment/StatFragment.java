package com.example.newben.leaguestargram.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newben.leaguestargram.R;

/**
 * Created by MorrisonBenjaminL on 6/18/2017.
 */

public class StatFragment extends Fragment{
    private String title;
    private int page;

    public static StatFragment newInstance(int page, String title) {

        Bundle args = new Bundle();
        args.putInt("page",page);
        args.putString("title",title);
        StatFragment fragment = new StatFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("page");
        title = getArguments().getString("title");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.stat_fragment,container,false);
        return view;
    }
}
