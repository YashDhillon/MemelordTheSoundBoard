package com.adara.yash.memelordthesoundboard;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.FileInputStream;

public class Main9Activity extends AppCompatActivity {

    FloatingActionButton fab;
    String TUTFILE1 = "tutorialFile1";

    int status = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        fab =(FloatingActionButton)findViewById(R.id.fab_next1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main9Activity.this,Main10Activity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        try{
            FileInputStream fis = openFileInput(TUTFILE1);
            String temp= "";
            int c;
            while((c = fis.read())!=-1)
            {
                temp = temp + Character.toString((char)c);
            }
            status = Integer.parseInt(temp);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        if(status == 1)
        {
            finish();
        }
    }
}
