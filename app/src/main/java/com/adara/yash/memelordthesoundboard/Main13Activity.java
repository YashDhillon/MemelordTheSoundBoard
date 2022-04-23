package com.adara.yash.memelordthesoundboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.FileOutputStream;

public class Main13Activity extends AppCompatActivity {
    String TUTFILE1 = "tutorialFile1";
    int status = 0 ;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    FileOutputStream fos = openFileOutput(TUTFILE1, MODE_PRIVATE);
                    fos.write("1".getBytes());
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                finish();
            }
        });

    }
    /*@Override
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
    }*/
}
