package com.shushang.aishangjia.fragment.ActivityFragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.ToastUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.shushang.aishangjia.Bean.ActivityListNew;
import com.shushang.aishangjia.Bean.RoleType;
import com.shushang.aishangjia.R;
import com.shushang.aishangjia.activity.AppPeopleActivity;
import com.shushang.aishangjia.activity.ProActivityActivity2;
import com.shushang.aishangjia.base.BaseFragment;
import com.shushang.aishangjia.base.BaseUrl;
import com.shushang.aishangjia.base.MessageEvent;
import com.shushang.aishangjia.fragment.ActivityFragment.adapter.ActivityFragmentAdapter;
import com.shushang.aishangjia.fragment.ActivityFragment.adapter.TabRecyclerViewAdapter3;
import com.shushang.aishangjia.fragment.DaiDanTongjiFragment.DaiDanTongjiFragment;
import com.shushang.aishangjia.fragment.HuodongDingjinFragment.HoudongDingjinFragment;
import com.shushang.aishangjia.fragment.ShouKaFragment.ShouKaFragment;
import com.shushang.aishangjia.net.RestClient;
import com.shushang.aishangjia.net.callback.IError;
import com.shushang.aishangjia.net.callback.IFailure;
import com.shushang.aishangjia.net.callback.ISuccess;
import com.shushang.aishangjia.ui.ExtAlertDialog;
import com.shushang.aishangjia.utils.SharePreferences.PreferencesUtils;
import com.xys.libzxing.zxing.activity.CaptureActivity;
import com.xys.libzxing.zxing.ui.dialog.ActionSheetDialog;
import com.xys.libzxing.zxing.utils.JSONUtil;
import com.zaaach.toprightmenu.MenuItem;
import com.zaaach.toprightmenu.TopRightMenu;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

public class ActivityFragment extends BaseFragment {

