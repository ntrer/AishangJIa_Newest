package com.shushang.aishangjia.fragment.KehuDingdanxnixiFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.shushang.aishangjia.R;
import com.shushang.aishangjia.base.BaseFragment;
import com.shushang.aishangjia.fragment.KehuDingdanxnixiFragment.adapter.KehuDingdanXInxiAdapter;

import java.util.ArrayList;
import java.util.List;

import me.texy.treeview.TreeNode;
import me.texy.treeview.TreeView;

public class KehuDingdanXInxiFragment extends BaseFragment {


    private List<String> mStrings=new ArrayList<>();
    private LinearLayout mLinearLayout;
    private KehuDingdanXInxiAdapter mKehuDingdanXInxiAdapter;
    private TreeNode rootNode;

    public KehuDingdanXInxiFragment() {
        // Required empty public constructor
    }

    public static KehuDingdanXInxiFragment newInstance() {
        return new KehuDingdanXInxiFragment();
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
     getData();
    }

    private void getData() {
        rootNode = TreeNode.root();
        for (int i = 0; i < 20; i++) {
            TreeNode treeNode1 = new TreeNode("图书馆");
            treeNode1.setLevel(0);
            treeNode1.setExpanded(false);
            treeNode1.setItemClickEnable(true);
                TreeNode treeNode2 = new TreeNode("");
                treeNode2.setLevel(1);//设置级数
                treeNode2.setExpanded(false);//设置是否展开
                treeNode2.setItemClickEnable(true);//是否可点击
                treeNode1.addChild(treeNode2);

            rootNode.addChild(treeNode1);
        }
    }



    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragment_kehudingdan, null);
        mLinearLayout=view.findViewById(R.id.myView_first);
        getData();
        TreeView treeView = new TreeView(rootNode,getActivity(),new FirstItemViewFactory());
        View view1 = treeView.getView();
        view.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mLinearLayout.addView(view1);
        //得到选择的类目
        List<TreeNode> mTreeNodes = treeView.getSelectedNodes();
        return view;
    }




}
