package com.example.sujeet.todo;

/**
 * Created by sujeet on 8/11/16.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static java.security.AccessController.getContext;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {
    private Context context;
    private List<Student> studentList;
    String n,y;
    public StudentAdapter(Context context,List<Student> studentList) {
        this.context=context;
        this.studentList = studentList;
    }

public class MyViewHolder extends RecyclerView.ViewHolder{
    public TextView name, year;

    public MyViewHolder(final View view) {
        super(view);
        name = (TextView) view.findViewById(R.id.name);
        year = (TextView) view.findViewById(R.id.year);



    }


}
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.student_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Student student =studentList.get(position);
        holder.name.setText(student.getname());
        holder.year.setText(student.getyear());
        n=student.getname();
        y=student.getyear();

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}


