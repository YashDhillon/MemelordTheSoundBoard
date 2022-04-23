package com.adara.yash.memelordthesoundboard;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {


    FloatingActionButton fb1,fb2,fb3,fb4;
    Animation anim1,anim2,anim3,anim4;
    Button b1,b2,b3,b4,b5,b6;

    Boolean isOpen = false;

    String file = "DataBaseCreation";

    Boolean isInitialized = false;

    SoundClipsDataBase sdb;

    String TUTFILE = "tutorialFile";

    int status = 0 ;

    AdView mAdView;

    private InterstitialAd adFull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*if(checkpermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)){}
        else
        {
            ActivityCompat.requestPermissions(MainActivity.this,new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE},007);
        }*/

        try{
            FileInputStream fis = openFileInput(TUTFILE);
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

        if(status == 0)
        {
            Intent i = new Intent(this,Main9Activity.class);
            startActivity(i);
            try{
                FileOutputStream fos = openFileOutput(TUTFILE,MODE_PRIVATE);
                fos.write("1".getBytes());
                fos.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        adFull = new InterstitialAd(this);
        adFull.setAdUnitId("ca-app-pub-9804648583897414/3834853794");
        adFull.loadAd(new AdRequest.Builder().build());

        sdb = new SoundClipsDataBase(this);

        sdb.creat_DB_public();

        fb1 = (FloatingActionButton)findViewById(R.id.fab_home);
        fb2 = (FloatingActionButton)findViewById(R.id.fab_fav);
        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(i);
            }
        });
        fb3 = (FloatingActionButton)findViewById(R.id.fab_cat);
        fb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        fb4 = (FloatingActionButton)findViewById(R.id.fab_stop);
        fb2.setVisibility(View.INVISIBLE);
        fb2.setClickable(false);
        fb3.setVisibility(View.INVISIBLE);
        fb3.setClickable(false);
        fb4.setVisibility(View.INVISIBLE);
        fb4.setClickable(false);
        anim1 = AnimationUtils.loadAnimation(this,R.anim.fba_open);
        anim2 = AnimationUtils.loadAnimation(this,R.anim.fba_close);
        anim3 = AnimationUtils.loadAnimation(this,R.anim.rotate_open);
        anim4 = AnimationUtils.loadAnimation(this,R.anim.rotate_close);

        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);


        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isOpen == false)
                {
                    fb2.startAnimation(anim1);
                    fb3.startAnimation(anim1);
                    fb4.startAnimation(anim1);
                    fb1.startAnimation(anim3);
                    fb2.setClickable(true);
                    fb3.setClickable(true);
                    fb4.setClickable(true);
                    isOpen = true;
                }
                else if(isOpen == true)
                {
                    fb2.startAnimation(anim2);
                    fb3.startAnimation(anim2);
                    fb4.startAnimation(anim2);
                    fb1.startAnimation(anim4);
                    fb2.setClickable(false);
                    fb3.setClickable(false);
                    fb4.setClickable(false);
                    isOpen = false;
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(i);

                int  flip = (int) Math.round(Math.random() * 10);
                if(flip == 1 || flip == 4 || flip == 7){
                    adFull.show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);

                int  flip = (int) Math.round(Math.random() * 10);
                if(flip == 1 || flip == 4 || flip == 7){
                    adFull.show();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(i);

                int  flip = (int) Math.round(Math.random() * 10);
                if(flip == 1 || flip == 4 || flip == 7){
                    adFull.show();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main5Activity.class);
                startActivity(i);

                int  flip = (int) Math.round(Math.random() * 10);
                if(flip == 1 || flip == 4 || flip == 7){
                    adFull.show();
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main7Activity.class);
                startActivity(i);

                int  flip = (int) Math.round(Math.random() * 10);
                if(flip == 1 || flip == 4 || flip == 7){
                    adFull.show();
                }

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main6Activity.class);
                startActivity(i);

                int  flip = (int) Math.round(Math.random() * 10);
                if(flip == 1 || flip == 4 || flip == 7){
                    adFull.show();
                }
            }
        });

        mAdView = (AdView)findViewById(R.id.adView);
        MobileAds.initialize(this,"ca-app-pub-9804648583897414~8081344279");
        final AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    /*public boolean checkpermission(String permission)
    {
        int check = ContextCompat.checkSelfPermission(MainActivity.this,permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == 007 && permissions.length>0)
        {
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
            }
        }
    }*/


}
