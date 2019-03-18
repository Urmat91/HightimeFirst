package com.urmat.hightime.lessons.alphabet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.urmat.hightime.lessons.alphabet.lessons.CharAActivity;
import com.urmat.hightime.R;

public class AlphabetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        TextView textView = findViewById(R.id.textView);
        textView.setText("1) ABC уровень рассчитан для детей\n" +
                " дошкольного и младшего возраста, а также\n" +
                " для учителей, родителей, которые помогут\n" +
                " малышам делать первые шаги для изучения\n" +
                " английского языка и тем, кто желает выучить \n" +
                "английский с нулевого уровня.\n" +
                "\n" +
                "•  На этом уровне всего 26 уроков. Каждый\n" +
                " урок состоит из трех видео уроков,\n" +
                " интересных игр, а также тестирования для\n" +
                " проверки ваших знаний.\n" +
                "\n" +
                "•  По завершению этого уровня, вы будете\n" +
                " знать алфавит английского языка, более 200\n" +
                " слов и веселые песни. Вы сможете составлять\n" +
                " простые предложения на английском языке.\n" +
                "\n" +
                "•  Для успешного завершения этого уровня\n" +
                " вам потребуется иметь при себе пластилин.\n" +
                "\n" +
                "•  Чем интенсивнее вы будете изучать\n" +
                " материалы курса, тем быстрее будете\n" +
                " продвигаться.\n" +
                "\n" +
                "•  Мы призываем вас изучать материалы и\n" +
                " применять изученное в повседневной жизни.");
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

    public void onA(View view) {
        startActivity(new Intent(this, CharAActivity.class));
    }
}
