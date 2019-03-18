package com.urmat.hightime.personal_area;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.urmat.hightime.R;

public class PersonalAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_area);
    }

    public void onBack(View view) {
        finish();
    }
}
