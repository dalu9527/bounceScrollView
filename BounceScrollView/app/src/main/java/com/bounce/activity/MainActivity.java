package com.bounce.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bounce.R;
import com.bounce.adapter.MyAdapter;
import com.lib.bounceScrollView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private RecyclerView mRecyclerView;
    private List<List<String>> mLists = new ArrayList<>();
    private MyAdapter mMyAdapter;
    private LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView)$(R.id.rc_test);

        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setAutoMeasureEnabled(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        initData();
        mMyAdapter = new MyAdapter(mLists);
        mRecyclerView.setAdapter(mMyAdapter);
    }

    /**
     * 初始化数据
     */
    private void initData(){
        for(int i = 0; i < 5; i ++){
            List<String> url = new ArrayList<>();
            url.add("http://g.hiphotos.baidu.com/image/pic/item/c75c10385343fbf25431e823b27eca8065388f95.jpg");
            url.add("http://g.hiphotos.baidu.com/image/pic/item/960a304e251f95ca2f34115acd177f3e6609521d.jpg");
            mLists.add(url);
        }
    }
}
