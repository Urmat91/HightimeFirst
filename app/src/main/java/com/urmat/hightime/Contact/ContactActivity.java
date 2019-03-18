package com.urmat.hightime.Contact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.urmat.hightime.R;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void onBack(View view) {
        finish();
    }
}
