package com.haynhanh.troll.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import com.haynhanh.troll.ImageFragment;
import com.haynhanh.troll.MainActivity;
import com.haynhanh.troll.R;
import com.haynhanh.troll.model.DomainDetail;
import com.squareup.picasso.Picasso;

/**
 * Created by peter on 2/19/17.
 */

public class DrawerAdapter extends ArrayAdapter<DomainDetail> {

    public DrawerAdapter(Context context, List<DomainDetail> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.drawer_item, parent, false);

        ImageView icon = (ImageView) convertView.findViewById(R.id.icon);
        TextView name = (TextView) convertView.findViewById(R.id.tv_name);

        Picasso.with(getContext()).load(getItem(position).getLogo()).error(R.drawable.ic_troll_face).into(icon);
        name.setText(getItem(position).getName());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int domainId = getItem(position).getId();
                ((MainActivity) getContext()).getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, ImageFragment.getInstance(domainId));
            }
        });

        return convertView;
    }
}