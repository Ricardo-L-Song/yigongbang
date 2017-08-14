package com.example.sl.yigongbang.util.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sl.yigongbang.R;

public class RecordFragment extends BaseFragment{
    private String[] data={"Apple","Apple","Apple","Apple","Apple","Apple"};
    private String[] data2={"Orange","Orange","Orange","Orange","Orange","Orange"};
    @Override
    protected void initView() {
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_message;
    }

    @Override
    protected void getDataFromServer() {
        Toast.makeText(mContext, "RecordFragment页面请求数据了", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toolbar toolbar=(Toolbar)view.findViewById(R.id.toolbar11);
        ListView listView=(ListView)view.findViewById(R.id.List_view1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
        ListView listView2=(ListView)view.findViewById(R.id.List_view2);
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data2);
        listView2.setAdapter(adapter2);
    }
}
