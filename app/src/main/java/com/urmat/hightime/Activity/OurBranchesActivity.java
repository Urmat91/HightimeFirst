package com.urmat.hightime.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.urmat.hightime.R;

public class OurBranchesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_branches);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Филиалы HighTime находятся не только в" + "\n" +
                " Кыргызстане, а также в городах Казахстана" + "\n" +
                " и России. После открытия в Бишкеке," + "\n" +
                " филиал открылся в Оше, в Джалал-Абаде," + "\n" +
                " затем расширилась до Алматы, Астаны," + "\n" +
                " Атырау, Караганды, Шымкент и до" + "\n" +
                " Санкт-Петербурга." + "\n" +
                "\n" +
                "Во время 12 летного опыта языковая" + "\n" +
                " школа «HighTime» выпустила 50 000" + "\n" +
                " студентов, приобрела 175 корпоративных" + "\n" +
                " клиентов, число преподавателей" + "\n" +
                " составило 100 и это в 17 офисах.");
    }

    public void onBack(View view) {
        finish();
    }
}
