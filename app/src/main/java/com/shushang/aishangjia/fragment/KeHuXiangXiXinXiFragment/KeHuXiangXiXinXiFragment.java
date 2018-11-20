package com.shushang.aishangjia.fragment.KeHuXiangXiXinXiFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.shushang.aishangjia.R;
import com.shushang.aishangjia.base.BaseFragment;

public class KeHuXiangXiXinXiFragment extends BaseFragment {


    public KeHuXiangXiXinXiFragment() {
        // Required empty public constructor
    }

    public static KeHuXiangXiXinXiFragment newInstance() {
        return new KeHuXiangXiXinXiFragment();
    }



    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }

    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragment_kehuxiangxixinxi, null);
        return view;
    }
}
