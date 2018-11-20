package com.shushang.aishangjia.activity.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.shushang.aishangjia.Bean.ShouKaDetail;
import com.shushang.aishangjia.R;

import java.util.List;

public class SellCardAdapter extends BaseQuickAdapter<ShouKaDetail.DataBean.GoodsOrderVosBean,BaseViewHolder> {

    public SellCardAdapter(int layoutResId, @Nullable List<ShouKaDetail.DataBean.GoodsOrderVosBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ShouKaDetail.DataBean.GoodsOrderVosBean item) {
       helper.setText(R.id.goumai_detail,item.getMerchantName());
       helper.setText(R.id.activity_count_text,item.getGoodsSize()+"件");
       helper.setText(R.id.chengjiaoliang_text,item.getTotalPrice()+"元");
    }
}
