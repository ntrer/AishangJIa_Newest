package com.shushang.aishangjia.fragment.MyCoustomerFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.shushang.aishangjia.R;
import com.shushang.aishangjia.base.BaseFragment;
import com.shushang.aishangjia.base.BaseUrl;
import com.shushang.aishangjia.fragment.MyCoustomerFragment.adapter.MyCoustomerAdapter;
import com.xys.libzxing.zxing.utils.PreferencesUtils;

import java.util.ArrayList;
import java.util.List;

public class MyCoustomerFragment extends BaseFragment {


    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private List<String> mStrings=new ArrayList<>();
    private MyCoustomerAdapter mMyCoustomerAdapter;
    private String token_id = null;
    public MyCoustomerFragment() {
        // Required empty public constructor
    }

    public static MyCoustomerFragment newInstance() {
        return new MyCoustomerFragment();
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
        String url = BaseUrl.BASE_URL+"phoneApi/clueController.do?method=getMyClues&token_id=" + token_id;
        Log.d("BaseUrl", url);
    }

    private void showData(List<String> strings) {
        mMyCoustomerAdapter=new MyCoustomerAdapter(R.layout.item_kehu,mStrings);
        mRecyclerView.setAdapter(mMyCoustomerAdapter);
        mRecyclerView.scrollToPosition(0);
    }

    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragment_my_coustomer, null);
        mRecyclerView=view.findViewById(R.id.rv_my_coustomer);
        mSwipeRefreshLayout=view.findViewById(R.id.srl_my_coustomer);
        token_id = PreferencesUtils.getString(getActivity(), "token_id");
        return view;
    }
}
