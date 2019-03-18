package com.urmat.hightime.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.urmat.hightime.R;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Крупнейшая языковая школа Кыргызстана \n" +
                "по изучению английского языка.\n" +
                "HighTime был создан 13 января 2006 года. \n" +
                "Основателем школы HighTime является \n" +
                "Гульзат Мамытбек. \n" +
                "Цель создания школы - открыть \n" +
                "бизнес и забрать родителей из села, \n" +
                "из села Ала-Бука, \n" +
                "Жалал-Абадской области.\n");

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText("Позвольте выразить Вам искреннюю \n" +
                "благодарность от своего лица и от всего\n" +
                "коллектива «Navat» за обучение. \n" +
                "Все приобретенные знания используются \n" +
                "нами во время работы, ведь у нас много \n" +
                "иностранных гостей из разных стран. \n" +
                "И им требуется обращаться \n" +
                "на английском языке.\n" +
                "Надеемся на дальнейшее столь \n" +
                "же плодотворное сотрудничество.");

        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("Компания MegaCom (ЗАО \"Альфа\n" +
                " Телеком\") выражает благодарность\n" +
                " сотрудникам языковой школы “High Time”\n" +
                " за отлично проведенные уроки.\n" +
                "\n" +
                "Обучение персонала должно проходить \n" +
                "таким образом, чтобы мотивировать \n" +
                "сотрудников на дальнейшее развитие и на\n" +
                "достижение результатов. Особенно\n" +
                "приятно, когда\n" +
                "обучение проходит легко и интересно.\n" +
                "Знание английского языка в наше время\n" +
                "является необходимым.\n" +
                "Мы благодарим за \n" +
                "высокопрофессиональный подход и\n" +
                "качественную подачу материала!");

        TextView textView4 = findViewById(R.id.textView4);
        textView4.setText("Этно-комплекс “Супара ” выражает\n" +
                " благодарность за обучение. Хотим\n" +
                " отметить высокую квалификацию\n" +
                " преподавательского состава, четкую и\n" +
                " профессиональную работу сотрудников.\n" +
                "\n" +
                " Желаем дальнейшего процветания и\n" +
                " профессиональных побед! Вместе с Вами\n" +
                " всегда есть к чему стремиться и расти\n" +
                " молодому поколению, которое стоит на\n" +
                " пути выбора своей жизненной\n" +
                " профессии. Желаем Вам и Вашему\n" +
                " коллективу благополучия и больших\n" +
                " творческих успехов в нелегком и\n" +
                " благородном труде!\n");
    }

    public void onBack(View view) {
        finish();
    }
}
