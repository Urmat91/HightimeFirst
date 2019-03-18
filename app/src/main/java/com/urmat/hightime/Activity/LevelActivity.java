package com.urmat.hightime.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.urmat.hightime.R;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        TextView textView = findViewById(R.id.textView);
        textView.setText("High Time даст вам возможность быстро и" + "\n" +
                "легко выучить английский язык." + "\n" +
                "В этих курсах есть 6 уровней, в каждом" + "\n" +
                "уровне по 25-30 уроков." + "\n" +
                "Один урок включает в себя несколько" + "\n" +
                "видео уроков, которые дадут вам" + "\n" +
                "возможность максимально" + "\n" +
                "хорошо усвоить тему." + "\n" +
                "Вы можете изучать английский язык с" + "\n" +
                "помощью снятых нами видео-роликов," + "\n" +
                "использованием различных пластилинов," + "\n" +
                "очень доступное объяснение различных" + "\n" +
                "тем. Это приложение эффективно улучшит" + "\n" +
                "ваши знания по грамматике," + "\n" +
                "расширит словарный запас и поможет" + "\n" +
                "подготовиться к экзаменам, путешествию," + "\n" +
                "где не будет языковых барьеров(преград).");
    }

    public void onTest(View view) {

    }

    public void onBack(View view) {
        finish();
    }
}
