package com.urmat.hightime.lessons.alphabet.lessons;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import com.urmat.hightime.R;
import com.urmat.hightime.lessons.video.VideoActivity;

public class CharAActivity extends AppCompatActivity {
    VideoView videoView1;
    CharSequence charSequence[] = {"a. 6", "b. 8", "c. 5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_a);
    }

    public void onCancel(View view) {
        finish();
    }

    public void on1Video(View view) {
        Intent intent = new Intent(CharAActivity.this, VideoActivity.class);
        intent.putExtra("uri", "http://htlife.biz/uploads/videos/levels/alphabet/letter-a/f8cfa6147ef6695d760e5c231ed67c38.mp4");
        startActivity(intent);
    }

    public void on2Video(View view) {
        Intent intent = new Intent(CharAActivity.this, VideoActivity.class);
        intent.putExtra("uri", "http://htlife.biz/uploads/videos/levels/alphabet/letter-a/89882c084a34207d83dea57804190a07.mp4");
        startActivity(intent);
    }

    public void on3Video(View view) {
        Intent intent = new Intent(CharAActivity.this, VideoActivity.class);
        intent.putExtra("uri", "http://htlife.biz/uploads/videos/levels/alphabet/letter-a/51d5ebadb77249f4d4bf2e61f2c1680f.mp4");
        startActivity(intent);
    }

    public void onUPR(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(CharAActivity.this);
        builder.setTitle("1) Подсчитайте количество букв a" );
//        builder.setMultiChoiceItems(charSequence, new bool  ean[charSequence.length], new DialogInterface.OnMultiChoiceClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
//
//            }
//        });

        builder.setSingleChoiceItems(charSequence, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setPositiveButton("Продолжить", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.setCancelable(false);
        alertDialog.show();
    }
}
