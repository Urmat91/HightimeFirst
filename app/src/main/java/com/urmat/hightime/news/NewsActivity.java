package com.urmat.hightime.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.urmat.hightime.R;
import com.urmat.hightime.api.App;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsActivity extends AppCompatActivity {

    NewsAdapter adapter;
    ArrayList<News> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NewsAdapter(list);
        recyclerView.setAdapter(adapter);
        getNews();
        adapter.notifyDataSetChanged();
    }

    private void getNews() {
        App.getApi().getTest().enqueue(new Callback<List<News>>() {
            @Override
            public void onResponse(Call<List<News>> call, Response<List<News>> response) {
                Log.e("TAG", "response: " + response.code());
                List<News> news = response.body();
                if (news != null) {
                    showData(news);
                }
            }

            @Override
            public void onFailure(Call<List<News>> call, Throwable t) {
                Log.e("TAG", "onFailure: " + t.getMessage());

            }
        });
    }

    private void showData(List<News> news) {
        this.list.addAll(news);
        adapter.notifyDataSetChanged();
    }

    public void onBack(View view) {
        finish();
    }
}
