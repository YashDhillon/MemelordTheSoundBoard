package com.adara.yash.memelordthesoundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Main7Activity extends AppCompatActivity {

    ListView lv;

    FloatingActionButton fb1,fb2,fb3,fb4;
    Animation anim1,anim2,anim3,anim4;
    Boolean isOpen = false;

    SoundClipsDataBase sdb;
    MediaPlayer mp;

    AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        sdb = new SoundClipsDataBase(this);

        String[] SESC = new String[sdb.getArrayTable5().size()];
        SESC = sdb.getArrayTable5().toArray(SESC);

        String[] SESC_UID = new String[sdb.getArrayTable5UID().size()];
        SESC_UID = sdb.getArrayTable5UID().toArray(SESC_UID);

        Integer[] SESC_FAV_STATUS = new Integer[sdb.getArrayTable5FAVSTAT().size()];
        SESC_FAV_STATUS = sdb.getArrayTable5FAVSTAT().toArray(SESC_FAV_STATUS);

        lv = (ListView)findViewById(R.id.lv);

        MyAdapter ma = new MyAdapter(this,SESC,SESC_UID,SESC_FAV_STATUS);

        lv.setAdapter(ma);

        /*registerForContextMenu(lv);
        lv.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                if (view.getId() == R.id.lv) {
                    AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
                    int position = info.position;
                    contextMenu.setHeaderTitle("What do you wanna do ??");
                    contextMenu.add("Add to favourites");
                    contextMenu.add("Remove from favourites");
                    //contextMenu.add("Set as ringtone");
                    //contextMenu.add("Save sound clip");
                    contextMenu.add("Ad-free version features");
                }
            }
        });*/

        final int color1 = this.getResources().getColor(R.color.Fav_colour);
        final int color2 = this.getResources().getColor(R.color.White_colour);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tv1 = (TextView)view.findViewById(R.id.textView2);
                TextView tv2 = (TextView)view.findViewById(R.id.textView3);
                TextView tv3 = (TextView)view.findViewById(R.id.textView4);
                final String UID = tv2.getText().toString();
                final String SCN = tv1.getText().toString();
                final String FAV_STAT = tv3.getText().toString();

                if(UID.equals("SESC000"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.badumtss);
                    mp.start();
                }
                else if(UID.equals("SESC001"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.ballistaslowmo);
                    mp.start();
                }
                else if(UID.equals("SESC002"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.barrett50calslowmo);
                    mp.start();
                }
                else if(UID.equals("SESC003"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.barrett50cal);
                    mp.start();
                }
                else if(UID.equals("SESC004"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.boomswoosh);
                    mp.start();
                }
                else if(UID.equals("SESC005"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.boom);
                    mp.start();
                }
                else if(UID.equals("SESC006"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.buzzerorwronganswer);
                    mp.start();
                }else if(UID.equals("SESC007"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.camerashutter);
                    mp.start();
                }
                else if(UID.equals("SESC008"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.camerashutter2);
                    mp.start();
                }
                else if(UID.equals("SESC009"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.carcrash);
                    mp.start();
                }else if(UID.equals("SESC010"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.carhorn);
                    mp.start();
                }
                else if(UID.equals("SESC011"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.cartoonboing);
                    mp.start();
                }
                else if(UID.equals("SESC012"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.cartoonboing2);
                    mp.start();
                }else if(UID.equals("SESC013"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.cartoonboing3);
                    mp.start();
                }
                else if(UID.equals("SESC014"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.cartoonclock);
                    mp.start();
                }
                else if(UID.equals("SESC015"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.cartoonpop);
                    mp.start();
                }else if(UID.equals("SESC016"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.cartoonricochet);
                    mp.start();
                }
                else if(UID.equals("SESC017"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.cartoonricochet2);
                    mp.start();
                }
                else if(UID.equals("SESC018"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.cartoonspin);
                    mp.start();
                }else if(UID.equals("SESC019"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.cartoontaunt);
                    mp.start();
                }
                else if(UID.equals("SESC020"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.cartoontirescreech);
                    mp.start();
                }
                else if(UID.equals("SESC021"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.cartoontransition);
                    mp.start();
                }else if(UID.equals("SESC022"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.censorbeep);
                    mp.start();
                }
                else if(UID.equals("SESC023"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.swooshdramatic);
                    mp.start();
                }
                else if(UID.equals("SESC024"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.denied);
                    mp.start();
                }else if(UID.equals("SESC025"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.drumroll);
                    mp.start();
                }
                else if(UID.equals("SESC026"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.dsrslowmo);
                    mp.start();
                }
                else if(UID.equals("SESC027"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.dundundunnn);
                    mp.start();
                }else if(UID.equals("SESC028"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.eatormunch);
                    mp.start();
                }
                else if(UID.equals("SESC029"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.eatormunch2);
                    mp.start();
                }
                else if(UID.equals("SESC030"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.explosion);
                    mp.start();
                }else if(UID.equals("SESC031"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.explosion2);
                    mp.start();
                }
                else if(UID.equals("SESC032"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.fail);
                    mp.start();
                }
                else if(UID.equals("SESC033"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.fail2);
                    mp.start();
                }else if(UID.equals("SESC034"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.falling);
                    mp.start();
                }
                else if(UID.equals("SESC035"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.fasttiptoes);
                    mp.start();
                }
                else if(UID.equals("SESC036"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.monsterkill);
                    mp.start();
                }else if(UID.equals("SESC037"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.inceptionfoghorn);
                    mp.start();
                }
                else if(UID.equals("SESC038"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.kick);
                    mp.start();
                }
                else if(UID.equals("SESC039"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.lightsaber);
                    mp.start();
                }else if(UID.equals("SESC040"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.lightsaber2);
                    mp.start();
                }
                else if(UID.equals("SESC041"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.m40a3);
                    mp.start();
                }
                else if(UID.equals("SESC042"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.mariojump);
                    mp.start();
                }else if(UID.equals("SESC043"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.mgsalert);
                    mp.start();
                }
                else if(UID.equals("SESC044"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.mlghorns);
                    mp.start();
                }
                else if(UID.equals("SESC045"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.punch);
                    mp.start();
                }
                else if(UID.equals("SESC046"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.punch2);
                    mp.start();
                }
                else if(UID.equals("SESC047"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.punch3);
                    mp.start();
                }
                else if(UID.equals("SESC048"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.punch4);
                    mp.start();
                }else if(UID.equals("SESC049"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.recordrewind);
                    mp.start();
                }
                else if(UID.equals("SESC050"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.recordscratch);
                    mp.start();
                }
                else if(UID.equals("SESC051"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.recordscratch2);
                    mp.start();
                }else if(UID.equals("SESC052"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.reloading);
                    mp.start();
                }
                else if(UID.equals("SESC053"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.rubberduck);
                    mp.start();
                }
                else if(UID.equals("SESC054"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.rubberduck2);
                    mp.start();
                }
                else if(UID.equals("SESC055"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.scramblingfredflintstone);
                    mp.start();
                }
                else if(UID.equals("SESC056"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.slideup);
                    mp.start();
                }
                else if(UID.equals("SESC057"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.slip);
                    mp.start();
                }
                else if(UID.equals("SESC058"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.splat);
                    mp.start();
                }
                else if(UID.equals("SESC059"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.suddensuspense);
                    mp.start();
                }else if(UID.equals("SESC060"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.suspensesudden);
                    mp.start();
                }
                else if(UID.equals("SESC061"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.suspensesudden2);
                    mp.start();
                }
                else if(UID.equals("SESC062"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.suspense1);
                    mp.start();
                }
                else if(UID.equals("SESC063"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.suspense2);
                    mp.start();
                }
                else if(UID.equals("SESC064"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.suspense3);
                    mp.start();
                }
                else if(UID.equals("SESC065"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.suspense4);
                    mp.start();
                }
                else if(UID.equals("SESC066"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.swoosh);
                    mp.start();
                }
                else if(UID.equals("SESC067"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.swoosh2);
                    mp.start();
                }
                else if(UID.equals("SESC068"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.swoosh3);
                    mp.start();
                }
                else if(UID.equals("SESC069"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.swoosh4);
                    mp.start();
                }else if(UID.equals("SESC070"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.swoosh5);
                    mp.start();
                }
                else if(UID.equals("SESC071"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.throwingknifehitmarker);
                    mp.start();
                }
                else if(UID.equals("SESC072"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.throwing);
                    mp.start();
                }
                else if(UID.equals("SESC073"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.tiptoecartoonxylophone);
                    mp.start();
                }
                else if(UID.equals("SESC074"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.tomahawkhitmarker);
                    mp.start();
                }
                else if(UID.equals("SESC075"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.tvstatic);
                    mp.start();
                }
                else if(UID.equals("SESC076"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main7Activity.this,R.raw.vinegunshotakaboom);
                    mp.start();
                }
            }
        });

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                int p = 0;
                TextView tv1 = (TextView)view.findViewById(R.id.textView2);
                TextView tv2 = (TextView)view.findViewById(R.id.textView3);
                TextView tv3 = (TextView)view.findViewById(R.id.textView4);
                final String UID = tv2.getText().toString();
                final String SCN = tv1.getText().toString();
                final String FAV_STAT = tv3.getText().toString();

                TextView tva =(TextView) view.findViewById(R.id.textView2);
                tva.setTextColor(color1);
                sdb.updateDataTable5(UID,SCN,1);
                Toast.makeText(Main7Activity.this, "Added \"" + SCN + "\" to favourites", Toast.LENGTH_SHORT).show();
                return false;
            }
        });


        fb1 = (FloatingActionButton)findViewById(R.id.fab_home);
        fb2 = (FloatingActionButton)findViewById(R.id.fab_fav);
        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main7Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });
        fb3 = (FloatingActionButton)findViewById(R.id.fab_cat);
        fb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main7Activity.this,MainActivity.class);
                startActivity(i);
            }
        });
        fb4 = (FloatingActionButton)findViewById(R.id.fab_stop);
        fb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
            }
        });

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

        mAdView = (AdView)findViewById(R.id.adView6);
        final AdRequest adRequest = new AdRequest.Builder().build();
        MobileAds.initialize(this,"ca-app-pub-9804648583897414~8081344279");
        mAdView.loadAd(adRequest);

    }

    /*@Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        int position = info.position;

        final int color1 = this.getResources().getColor(R.color.Fav_colour);
        final int color2 = this.getResources().getColor(R.color.White_colour);

        View view  = lv.getChildAt(position);
        TextView tv1 = (TextView)view.findViewById(R.id.textView2);
        TextView tv2 = (TextView)view.findViewById(R.id.textView3);
        TextView tv3 = (TextView)view.findViewById(R.id.textView4);
        final String UID = tv2.getText().toString();
        final String SCN = tv1.getText().toString();
        final String FAV_STAT = tv3.getText().toString();

        int id =0;
        if(UID.equals("SESC000"))
        {
            id = R.raw.badumtss;
        }
        else if(UID.equals("SESC001"))
        {
            id = R.raw.ballistaslowmo;
        }
        else if(UID.equals("SESC002"))
        {
            id = R.raw.barrett50calslowmo;
        }
        else if(UID.equals("SESC003"))
        {
            id = R.raw.barrett50cal;
        }
        else if(UID.equals("SESC004"))
        {
            id = R.raw.boomswoosh;
        }
        else if(UID.equals("SESC005"))
        {
            id = R.raw.boom;
        }
        else if(UID.equals("SESC006"))
        {
            id = R.raw.buzzerorwronganswer;
        }
        else if(UID.equals("SESC007"))
        {
            id = R.raw.camerashutter;
        }
        else if(UID.equals("SESC008"))
        {
            id = R.raw.camerashutter2;
        }
        else if(UID.equals("SESC009"))
        {
            id = R.raw.carcrash;
        }
        else if(UID.equals("SESC010"))
        {
            id = R.raw.carhorn;
        }
        else if(UID.equals("SESC011"))
        {
            id = R.raw.cartoonboing;
        }
        else if(UID.equals("SESC012"))
        {
            id = R.raw.cartoonboing2;
        }
        else if(UID.equals("SESC013"))
        {
            id = R.raw.cartoonboing3;
        }
        else if(UID.equals("SESC014"))
        {
            id = R.raw.cartoonclock;
        }
        else if(UID.equals("SESC015"))
        {
            id = R.raw.cartoonpop;
        }
        else if(UID.equals("SESC016"))
        {
            id = R.raw.cartoonricochet;
        }
        else if(UID.equals("SESC017"))
        {
            id = R.raw.cartoonricochet2;
        }
        else if(UID.equals("SESC018"))
        {
            id = R.raw.cartoonspin;
        }
        else if(UID.equals("SESC019"))
        {
            id = R.raw.cartoontaunt;
        }
        else if(UID.equals("SESC020"))
        {
            id = R.raw.cartoontirescreech;
        }
        else if(UID.equals("SESC021"))
        {
            id = R.raw.cartoontransition;
        }
        else if(UID.equals("SESC022"))
        {
            id = R.raw.censorbeep;
        }
        else if(UID.equals("SESC023"))
        {
            id = R.raw.swooshdramatic;
        }
        else if(UID.equals("SESC024"))
        {
            id = R.raw.denied;
        }
        else if(UID.equals("SESC025"))
        {
            id = R.raw.drumroll;
        }
        else if(UID.equals("SESC026"))
        {
            id = R.raw.dsrslowmo;
        }
        else if(UID.equals("SESC027"))
        {
            id = R.raw.dundundunnn;
        }
        else if(UID.equals("SESC028"))
        {
            id = R.raw.eatormunch;
        }
        else if(UID.equals("SESC029"))
        {
            id = R.raw.eatormunch2;
        }
        else if(UID.equals("SESC030"))
        {
            id = R.raw.explosion;
        }
        else if(UID.equals("SESC031"))
        {
            id = R.raw.explosion2;
        }
        else if(UID.equals("SESC032"))
        {
            id = R.raw.fail;
        }
        else if(UID.equals("SESC033"))
        {
            id = R.raw.fail2;
        }
        else if(UID.equals("SESC034"))
        {
            id = R.raw.falling;
        }
        else if(UID.equals("SESC035"))
        {
            id = R.raw.fasttiptoes;
        }
        else if(UID.equals("SESC036"))
        {
            id = R.raw.monsterkill;
        }
        else if(UID.equals("SESC037"))
        {
            id = R.raw.inceptionfoghorn;
        }
        else if(UID.equals("SESC038"))
        {
            id = R.raw.kick;
        }
        else if(UID.equals("SESC039"))
        {
            id = R.raw.lightsaber;
        }
        else if(UID.equals("SESC040"))
        {
            id = R.raw.lightsaber2;
        }
        else if(UID.equals("SESC041"))
        {
            id = R.raw.m40a3;
        }
        else if(UID.equals("SESC042"))
        {
            id = R.raw.mariojump;
        }
        else if(UID.equals("SESC043"))
        {
            id = R.raw.mgsalert;
        }
        else if(UID.equals("SESC044"))
        {
            id = R.raw.mlghorns;
        }
        else if(UID.equals("SESC045"))
        {
            id = R.raw.punch;
        }
        else if(UID.equals("SESC046"))
        {
            id = R.raw.punch2;
        }
        else if(UID.equals("SESC047"))
        {
            id = R.raw.punch3;
        }
        else if(UID.equals("SESC048"))
        {
            id = R.raw.punch4;
        }
        else if(UID.equals("SESC049"))
        {
            id = R.raw.recordrewind;
        }
        else if(UID.equals("SESC050"))
        {
            id = R.raw.recordscratch;
        }
        else if(UID.equals("SESC051"))
        {
            id = R.raw.recordscratch2;
        }
        else if(UID.equals("SESC052"))
        {
            id = R.raw.reloading;
        }
        else if(UID.equals("SESC053"))
        {
            id = R.raw.rubberduck;
        }
        else if(UID.equals("SESC054"))
        {
            id = R.raw.rubberduck2;
        }
        else if(UID.equals("SESC055"))
        {
            id = R.raw.scramblingfredflintstone;
        }
        else if(UID.equals("SESC056"))
        {
            id = R.raw.slideup;
        }
        else if(UID.equals("SESC057"))
        {
            id = R.raw.slip;
        }
        else if(UID.equals("SESC058"))
        {
            id = R.raw.splat;
        }
        else if(UID.equals("SESC059"))
        {
            id = R.raw.suddensuspense;
        }
        else if(UID.equals("SESC060"))
        {
            id = R.raw.suspensesudden;
        }
        else if(UID.equals("SESC061"))
        {
            id = R.raw.suspensesudden2;
        }
        else if(UID.equals("SESC062"))
        {
            id = R.raw.suspense1;
        }
        else if(UID.equals("SESC063"))
        {
            id = R.raw.suspense2;
        }
        else if(UID.equals("SESC064"))
        {
            id = R.raw.suspense3;
        }
        else if(UID.equals("SESC065"))
        {
            id = R.raw.suspense4;
        }
        else if(UID.equals("SESC066"))
        {
            id = R.raw.swoosh;
        }
        else if(UID.equals("SESC067"))
        {
            id = R.raw.swoosh2;
        }
        else if(UID.equals("SESC068"))
        {
            id = R.raw.swoosh3;
        }
        else if(UID.equals("SESC069"))
        {
            id = R.raw.swoosh4;
        }
        else if(UID.equals("SESC070"))
        {
            id = R.raw.swoosh5;
        }
        else if(UID.equals("SESC071"))
        {
            id = R.raw.throwingknifehitmarker;
        }
        else if(UID.equals("SESC072"))
        {
            id = R.raw.throwing;
        }
        else if(UID.equals("SESC073"))
        {
            id = R.raw.tiptoecartoonxylophone;
        }
        else if(UID.equals("SESC074"))
        {
            id = R.raw.tomahawkhitmarker;
        }
        else if(UID.equals("SESC075"))
        {
            id = R.raw.tvstatic;
        }
        else if(UID.equals("SESC076"))
        {
           id = R.raw.vinegunshotakaboom;
        }

        switch (item.getTitle().toString()) {
            case "Add to favourites":
                TextView tva =(TextView) view.findViewById(R.id.textView2);
                tva.setTextColor(color1);
                sdb.updateDataTable5(UID,SCN,1);
                Toast.makeText(this, "Added \"" + SCN + "\" to favourites", Toast.LENGTH_SHORT).show();
                break;
            case "Remove from favourites":
                TextView tvb =(TextView) view.findViewById(R.id.textView2);
                tvb.setTextColor(color2);
                sdb.updateDataTable5(UID,SCN,0);
                Toast.makeText(this, "Removed \"" + SCN + "\" from favourites", Toast.LENGTH_SHORT).show();
                break;
            case "Ad-free version features":
                Intent i = new Intent(Main7Activity.this,Main14Activity.class);
                startActivity(i);
                break;
            /*case "Set as ringtone":
                Toast.makeText(this, "Ringtone set as \"" + SCN +"\"",Toast.LENGTH_SHORT).show();
                break;
            case "Save sound clip":
                String path = Environment.getExternalStorageDirectory() + "/MemeLordSoundClips";
                try{
                    File dir = new File(path);
                    if(dir.mkdirs()|| dir.isDirectory())
                    {
                        String str_song_name = SCN + ".mp3";
                        CopyFromRawToSDorPhomMem(path + File.separator + str_song_name,id);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                Toast.makeText(this, "Sound clip \"" + SCN + "\" saved",Toast.LENGTH_SHORT).show();
                break;*/
       // }
       // return super.onContextItemSelected(item);
    // }

    /*public void CopyFromRawToSDorPhomMem(String path,int id)
    {
        InputStream in = null;
        OutputStream out = null;
        boolean stat = false;
        try{
            in = getResources().openRawResource(id);
            out = new FileOutputStream(path);
            byte[] buff = new byte[1024];
            int read = 0;
            while((read = in.read(buff))>0)
            {
                out.write(buff,0,read);
            }
            stat = true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            if(in != null)
            {
                try{
                    in.close();
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

            if(out != null)
            {
                try{
                    out.close();
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

            if(stat == true){
                Toast.makeText(this, "Sound clip saved! ", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Sound clip could not be saved!", Toast.LENGTH_SHORT).show();
            }
        }
    }*/

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mp != null)
        {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
