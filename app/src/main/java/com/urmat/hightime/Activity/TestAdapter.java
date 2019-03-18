//package com.urmat.hightime;
//
//import android.support.annotation.NonNull;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {
//
//    ArrayList<Test> list;
//
//    public  TestAdapter(ArrayList<Test> list) {
//        this.list = list;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_test, viewGroup, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
//        Test test = list.get(i);
//        viewHolder.textTitle.setText(test.getTitle());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return list.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        TextView textTitle;
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            textTitle = itemView.findViewById(R.id.textTitle);
//        }
//    }
//}
