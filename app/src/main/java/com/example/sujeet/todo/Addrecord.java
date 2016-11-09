package com.example.sujeet.todo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Addrecord extends AppCompatActivity  {

    EditText name,year,des;
    Button save;
    String n,y,d;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addrecord);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
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
                }
                if (!year.getText().toString().isEmpty()) {
                    userData.year = year.getText().toString();
                }
                if (!des.getText().toString().isEmpty()) {
                    userData.des = des.getText().toString();
                }

System.out.print(userData +"ssss");

                Intent intent=new Intent(Addrecord.this,MainActivity.class);
                if (!name.getText().toString().isEmpty()&&!year.getText().toString().isEmpty()&&!des.getText().toString().isEmpty()) {
                    dbHelper.insertUserDetail(userData);
                    startActivity(intent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Fill Empty Details ", Toast.LENGTH_SHORT).show();
            }
        });
            }
}
