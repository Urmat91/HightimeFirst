//package com.urmat.hightime;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.util.Log;
//import android.view.View;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//public class TestActivity extends AppCompatActivity {
//
//    TestAdapter adapter;
//    ArrayList<Test> list = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        setTheme(R.style.AppTheme2);
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_test);
//
//        RecyclerView recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        adapter = new TestAdapter(list);
//        recyclerView.setAdapter(adapter);
////        getAlbums();
//        adapter.notifyDataSetChanged();
//
//    }
//
////    private void getAlbums() {
////        App.getApi().getTest().enqueue(new Callback<List<Test>>() {
////
////            @Override
////            public void onResponse(Call<List<Test>> call, Response<List<Test>> response) {
////                Log.e("TAG", "response: " + response.code());
////                List<Test> tests = response.body();
////                if (tests !=  null) {
////                    showData(tests);
////                }
////            }
////
////            @Override
////            public void onFailure(Call<List<Test>> call, Throwable t) {
////                Log.e("TAG", "onFailure: " + t.getMessage());
////
////            }
////        });
////    }
////
////    private void showData(List<Test> albums) {
////        this.list.addAll(albums);
////        adapter.notifyDataSetChanged();
////    }
//
//    public void onBack(View view) {
//        finish();
//    }
//}
