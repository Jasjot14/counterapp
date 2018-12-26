package com.example.jasjo.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import java.util.Date;

import static com.example.jasjo.demo.R.id.textView;

public class demo extends AppCompatActivity {
TextView texttitle;
    int counter = 0;
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        texttitle = findViewById(textView);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        /*button1.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);*/
    }
    public void clickhandler(View view){
        /*Date date=new Date();
        String message = "Welcome /n Its: "+date;
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        texttitle.setText(message);*/
        if (view == button1){
            counter++;
            texttitle.setText(Integer.toString(counter));



    }
        if (view == button2) {
            counter--;
            texttitle.setText(Integer.toString(counter));
        }
    }}

