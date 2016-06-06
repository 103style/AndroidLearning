package com.hnpolice.xiaoke.tablayoutwithviewpagedemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private MyFragmentpageAdapter fragmentpageAdapter;
    private List<Fragment> fragments;
    private List<String> titles;
    private Button ok;
    private boolean isChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initParam();
        initData();
        initSetup();


    }

    private void initParam() {
        //初始化
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.view_page);
        ok = (Button) findViewById(R.id.ok);
        fragments = new ArrayList<>();
        titles = new ArrayList<>();

    }

    private void initData() {
        titles.clear();
        fragments.clear();

        ViewGroup.LayoutParams lp = tabLayout.getLayoutParams();
        //添加数据
        if (isChange) {
            titles.add("First");
            titles.add("Second");
            titles.add("Third");
            titles.add("Forth");
            //设置高度为48dp
            lp.height = (int) (getResources().getDisplayMetrics().density * 48);
        } else {
            titles.add("Zero");
            lp.height = 0;
        }
        tabLayout.setLayoutParams(lp);

        for (int i = 0; i < titles.size(); i++) {
            FirstFragment ff = new FirstFragment();
            Bundle bundle = new Bundle();
            bundle.putString("Show", titles.get(i));
            ff.setArguments(bundle);
            fragments.add(ff);
        }
    }

    private void initSetup() {

        //设置tablayout的模式  MODE_FIXED 表示平分屏幕宽度   MODE_SCROLLABLE 是以tab子项的宽度依次排列
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        //实例化适配器
        fragmentpageAdapter = new MyFragmentpageAdapter(this.getSupportFragmentManager(), fragments, titles);

        //设置适配器
        viewPager.setAdapter(fragmentpageAdapter);

        tabLayout.setupWithViewPager(viewPager);


        //清空tab 再添加tab名称
        tabLayout.removeAllTabs();
        for (int i = 0; i < titles.size(); i++) {
            tabLayout.addTab(tabLayout.newTab().setText(titles.get(i)));
        }
        fragmentpageAdapter.notifyDataSetChanged();


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isChange) {
                    isChange = false;
                } else {
                    isChange = true;
                }
                initData();
                initSetup();
            }
        });

    }

}
