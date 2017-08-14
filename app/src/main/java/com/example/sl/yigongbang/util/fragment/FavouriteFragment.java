package com.example.sl.yigongbang.util.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sl.yigongbang.R;

public class FavouriteFragment extends BaseFragment{
   private String[] data={"Apple","Apple","Apple","Apple","Apple","Apple","Apple","Apple","Apple","Apple","Apple",
            "Apple","Apple","Apple","Apple","Apple","Apple","Apple","Apple",};
    @Override
    protected void initView() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_favourite;
    }

    @Override
    protected void getDataFromServer() {
        Toast.makeText(mContext, "FavouriteFragment页面请求数据了", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toolbar toolbar=(Toolbar)view.findViewById(R.id.toolbar3);
        ListView listView=(ListView)view.findViewById(R.id.List_view);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
        //这里只是用了适配器adapter做了个例子 其实应该通过网络请求 申请义工信息 然后点击listView的响应按钮 跳转到收藏的义工信息的页面
    }
}
