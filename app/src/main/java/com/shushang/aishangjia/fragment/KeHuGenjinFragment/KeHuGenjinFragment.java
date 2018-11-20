package com.shushang.aishangjia.fragment.KeHuGenjinFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.shushang.aishangjia.R;
import com.shushang.aishangjia.base.BaseFragment;
import com.shushang.aishangjia.fragment.KeHuGenjinFragment.adapter.KeHuGenjinAdapter;
import com.shushang.aishangjia.fragment.KeHuGenjinFragment.adapter.TimeLineAdapter;

import java.util.ArrayList;
import java.util.List;

public class KeHuGenjinFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private List<String> mStrings=new ArrayList<>();
    private KeHuGenjinAdapter mKeHuGenjinAdapter;
    private TimeLineAdapter mTimeLineAdapter;


    public KeHuGenjinFragment() {
        // Required empty public constructor
    }

    public static KeHuGenjinFragment newInstance() {
        return new KeHuGenjinFragment();
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        getData();
    }

    private void getData() {
        for (int i = 0; i < 10; i++) {
            mStrings.add(""+i);
        }
    }

    private void initRecyclerView() {
        final LinearLayoutManager linermanager=new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(linermanager);
        mRecyclerView.setHasFixedSize(true);
        mTimeLineAdapter=new TimeLineAdapter(mStrings);
        mRecyclerView.setAdapter(mTimeLineAdapter);
        mRecyclerView.scrollToPosition(0);
    }

    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragment_kehugenjin, null);
        mRecyclerView=view.findViewById(R.id.rv_genjin);
        initRecyclerView();
        return view;
    }
}
