package com.shushang.aishangjia.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.shushang.aishangjia.R;
import com.shushang.aishangjia.activity.adapter.KeHuDetailAdapter;
import com.shushang.aishangjia.base.BaseActivity;
import com.shushang.aishangjia.fragment.KeHuGenjinFragment.KeHuGenjinFragment;
import com.shushang.aishangjia.fragment.KeHuXiangXiXinXiFragment.KeHuXiangXiXinXiFragment;
import com.shushang.aishangjia.fragment.KehuDingdanxnixiFragment.KehuDingdanXInxiFragment;

import butterknife.BindView;
import de.hdodenhof.circleimageview.CircleImageView;

public class KeHuDetailActivity extends BaseActivity {


    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.loading)
    ProgressBar mLoading;
    @BindView(R.id.dingjin_pic)
    CircleImageView mDingjinPic;
    @BindView(R.id.people)
    TextView mPeople;
    @BindView(R.id.coustomer_address)
    TextView mCoustomerAddress;
    @BindView(R.id.phone)
    TextView mPhone;
    @BindView(R.id.coustomer_info)
    RelativeLayout mCoustomerInfo;
    @BindView(R.id.xiangxixinxi)
    ImageView mXiangxixinxi;
    @BindView(R.id.dingdanxinxi)
    ImageView mDingdanxinxi;
    @BindView(R.id.genjinjilu)
    ImageView mGenjinjilu;
    @BindView(R.id.coustomer_type)
    LinearLayout mCoustomerType;
    ViewPager mKehuxiangqingViewpager;

    @Override
    public void init() {
        mToolbar=findViewById(R.id.toolbar);
        mXiangxixinxi=findViewById(R.id.xiangxixinxi);
        mDingdanxinxi=findViewById(R.id.dingdanxinxi);
        mGenjinjilu=findViewById(R.id.genjinjilu);
        mKehuxiangqingViewpager=findViewById(R.id.kehuxiangqing_viewpager);
    }

    @Override
    public int setLayout() {
        return R.layout.activity_coustomer_detail;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mXiangxixinxi.setSelected(true);
        SetUpViewPager(mKehuxiangqingViewpager);
        //设置支持toolbar
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mKehuxiangqingViewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    mXiangxixinxi.setSelected(true);
                    mDingdanxinxi.setSelected(false);
                    mGenjinjilu.setSelected(false);
                } else if (position == 1) {
                    mXiangxixinxi.setSelected(false);
                    mDingdanxinxi.setSelected(true);
                    mGenjinjilu.setSelected(false);
                } else {
                    mXiangxixinxi.setSelected(false);
                    mDingdanxinxi.setSelected(false);
                    mGenjinjilu.setSelected(true);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    private void SetUpViewPager(ViewPager bookViewpager) {
        KeHuDetailAdapter adapter = new KeHuDetailAdapter(getSupportFragmentManager());
        adapter.addFragment(KeHuXiangXiXinXiFragment.newInstance(), "");
        adapter.addFragment(KehuDingdanXInxiFragment.newInstance(), "");
        adapter.addFragment(KeHuGenjinFragment.newInstance(), "");
        bookViewpager.setAdapter(adapter);
        bookViewpager.setCurrentItem(0, true);
        bookViewpager.setOffscreenPageLimit(3);
    }

    /**
     * 退出activity的动画效果不起作用，要在java代码里写
     * 复写activity的finish方法，在overridePendingTransition中写入自己的动画效果
     */
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
