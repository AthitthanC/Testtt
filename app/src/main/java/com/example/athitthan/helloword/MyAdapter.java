package com.example.athitthan.helloword;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Athitthan on 13-Nov-16.
 */

public class MyAdapter extends BaseAdapter {
    //Explicit
    private Context context;
    private String[] nameStrings, phoneStrings, imagesStrings;
    private TextView nameTextView, phoneTextView;
    private ImageView imageView;

    public MyAdapter(Context context,
                     String[] nameStrings,
                     String[] phoneStrings,
                     String[] imagesStrings) {
        this.context = context;
        this.nameStrings = nameStrings;
        this.phoneStrings = phoneStrings;
        this.imagesStrings = imagesStrings;
    }

    @Override
    public int getCount() {
        return nameStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.my_layout, parent, false);

        //Bind Widget
        nameTextView = (TextView) view.findViewById(R.id.textView2);
        phoneTextView = (TextView) view.findViewById(R.id.textView3);
        imageView = (ImageView) view.findViewById(R.id.imageView3);

        //ShowView
        nameTextView.setText(nameStrings[position]);
        phoneTextView.setText(nameStrings[position]);

        Picasso.with(context).load(imagesStrings[position]).into(imageView);







        return view;
    }
    //Main Class

}
