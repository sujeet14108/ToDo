package com.example.sujeet.todo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Addrecord extends AppCompatActivity  {

    EditText name,year,des;
    Button save;
    String n,y,d;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addrecord);

        dbHelper = DBHelper.getInstance(getApplicationContext());
        name=(EditText)findViewById(R.id.Name);
        year=(EditText)findViewById(R.id.Year);
        des=(EditText)findViewById(R.id.des);

        save = (Button) findViewById(R.id.save);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student userData = new Student();

                if (!name.getText().toString().isEmpty()) {
                    userData.name = name.getText().toString();
                } else {
                    userData.name = "";
                }
                if (!year.getText().toString().isEmpty()) {
                    userData.year = year.getText().toString();
                } else {
                    userData.year = "";
                }
                if (!des.getText().toString().isEmpty()) {
                    userData.des = des.getText().toString();
                } else {
                    userData.des= "";
                }

System.out.print(userData +"ssss");
                dbHelper.insertUserDetail(userData);
                Intent intent=new Intent(Addrecord.this,MainActivity.class);
                startActivity(intent);
            }
        });
            }
}
