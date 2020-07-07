package com.example.baitaptuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.baitaptuan2.Bai2.AdapterMedia;
import com.example.baitaptuan2.Bai2.Media;
import com.example.baitaptuan2.Bai3.MediaPlayerActivity;
import com.example.baitaptuan2.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Media media1,media2,media3,media4,media5,media6,media7,media8,media9,media10;
    AdapterMedia adapterMedia;
    List<Media> mediaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        media1 = new Media(getResources().getString(R.string.tienquanca),R.drawable.tienquanca);
        media2 = new Media(getResources().getString(R.string.tienquanca),R.drawable.tienquanca);
        media3 = new Media(getResources().getString(R.string.tienquanca),R.drawable.tienquanca);
        media4 = new Media(getResources().getString(R.string.tienquanca),R.drawable.tienquanca);
        media5 = new Media(getResources().getString(R.string.tienquanca),R.drawable.tienquanca);
        media6 = new Media(getResources().getString(R.string.tienquanca),R.drawable.tienquanca);
        media7 = new Media(getResources().getString(R.string.tienquanca),R.drawable.tienquanca);
        media8 = new Media(getResources().getString(R.string.tienquanca),R.drawable.tienquanca);
        media9 = new Media(getResources().getString(R.string.tienquanca),R.drawable.tienquanca);
        media10 = new Media(getResources().getString(R.string.tienquanca),R.drawable.tienquanca);
        mediaList = new ArrayList<>();
        mediaList.add(media1);
        mediaList.add(media2);
        mediaList.add(media3);
        mediaList.add(media4);
        mediaList.add(media5);
        mediaList.add(media6);
        mediaList.add(media7);
        mediaList.add(media8);
        mediaList.add(media9);
        mediaList.add(media10);
        adapterMedia = new AdapterMedia(mediaList);
        final ListView lvMedia = findViewById(R.id.lvMedia);
        lvMedia.setAdapter(adapterMedia);
        lvMedia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), MediaPlayerActivity.class);
                String title = mediaList.get(position).getTitle();
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });
    }
}