    private TopRightMenu mTopRightMenu;
    private LinearLayout mLinearLayout,mLinearLayout2;
    private ImageView mImageView1,mImageView2,mImageView3,mImageView4;
    Toolbar mToolbar;
    ViewPager mViewpager;
    private RecyclerView mRecyclerView;
    private String type;
    private int height,xoff;
    private boolean isFirst=true;
    private String token_id = null;
    private TextView mTextView,mTextView2;
    private TabRecyclerViewAdapter3 tabRecyclerViewAdapter;
    private static final int REQUEST_CODE_SCAN= 2005;
    private static final int REQUEST_CODE_HUODONG= 2006;
    private static final int REQUEST_CODE_DINGJIN= 2007;
    private static final int REQUEST_CODE_HUODONG_XUANZE= 1007;
    private List<ActivityListNew.DataListBean> dataList=new ArrayList<>();
    private List<ActivityListNew.DataListBean.MerchantsBean> merchants=new ArrayList<>();
    private String activityId,activityId2,activityName,merchantsId;
    private String roleType;
    private Dialog mRequestDialog;
    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        SetUpViewPager(mViewpager);
        mTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().post(new MessageEvent("获取所有商户信息"));
                mTextView2.setTextColor(getResources().getColor(R.color.colorPrimary));
                tabRecyclerViewAdapter.setThisPosition(100);
                tabRecyclerViewAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public View initView() {
        PreferencesUtils.putString(mContext,"huodongactivityId","");
        PreferencesUtils.putString(mContext,"huodongmerchantId","");
        token_id = PreferencesUtils.getString(getActivity(), "token_id");
        DisplayMetrics dm = getResources().getDisplayMetrics();
        int screenWidth = dm.widthPixels;
        int screenHeight = dm.heightPixels;
        if(screenWidth<=1000){
            xoff=-150;
        }
        else {
            xoff=-180;
        }
        View view = View.inflate(mContext, R.layout.activity_activity_detail_new, null);
        mToolbar=view.findViewById(R.id.toolbar);
        mTextView=view.findViewById(R.id.title_name);
        mTextView2=view.findViewById(R.id.all);
        mViewpager=view.findViewById(R.id.activity_viewpager);
        mRequestDialog = ExtAlertDialog.creatRequestDialog(getActivity(), getString(R.string.request));
        mRequestDialog.setCancelable(false);
        mRequestDialog.show();
        mRecyclerView=view.findViewById(R.id.rl_tab);
        mLinearLayout=view.findViewById(R.id.more_menu);
        mImageView1=view.findViewById(R.id.huodong_shouka);
        mImageView1.setSelected(true);
        type=PreferencesUtils.getString(getActivity(),"type");
        mImageView4=view.findViewById(R.id.select_activity);
        mImageView2=view.findViewById(R.id.huodong_dingjin);
        mImageView3=view.findViewById(R.id.daidan_tongji);
        mLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTopRightMenu = new TopRightMenu(getActivity());
                List<MenuItem> menuItems = new ArrayList<>();
                if(type.equals("5")){
                    menuItems.add(new MenuItem(R.mipmap.qr_scan, "扫一扫"));
                }
                menuItems.add(new MenuItem(R.mipmap.huodng_add, "活动拓客"));
                menuItems.add(new MenuItem(R.mipmap.huodong_mony, "活动订金"));
                mTopRightMenu
                        .setHeight(RecyclerView.LayoutParams.WRAP_CONTENT)     //默认高度480
                        .setWidth(RecyclerView.LayoutParams.WRAP_CONTENT)      //默认宽度wrap_content
                        .showIcon(true)     //显示菜单图标，默认为true
                        .dimBackground(true)           //背景变暗，默认为true
                        .needAnimationStyle(true)   //显示动画，默认为true
                        .setAnimationStyle(R.style.TRM_ANIM_STYLE)  //默认为R.style.TRM_ANIM_STYLE
                        .addMenuList(menuItems)
                        .setOnMenuItemClickListener(new TopRightMenu.OnMenuItemClickListener() {
                            @Override
                            public void onMenuItemClick(int position) {
                                if(type.equals("5")){
                                    if(position==0){
                                        if(roleType==null){
                                            ToastUtils.showLong("请先设置活动相关人员，在进行操作");
                                        }
                                        else if(roleType.equals("0")){
                                            new ActionSheetDialog(getActivity())
                                                    .builder()
                                                    .setCancelable(false)
                                                    .setCanceledOnTouchOutside(true)
                                                    .addSheetItem("在线签到", ActionSheetDialog.SheetItemColor.Blue,
                                                            new ActionSheetDialog.OnSheetItemClickListener() {
                                                                @Override
                                                                public void onClick(int which) {
                                                                    Intent intent=new Intent(getActivity(), CaptureActivity.class);
                                                                    intent.putExtra("type",roleType);
                                                                    startActivityForResult(intent,REQUEST_CODE_SCAN);
                                                                }
                                                            })
                                                    .addSheetItem("离线签到", ActionSheetDialog.SheetItemColor.Blue,
                                                            new ActionSheetDialog.OnSheetItemClickListener() {
                                                                @Override
                                                                public void onClick(int which) {

                                                                }
                                                            })
                                                    .show();
                                        }
                                        else if(roleType.equals("1")){

                                        }
                                    }
                                    else if(position==1){
                                        startActivityForResult(new Intent(getActivity(), AppPeopleActivity.class),REQUEST_CODE_HUODONG);
                                    }
                                    else {
                                        //表示所有权限都授权了
                                        Intent openCameraIntent = new Intent(getActivity(), CaptureActivity.class);
                                        openCameraIntent.putExtra("type", "3");
//                                        openCameraIntent.putExtra("event","6");
                                        startActivityForResult(openCameraIntent, REQUEST_CODE_DINGJIN );
                                    }
                                }
                                else {
                                    if(position==0){
                                        startActivityForResult(new Intent(getActivity(), AppPeopleActivity.class),REQUEST_CODE_HUODONG);
                                    }
                                    else if(position==1){
                                        //表示所有权限都授权了
                                        Intent openCameraIntent = new Intent(getActivity(), ProActivityActivity2.class);
                                        openCameraIntent.putExtra("type", "3");
                                        openCameraIntent.putExtra("event","6");
                                        startActivityForResult(openCameraIntent, REQUEST_CODE_DINGJIN );
                                    }
                                }
                            }
                        })
                        .showAsDropDown(mLinearLayout, xoff, 0);
//                        .showAsDropDown(moreBtn);
            }
        });

        mImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(getActivity(), ProActivityActivity2.class),REQUEST_CODE_HUODONG_XUANZE);
            }
        });

        mViewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position==0){
                    mImageView1.setSelected(true);
                    mImageView2.setSelected(false);
                    mImageView3.setSelected(false);
                }
                else if(position==1){
                    mImageView1.setSelected(false);
                    mImageView2.setSelected(true);
                    mImageView3.setSelected(false);
                }
                else {
                    mImageView1.setSelected(false);
                    mImageView2.setSelected(false);
                    mImageView3.setSelected(true);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return view;
    }


    @Override
    public void initData() {
        super.initData();
        getData();
    }

    private void getData() {
        String url = BaseUrl.BASE_URL+"activityController.do?method=getActivity&token_id=" + token_id+"&loginOS=2";
        Log.d("BaseUrl", url);
        try {
            RestClient.builder()
                    .url(url)
                    .success(new ISuccess() {
                        @Override
                        public void onSuccess(String response) {
                            if(mRequestDialog!=null&&mRequestDialog.isShowing()){
                                mRequestDialog.dismiss();
                            }
                            if(response!=null){
                                try {
                                    ActivityListNew activityList = JSONUtil.fromJson(response, ActivityListNew.class);
                                    if(activityList.getRet().equals("200")){
                                        List<ActivityListNew.DataListBean> dataList = activityList.getDataList();
                                        if(dataList.size()!=0){
                                            activityId = dataList.get(0).getActivityId();
                                            merchants = dataList.get(0).getMerchants();
                                            mTextView.setText(activityList.getDataList().get(0).getActivityName());
                                            showTabData(merchants);
                                            getRoleType(activityId);
                                            PreferencesUtils.putString(mContext,"huodongactivityId",activityId);
                                            EventBus.getDefault().post(new MessageEvent("获取所有商户信息"));
                                        }
                                        else {

                                        }
                                        isFirst=false;
                                    }
                                }
                                catch (Exception e){
                                    if(mRequestDialog!=null&&mRequestDialog.isShowing()){
                                        mRequestDialog.dismiss();
                                    }
                                    Toast.makeText(getActivity(), ""+e, Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                    })
                    .failure(new IFailure() {
                        @Override
                        public void onFailure() {
                            if(mRequestDialog!=null&&mRequestDialog.isShowing()){
                                mRequestDialog.dismiss();
                            }
                            Toast.makeText(getActivity(), "获取数据错误了！！！！", Toast.LENGTH_SHORT).show();
                        }
                    }).error(new IError() {
                @Override
                public void onError(int code, String msg) {
                    if(mRequestDialog!=null&&mRequestDialog.isShowing()){
                        mRequestDialog.dismiss();
                    }
                    Toast.makeText(getActivity(), "" + msg, Toast.LENGTH_SHORT).show();
                }
            })
                    .build()
                    .get();
        }
        catch (Exception e){
            if(mRequestDialog!=null&&mRequestDialog.isShowing()){
                mRequestDialog.dismiss();
            }
            ToastUtils.showLong("获取数据错误了");
        }
    }

    private void getRoleType(String activityId) {
        String url = BaseUrl.BASE_URL+"activityController.do?method=getRoleAtAcitvity&token_id="+token_id+"&loginOS=2&activityId="+activityId;
        Log.d("getRoleType", url);
        try {
            RestClient.builder()
                    .url(url)
                    .success(new ISuccess() {
                        @Override
                        public void onSuccess(String response) {
                            if(response!=null){
                                try {
                                    RoleType activityList = JSONUtil.fromJson(response, RoleType.class);
                                    if(activityList.getRet().equals("200")){
                                        String data = activityList.getData();
                                        if(data!=null){
                                            switch (data){
                                                case "签到员":
                                                    roleType="0";
                                                    break;
                                                case "收银员":
                                                    roleType="1";
                                                    break;
                                                case "礼品兑换员":
                                                    roleType="0";
                                                    break;
                                            }
                                        }
                                    }
                                }
                                catch (Exception e){
                                    Toast.makeText(getActivity(), ""+e, Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                    })
                    .failure(new IFailure() {
                        @Override
                        public void onFailure() {
                            Toast.makeText(getActivity(), "获取数据错误了！！！！", Toast.LENGTH_SHORT).show();
                        }
                    }).error(new IError() {
                @Override
                public void onError(int code, String msg) {

                    Toast.makeText(getActivity(), "" + msg, Toast.LENGTH_SHORT).show();
                }
            })
                    .build()
                    .get();
        }
        catch (Exception e){
            ToastUtils.showLong("获取数据错误了");
        }
    }

    private void showTabData(List<ActivityListNew.DataListBean.MerchantsBean> merchants) {
        tabRecyclerViewAdapter=new TabRecyclerViewAdapter3(R.layout.tab_items,merchants);
        tabRecyclerViewAdapter.setThisPosition(100);
        initRecyclerView(tabRecyclerViewAdapter);
    }

    private void initRecyclerView(final TabRecyclerViewAdapter3 tabRecyclerViewAdapter) {
        final LinearLayoutManager manager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(tabRecyclerViewAdapter);
        tabRecyclerViewAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                mTextView2.setTextColor(getResources().getColor(R.color.darker_gray));
                tabRecyclerViewAdapter.setThisPosition(position);
                tabRecyclerViewAdapter.notifyDataSetChanged();
                mRecyclerView.scrollToPosition(position);
                merchantsId=merchants.get(position).getMerchantId();
                Log.d("merchantsId",merchantsId);
                PreferencesUtils.putString(mContext,"huodongmerchantId",merchantsId);
                EventBus.getDefault().post(new MessageEvent("获取商户信息"));
            }
        });

    }

    private void SetUpViewPager(ViewPager bookViewpager) {
        ActivityFragmentAdapter adapter = new ActivityFragmentAdapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(ShouKaFragment.newInstance(), "");
        adapter.addFragment(HoudongDingjinFragment.newInstance(), "");
        adapter.addFragment(DaiDanTongjiFragment.newInstance(), "");
        bookViewpager.setAdapter(adapter);
        bookViewpager.setCurrentItem(0, true);
        bookViewpager.setOffscreenPageLimit(3);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE_HUODONG_XUANZE&&resultCode==1007){
            mTextView2.setTextColor(getResources().getColor(R.color.colorPrimary));
            activityId2=data.getStringExtra("activityId");
            mTextView.setText(data.getStringExtra("activityName"));
            merchants= (List<ActivityListNew.DataListBean.MerchantsBean>) data.getSerializableExtra("merchantsList");
            showTabData(merchants);
            getRoleType(activityId2);
            PreferencesUtils.putString(mContext,"huodongactivityId",activityId2);
            PreferencesUtils.putString(mContext,"huodongmerchantId",merchantsId);
            EventBus.getDefault().post(new MessageEvent("获取所有商户信息"));
        }
        else if(requestCode==REQUEST_CODE_HUODONG){
            EventBus.getDefault().post(new MessageEvent("活动拓客"));
        }
        else if(requestCode==REQUEST_CODE_DINGJIN){
            EventBus.getDefault().post(new MessageEvent("活动订金"));
        }
        else if(requestCode==REQUEST_CODE_SCAN){

        }
    }
}
