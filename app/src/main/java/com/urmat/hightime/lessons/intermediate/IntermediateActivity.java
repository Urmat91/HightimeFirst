package com.urmat.hightime.lessons.intermediate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.urmat.hightime.R;

public class IntermediateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermadiate);

        TextView textView = findViewById(R.id.textView);
        textView.setText("1)  Intermediate уровень состоит из 18 уроков.\n" +
                " Каждый урок состоит из трех видео уроков,\n" +
                " упражнений, диалогов c носителями\n" +
                " английского языка, а также тестирования для\n" +
                " проверки ваших знаний.\n" +
                "\n" +
                "•   По завершению этого уровня, если вы\n" +
                " хорошо усвоите все уроки, то вы будете знать\n" +
                " основы английской грамматики, в словарном\n" +
                " запасе будет более 3000 слов. Вы сможете\n" +
                " составлять грамматически правильные\n" +
                " предложения, употребляя все времена,\n" +
                " которые существуют в английском языке. Вы\n" +
                " понимаете несложные рекламные тексты,\n" +
                " газетные и журнальные статьи,\n" +
                " адаптированную для своего уровня \n" +
                "литературу.\n" +
                "\n" +
                "•   Можете понять основную идею простых\n" +
                " неадаптированных текстов, даже если вам\n" +
                " встретятся незнакомые слова.\n" +
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
