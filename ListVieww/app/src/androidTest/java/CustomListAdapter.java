package com.example.listview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private ArrayList<ListItem> listData;
    private LayoutInflater layoutInflater;

    public CustomListAdapter(Context context, ArrayList<ListItem> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            // Debug statement
            Log.d("CustomListAdapter", "Inflating new view for position: " + position);

            convertView = layoutInflater.inflate(R.layout.list_row, parent, false);
            holder = new ViewHolder();
            holder.uName = convertView.findViewById(R.id.name);
            holder.uDesignation = convertView.findViewById(R.id.designation);
            holder.uLocation = convertView.findViewById(R.id.location);
            convertView.setTag(holder);
        } else {
            // Debug statement
            Log.d("CustomListAdapter", "Reusing existing view for position: " + position);

            holder = (ViewHolder) convertView.getTag();
        }

        // Debug statement
        Log.d("CustomListAdapter", "Setting data for position: " + position);

        // Populate data into views
        holder.uName.setText(listData.get(position).getName());
        holder.uDesignation.setText(listData.get(position).getDesignation());
        holder.uLocation.setText(listData.get(position).getLocation());

        return convertView;
    }

    static class ViewHolder {
        TextView uName;
        TextView uDesignation;
        TextView uLocation;
    }
}
