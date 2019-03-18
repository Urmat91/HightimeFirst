package com.urmat.hightime.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.urmat.hightime.R;
import com.urmat.hightime.lessons.advanced.AdvancedActivity;
import com.urmat.hightime.lessons.alphabet.AlphabetActivity;
import com.urmat.hightime.lessons.beginner.BeginnerActivity;
import com.urmat.hightime.lessons.intermediate.IntermediateActivity;
import com.urmat.hightime.lessons.pre_intermediate.PreIntermadiateActivity;
import com.urmat.hightime.lessons.upper_intermediate.UpperIntermediateActivity;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    }

    public void onBack(View view) {
        finish();
    }

    public void onAlphabet(View view) {
        startActivity(new Intent(this, AlphabetActivity.class));
    }

    public void onBeginner(View view) {
        startActivity(new Intent(this, BeginnerActivity.class));
    }

    public void onInter1(View view) {
        startActivity(new Intent(this, PreIntermadiateActivity.class));
    }

    public void onInter2(View view) {
        startActivity(new Intent(this, UpperIntermediateActivity.class));
    }

    public void onInter3(View view) {
        startActivity(new Intent(this, IntermediateActivity.class));
    }

    public void onAdvanced(View view) {
        startActivity(new Intent(this, AdvancedActivity.class));
    }
}
