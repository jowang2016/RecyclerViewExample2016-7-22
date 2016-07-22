package com.example.jowang.recylerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jowang on 16/7/22.
 */
public class Adapter extends RecyclerView.Adapter {
    class viewHolder extends RecyclerView.ViewHolder{
        private View root;
        TextView tv1,tv2;
        public viewHolder(View root) {
            super(root);
            tv1=(TextView)root.findViewById(R.id.text);
            tv2=(TextView)root.findViewById(R.id.text2);

        }

        public TextView getTv1() {
            return tv1;
        }

        public TextView getTv2() {
            return tv2;
        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        viewHolder vh=new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell,null,false));
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        viewHolder vh=(viewHolder)holder;
        Data cd=data[position];
        vh.getTv1().setText(cd.getTitle());
        vh.getTv2().setText(cd.getContent());
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
    private Data[] data=new Data[]{new Data("x","y")};
}
