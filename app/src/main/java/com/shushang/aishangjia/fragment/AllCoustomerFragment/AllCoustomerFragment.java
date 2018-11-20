package com.shushang.aishangjia.fragment.AllCoustomerFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.shushang.aishangjia.R;
import com.shushang.aishangjia.base.BaseFragment;
import com.shushang.aishangjia.fragment.MyCoustomerFragment.adapter.MyCoustomerAdapter;

import java.util.ArrayList;
import java.util.List;

public class AllCoustomerFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private List<String> mStrings=new ArrayList<>();
    private MyCoustomerAdapter mMyCoustomerAdapter;

    public AllCoustomerFragment() {
        // Required empty public constructor
    }

    public static AllCoustomerFragment newInstance() {
        return new AllCoustomerFragment();
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        getData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        LinearLayoutManager manager=new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setHasFixedSize(true);
    }

    private void getData() {
        for (int i = 0; i < 10; i++) {
            mStrings.add("");
        }

        showData(mStrings);

    }

    private void showData(List<String> strings) {
        mMyCoustomerAdapter=new MyCoustomerAdapter(R.layout.item_kehu,mStrings);
        mRecyclerView.setAdapter(mMyCoustomerAdapter);
        mRecyclerView.scrollToPosition(0);
    }


    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragment_all_coustomer, null);
        mRecyclerView=view.findViewById(R.id.rv_all_coustomer);
        mSwipeRefreshLayout=view.findViewById(R.id.srl_all_coustomer);
        return view;
    }
}
