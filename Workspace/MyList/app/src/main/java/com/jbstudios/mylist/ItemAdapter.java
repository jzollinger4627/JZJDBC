package com.jbstudios.mylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;
    String[] prices;
    String[] descriptions;

    public ItemAdapter(Context c, String[] i, String[] p, String[] d) {
        items = i;
        prices = p;
        descriptions = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return items.length;
    }

    public Object getItem(int position) {
        return items[position];
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int i, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView priceTextView = (TextView) v.findViewById(R.id.Price);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.Description);

        String name = items[i];
        String description = descriptions[i];
        String price = prices[i];

        nameTextView.setText(name);
        descriptionTextView.setText(description);
        priceTextView.setText(price);

        return v;
    }
}
