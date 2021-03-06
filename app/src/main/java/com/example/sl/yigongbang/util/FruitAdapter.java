package com.example.sl.yigongbang.util;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sl.yigongbang.R;

import java.util.List;


public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
    private Context mContext;//为了实现子项布局的复用 之后这个Context对象会用来存储子项布局 通过parent。getContext方式获取
    private List<Fruit> mFruitList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView fruitName;
        TextView fruitTime;
        TextView fruitPlace;
        TextView fruitNumber;

        public ViewHolder(View view){
            super(view);
            cardView=(CardView)view;//保存最外层布局的实例，方便下面调用 其实就两个控件
            fruitName=(TextView)view.findViewById(R.id.fruit_name);//控件实例化
            fruitTime=(TextView)view.findViewById(R.id.fruit_time);
            fruitPlace=(TextView)view.findViewById(R.id.fruit_place);
            fruitNumber=(TextView)view.findViewById(R.id.fruit_number);
        }
    }
    public FruitAdapter(List<Fruit> fruitList){
        mFruitList=fruitList;//将外部传入的数据转化为本类数据 数据来源可能是开头适配器注释的泛型
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(mContext==null){
            mContext=parent.getContext();
        }
        View view= LayoutInflater.from(mContext).inflate(R.layout.fruit_item,parent,false);
        final ViewHolder holder=new ViewHolder(view);//子项布局 一定在ViewHolder的对象中(RecyclerView或者NestedScrollView下的viewholder) holder是存储了之前定义的view的 然后我们添加点击事件
        holder.cardView.setOnClickListener(new View.OnClickListener(){//卡片布局的点击事件
            @Override
            public void onClick(View v) {
                int position=holder.getAdapterPosition();
                Fruit fruit=mFruitList.get(position);
                Intent intent=new Intent(mContext,Detail.class);//mContext的内容传进去
                intent.putExtra(Detail.FRUIT_NAME,fruit.getName());
                intent.putExtra(Detail.FRUIT_TIME,fruit.getTime());
                intent.putExtra(Detail.FRUIT_PLACE,fruit.getPlace());
                intent.putExtra(Detail.FRUIT_NUMBER,fruit.getNumber());
                mContext.startActivity(intent);
            }
        });
        return holder;//返回内部类对象 这里实现了view的逻辑化
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fruit fruit=mFruitList.get(position);//获得当前项的fruit类
        holder.fruitName.setText("活动名称"+fruit.getName());//得到具体的数据
        holder.fruitTime.setText("活动时间"+fruit.getTime());
        holder.fruitPlace.setText("活动地点"+fruit.getPlace());
        holder.fruitNumber.setText("活动人数"+fruit.getNumber());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();//计算集合类mFruitList的长度
    }

}
