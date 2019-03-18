package com.urmat.hightime.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.urmat.hightime.Auth.register.CheckInActivity;
import com.urmat.hightime.Auth.login.ToComeInActivity;
import com.urmat.hightime.Contact.ContactActivity;
import com.urmat.hightime.R;
import com.urmat.hightime.news.NewsActivity;
import com.urmat.hightime.personal_area.PersonalAreaActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAboutUs(View view) {
        startActivity(new Intent(this, AboutUsActivity.class));
    }

    public void onStudent(View view) {
        startActivity(new Intent(this, StudentActivity.class));
    }

    public void onInstruction(View view) {
        startActivity(new Intent(this, LevelActivity.class));
    }

    public void onOurTeam(View view) {
        startActivity(new Intent(this, OurTeamActivity.class));
    }

    public void onOurBranches(View view) {
        startActivity(new Intent(this, OurBranchesActivity.class));
    }

    public void onNews(View view) {
        startActivity(new Intent(this, NewsActivity.class));
    }

    public void onContacts(View view) {
        startActivity(new Intent(this, ContactActivity.class));
    }

    public void onPersonalArea(View view) {
        startActivity(new Intent(this, PersonalAreaActivity.class));
    }

    public void onToComeIn(View view) {
        startActivity(new Intent(this, ToComeInActivity.class));
    }

    public void onCheckIn(View view) {
        startActivity(new Intent(this, CheckInActivity.class));
    }
}
