package com.adara.yash.memelordthesoundboard;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class MyAdapter extends ArrayAdapter {
    private Activity context;
    private String[] arr;
    private String[] arr1;
    private Integer[] arr2;

    public MyAdapter(Activity context,String[] arr,String[] arr1,Integer[] arr2)
    {
        super(context,R.layout.customlayout,arr);
        this.context = context;
        this.arr = arr;
        this.arr1 = arr1;
        this.arr2 = arr2;
    }




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inf = context.getLayoutInflater();
        View rowview = inf.inflate(R.layout.customlayout,null,true);

        TextView tv1 = (TextView)rowview.findViewById(R.id.textView2);
        TextView tv2 = (TextView)rowview.findViewById(R.id.textView3);
        TextView tv3 = (TextView)rowview.findViewById(R.id.textView4);
        tv2.setText(arr1[position]);
        tv3.setText(arr2[position].toString());

        final String UID = arr1[position];

        int color = context.getResources().getColor(R.color.Fav_colour);

        if(arr2[position].equals(1)) {
            tv1.setTextColor(color);
            tv1.setText(arr[position]);
        }
        else
        {
            tv1.setText(arr[position]);
        }
        return rowview;
    }
}
