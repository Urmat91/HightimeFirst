package com.urmat.hightime.lessons.advanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.urmat.hightime.R;

public class AdvancedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

        TextView textView = findViewById(R.id.textView);
        textView.setText("");
    }

    public void onBack(View view) {
        finish();
    }

    public void onBuy(View view) {
    }

    public void onToSend(View view) {
    }

    public void onOtherLevel(View view) {
    }
}
