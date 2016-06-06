package com.hnpolice.xiaoke.tablayoutwithviewpagedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * create by luoxiaoke on 2016/6/6 10:17.
 * use for
 */
public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, null);
        TextView show = (TextView) view.findViewById(R.id.show);

        Log.e("first one ===", getArguments().getString("Show"));
//        if (!TextUtils.isEmpty(getArguments().getString("Show"))) {
        show.setText(getArguments().getString("Show"));
//        }
        return view;
    }

}
