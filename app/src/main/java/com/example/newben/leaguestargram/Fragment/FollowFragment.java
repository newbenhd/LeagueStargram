package com.example.newben.leaguestargram.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.newben.leaguestargram.R;


/**
 * Created by MorrisonBenjaminL on 6/17/2017.
 * Credit to https://guides.codepath.com/android/ViewPager-with-FragmentPagerAdapter
 */

public class FollowFragment extends Fragment{
    public static final String TAG = "FollowFragment";
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static FollowFragment newInstance(int page, String title) {
        Bundle args = new Bundle();
        args.putInt("page",page);
        args.putString("title",title);
        FollowFragment fragment = new FollowFragment();
        fragment.setArguments(args);
        return fragment;
    }

    // store instance variables based on arguments passed
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("page");
        title = getArguments().getString("title");
        Log.d(TAG,"title = "+title);
    }

    // inflate the view for the fragment based on layout XML
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.follow_fragment,container,false);
        TextView txtv = (TextView)view.findViewById(R.id.follow_txtv);
        txtv.setText("from fragment");
        return view;
    }

    public void setText(String text){
    }
}
