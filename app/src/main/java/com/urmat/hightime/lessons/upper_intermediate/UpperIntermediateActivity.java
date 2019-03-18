package com.urmat.hightime.lessons.upper_intermediate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.urmat.hightime.R;

public class UpperIntermediateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_intermediate);

        TextView textView = findViewById(R.id.textView);
        textView.setText("1)  Upper- Intermediate уровень состоит из 22\n" +
                " уроков. Каждый урок состоит из двух видео\n" +
                " уроков, упражнений, диалогов c носителями\n" +
                " английского языка, а также тестирования для\n" +
                " проверки ваших знаний.\n" +
                "\n" +
                "•  Ступень Upper-Intermediate — серьезный\n" +
                " уровень знаний, достаточный для общения\n" +
                " на английском языке почти во всех сферах.\n" +
                "\n" +
                "•  По завершению этого уровня, если вы\n" +
                " хорошо усвоите все уроки, то вы будете\n" +
                " знать:\n" +
                "\n" +
                "•  Вы сможете составлять грамматически\n" +
                " правильные предложения, употребляя все\n" +
                " времена, которые существуют в английском\n" +
                " языке.\n" +
                "\n" +
                "•   Можете понять основную идею простых\n" +
                " неадаптированных текстов, даже если вам\n" +
                " встретятся незнакомые слова.\n" +
                "\n" +
                "•   В разговоре вы используете разные\n" +
                " грамматические конструкции, оперируете\n" +
                " всеми временами, условными\n" +
                " предложениями, фразами в пассивном и\n" +
                " активном залоге.\n" +
                "\n" +
                "•   Вы понимаете носителей языка, даже если\n" +
                " они говорят с акцентом или в быстром темпе.\n" +
                "\n" +
                "•   Вы можете написать эссе (сочинение) на\n" +
                " любую тему, четко выражая свои мысли.\n" +
                "\n" +
                "•  Чем интенсивнее вы будете изучать\n" +
                " материалы курса, тем быстрее будете\n" +
                " продвигаться.\n" +
                "\n" +
                "•  Мы призываем вас изучать материалы и\n" +
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
