package com.urmat.hightime.lessons.pre_intermediate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.urmat.hightime.R;

public class PreIntermadiateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_intermadiate);

        TextView textView = findViewById(R.id.textView);
        textView.setText("1)  Pre-Intermediate уровень состоит из 25\n" +
                " уроков. Каждый урок состоит из трех видео\n" +
                " уроков, интересных игр, диалогов c\n" +
                " носителями английского языка, а также\n" +
                " тестирования для проверки ваших знаний.\n" +
                "\n" +
                "•    По завершению этого уровня, если вы\n" +
                " хорошо усвоите все уроки, то вы будете знать\n" +
                " основы английской грамматики, в словарном\n" +
                " запасе будет более 2000 слов. Вы сможете\n" +
                " составлять грамматически правильные\n" +
                " предложения на английском языке, понимать\n" +
                " общий смысл высказываний собеседника,\n" +
                " можете поддерживать простой диалог и\n" +
                " задавать вопросы.\n" +
                "\n" +
                "•    Для успешного завершения этого уровня\n" +
                " вам потребуется иметь при себе пластилин.\n" +
                "\n" +
                "•    Чем интенсивнее вы будете изучать\n" +
                " материалы курса, тем быстрее будете\n" +
                " продвигаться.\n" +
                "\n" +
                "•     Мы призываем вас изучать материалы и\n" +
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
