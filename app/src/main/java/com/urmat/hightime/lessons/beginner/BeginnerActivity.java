package com.urmat.hightime.lessons.beginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.urmat.hightime.R;

public class BeginnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);

        TextView textView = findViewById(R.id.textView);
        textView.setText("1)  Beginner уровень состоит из 44 уроков.\n" +
                " Каждый урок состоит из трех видео уроков,\n" +
                " интересных игр, диалогов c носителями\n" +
                " английского языка, а также тестирования\n" +
                " для проверки ваших знаний.\n" +
                "\n" +
                "•   По завершению этого уровня, если вы\n" +
                " хорошо усвоите все уроки, то вы будете\n" +
                " бегло читать, в словарном запасе будет более\n" +
                " 1500 слов. Вы сможете составлять простые\n" +
                " предложения на английском языке.\n" +
                "\n" +
                "•   Для успешного завершения этого уровня\n" +
                " вам потребуется иметь при себе пластилин.\n" +
                "\n" +
                "•   Чем интенсивнее вы будете изучать\n" +
                " материалы курса, тем быстрее будете\n" +
                " продвигаться.\n" +
                "\n" +
                "•   Мы призываем вас изучать материалы и\n" +
                " применять изученное в повседневной жизни.\n");
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
