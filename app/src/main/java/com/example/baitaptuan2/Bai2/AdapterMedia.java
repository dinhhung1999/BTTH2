package com.example.baitaptuan2.Bai2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.baitaptuan2.R;

import java.util.List;

public class AdapterMedia extends BaseAdapter {
    List<Media> mediaList;

    public AdapterMedia(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    @Override
    public int getCount() {
        return mediaList.size();
    }

    @Override
    public Object getItem(int position) {
        return mediaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_mediaplayer_layout,parent,false);
        TextView tvTitle = v.findViewById(R.id.tvTitleMedia);
        ImageView imMediaPlayer = v.findViewById(R.id.imMedia);
        Media media = mediaList.get(position);
        tvTitle.setText(media.getTitle());
        imMediaPlayer.setImageResource(media.getResourceImage());
        return v;
    }
}
