package com.shushang.aishangjia.fragment.KehuDingdanxnixiFragment.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.shushang.aishangjia.R;

import java.util.List;

public class KehuDingdanXInxiAdapter extends BaseQuickAdapter<String,BaseViewHolder> {

    public KehuDingdanXInxiAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.text,item);
    }
}
