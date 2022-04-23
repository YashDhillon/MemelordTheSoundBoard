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

public class Main4Activity extends AppCompatActivity {

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
        setContentView(R.layout.activity_main4);

        sdb = new SoundClipsDataBase(this);

        lv = (ListView)findViewById(R.id.lv);

        String[] HSC = new String[sdb.getArrayTable2().size()];
        HSC = sdb.getArrayTable2().toArray(HSC);

        String[] HSC_UID = new String[sdb.getArrayTable2UID().size()];
        HSC_UID = sdb.getArrayTable2UID().toArray(HSC_UID);

        Integer[] HSC_FAV_STATUS = new Integer[sdb.getArrayTable2FAVSTAT().size()];
        HSC_FAV_STATUS = sdb.getArrayTable2FAVSTAT().toArray(HSC_FAV_STATUS);

        MyAdapter ma = new MyAdapter(this,HSC,HSC_UID,HSC_FAV_STATUS);
        lv.setAdapter(ma);

        final int color1 = this.getResources().getColor(R.color.Fav_colour);
        final int color2 = this.getResources().getColor(R.color.White_colour);

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


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tv1 = (TextView)view.findViewById(R.id.textView2);
                TextView tv2 = (TextView)view.findViewById(R.id.textView3);
                TextView tv3 = (TextView)view.findViewById(R.id.textView4);
                final String UID = tv2.getText().toString();
                final String SCN = tv1.getText().toString();
                final String FAV_STAT = tv3.getText().toString();

                if(UID.equals("HSC000"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.aintnobodygottimeforthat);
                    mp.start();
                }
                else if(UID.equals("HSC001"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.arnoldillbeback);
                    mp.start();
                }
                else if(UID.equals("HSC002"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.aww);
                    mp.start();
                }
                else if(UID.equals("HSC003"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.byehaveagreattime);
                    mp.start();
                }
                else if(UID.equals("HSC004"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.cartoonlaugh);
                    mp.start();
                }
                else if(UID.equals("HSC005"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.codterrioristshouting);
                    mp.start();
                }
                else if(UID.equals("HSC006"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.codzombieskaboom);
                    mp.start();
                }else if(UID.equals("HSC007"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.crowdcheering);
                    mp.start();
                }
                else if(UID.equals("HSC008"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.denied);
                    mp.start();
                }
                else if(UID.equals("HSC009"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.derpyell);
                    mp.start();
                }else if(UID.equals("HSC010"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.doh);
                    mp.start();
                }
                else if(UID.equals("HSC011"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.doh2);
                    mp.start();
                }
                else if(UID.equals("HSC012"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.drzoidbergwoop);
                    mp.start();
                }else if(UID.equals("HSC013"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.everybodyputyourhandsintheair);
                    mp.start();
                }
                else if(UID.equals("HSC014"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.evillaugh);
                    mp.start();
                }
                else if(UID.equals("HSC015"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.fragout);
                    mp.start();
                }else if(UID.equals("HSC016"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.fusrodah);
                    mp.start();
                }
                else if(UID.equals("HSC017"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.getnoscoped);
                    mp.start();
                }
                else if(UID.equals("HSC018"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.getoverhere);
                    mp.start();
                }else if(UID.equals("HSC019"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.gibberish);
                    mp.start();
                }
                else if(UID.equals("HSC020"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.hagay);
                    mp.start();
                }
                else if(UID.equals("HSC021"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.hagotemm);
                    mp.start();
                }else if(UID.equals("HSC022"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.hahanelson);
                    mp.start();
                }
                else if(UID.equals("HSC023"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.heartbeat);
                    mp.start();
                }
                else if(UID.equals("HSC024"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.hellocutiepie);
                    mp.start();
                }else if(UID.equals("HSC025"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.igottabadfeelingaboutthishansolo);
                    mp.start();
                }
                else if(UID.equals("HSC026"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.killshot);
                    mp.start();
                }
                else if(UID.equals("HSC027"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.kobe);
                    mp.start();
                }else if(UID.equals("HSC028"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.lookatthisdudelaugh);
                    mp.start();
                }
                else if(UID.equals("HSC029"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.marioherewego);
                    mp.start();
                }
                else if(UID.equals("HSC030"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.nope);
                    mp.start();
                }else if(UID.equals("HSC031"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.ohhellno);
                    mp.start();
                }
                else if(UID.equals("HSC032"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.omgwhothehellcares);
                    mp.start();
                }
                else if(UID.equals("HSC033"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.quad);
                    mp.start();
                }else if(UID.equals("HSC034"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.saywhat);
                    mp.start();
                }
                else if(UID.equals("HSC035"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.scream);
                    mp.start();
                }
                else if(UID.equals("HSC036"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.spongebobtimecardsafewincheslater);
                    mp.start();
                }else if(UID.equals("HSC037"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.spongebobtimecardsafewmomentslater);
                    mp.start();
                }
                else if(UID.equals("HSC038"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.spongebobtimecardseventually);
                    mp.start();
                }
                else if(UID.equals("HSC039"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.spongebobtimecardsmeanwhile);
                    mp.start();
                }else if(UID.equals("HSC040"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.spongebobtimecardsoneeternitylater);
                    mp.start();
                }
                else if(UID.equals("HSC041"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.spongebobtimecardsuhh);
                    mp.start();
                }
                else if(UID.equals("HSC042"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.superhotfireooohhh);
                    mp.start();
                }else if(UID.equals("HSC043"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.tangodown);
                    mp.start();
                }
                else if(UID.equals("HSC044"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.targetneutralized);
                    mp.start();
                }
                else if(UID.equals("HSC045"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.theyaskyouhowyouare);
                    mp.start();
                }
                else if(UID.equals("HSC046"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.toinfinityandbeyond);
                    mp.start();
                }
                else if(UID.equals("HSC047"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.toasty);
                    mp.start();
                }
                else if(UID.equals("HSC048"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.whatajokerlaugh);
                    mp.start();
                }else if(UID.equals("HSC049"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.yay);
                    mp.start();
                }
                else if(UID.equals("HSC050"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.yousuckyoujackass);
                    mp.start();
                }
                else if(UID.equals("HSC051"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.yousuck);
                    mp.start();
                }else if(UID.equals("HSC052"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.yourethelastonecompletethemission);
                    mp.start();
                }
                else if(UID.equals("HSC053"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.zachgalifianakislaugh);
                    mp.start();
                }
                else if(UID.equals("HSC054"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this,R.raw.heywhathappened);
                    mp.start();
                }
                else if(UID.equals("HSC055")) {
                    if (mp != null) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main4Activity.this, R.raw.monsterkill);
                    mp.start();
                }
            }
        });


        fb1 = (FloatingActionButton)findViewById(R.id.fab_home);
        fb2 = (FloatingActionButton)findViewById(R.id.fab_fav);
        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main4Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });
        fb3 = (FloatingActionButton)findViewById(R.id.fab_cat);
        fb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main4Activity.this,MainActivity.class);
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

                /*TextView tva =(TextView) view.findViewById(R.id.textView2);
                tva.setTextColor(color1);
                sdb.updateDataTable1(UID,SCN,1);
                Toast.makeText(Main4Activity.this, "Added to favourites!", Toast.LENGTH_SHORT).show();*/

                TextView tva =(TextView) view.findViewById(R.id.textView2);
                tva.setTextColor(color1);
                sdb.updateDataTable2(UID,SCN,1);
                Toast.makeText(Main4Activity.this, "Added \"" + SCN + "\" to favourites", Toast.LENGTH_SHORT).show();

                return false;
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

        mAdView = (AdView)findViewById(R.id.adView3);
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

        int id = 0;

        if(UID.equals("HSC000"))
        {
            id =R.raw.aintnobodygottimeforthat;
        }
        else if(UID.equals("HSC001"))
        {
            id =R.raw.arnoldillbeback;
        }
        else if(UID.equals("HSC002"))
        {
            id =R.raw.aww;
        }
        else if(UID.equals("HSC003"))
        {
            id =R.raw.byehaveagreattime;
        }
        else if(UID.equals("HSC004"))
        {
            id =R.raw.cartoonlaugh;
        }
        else if(UID.equals("HSC005"))
        {
            id =R.raw.codterrioristshouting;
        }
        else if(UID.equals("HSC006"))
        {
            id =R.raw.codzombieskaboom;
        }
        else if(UID.equals("HSC007"))
        {
            id =R.raw.crowdcheering;
        }
        else if(UID.equals("HSC008"))
        {
            id =R.raw.denied;
        }
        else if(UID.equals("HSC009"))
        {
            id =R.raw.derpyell;
        }
        else if(UID.equals("HSC010"))
        {
            id =R.raw.doh;
        }
        else if(UID.equals("HSC011"))
        {
            id =R.raw.doh2;
        }
        else if(UID.equals("HSC012"))
        {
            id =R.raw.drzoidbergwoop;
        }
        else if(UID.equals("HSC013"))
        {
            id =R.raw.everybodyputyourhandsintheair;
        }
        else if(UID.equals("HSC014"))
        {
            id =R.raw.evillaugh;
        }
        else if(UID.equals("HSC015"))
        {
            id =R.raw.fragout;
        }
        else if(UID.equals("HSC016"))
        {
            id =R.raw.fusrodah;
        }
        else if(UID.equals("HSC017"))
        {
            id =R.raw.getnoscoped;
        }
        else if(UID.equals("HSC018"))
        {
            id =R.raw.getoverhere;
        }
        else if(UID.equals("HSC019"))
        {
            id =R.raw.gibberish;
        }
        else if(UID.equals("HSC020"))
        {
            id =R.raw.hagay;
        }
        else if(UID.equals("HSC021"))
        {
            id =R.raw.hagotemm;
        }
        else if(UID.equals("HSC022"))
        {
            id =R.raw.hahanelson;
        }
        else if(UID.equals("HSC023"))
        {
            id =R.raw.heartbeat;
        }
        else if(UID.equals("HSC024"))
        {
            id =R.raw.hellocutiepie;
        }
        else if(UID.equals("HSC025"))
        {
            id =R.raw.igottabadfeelingaboutthishansolo;
        }
        else if(UID.equals("HSC026"))
        {
            id =R.raw.killshot;
        }
        else if(UID.equals("HSC027"))
        {
            id =R.raw.kobe;
        }
        else if(UID.equals("HSC028"))
        {
            id =R.raw.lookatthisdudelaugh;
        }
        else if(UID.equals("HSC029"))
        {
            id =R.raw.marioherewego;
        }
        else if(UID.equals("HSC030"))
        {
            id =R.raw.nope;
        }
        else if(UID.equals("HSC031"))
        {
            id =R.raw.ohhellno;
        }
        else if(UID.equals("HSC032"))
        {
            id =R.raw.omgwhothehellcares;
        }
        else if(UID.equals("HSC033"))
        {
            id =R.raw.quad;
        }
        else if(UID.equals("HSC034"))
        {
            id =R.raw.saywhat;
        }
        else if(UID.equals("HSC035"))
        {
            id =R.raw.scream;
        }
        else if(UID.equals("HSC036"))
        {
            id =R.raw.spongebobtimecardsafewincheslater;
        }
        else if(UID.equals("HSC037"))
        {
            id =R.raw.spongebobtimecardsafewmomentslater;
        }
        else if(UID.equals("HSC038"))
        {
            id =R.raw.spongebobtimecardseventually;
        }
        else if(UID.equals("HSC039"))
        {
            id =R.raw.spongebobtimecardsmeanwhile;
        }
        else if(UID.equals("HSC040"))
        {
            id =R.raw.spongebobtimecardsoneeternitylater;
        }
        else if(UID.equals("HSC041"))
        {
            id =R.raw.spongebobtimecardsuhh;
        }
        else if(UID.equals("HSC042"))
        {
            id =R.raw.superhotfireooohhh;
        }
        else if(UID.equals("HSC043"))
        {
            id =R.raw.tangodown;
        }
        else if(UID.equals("HSC044"))
        {
            id =R.raw.targetneutralized;
        }
        else if(UID.equals("HSC045"))
        {
            id =R.raw.theyaskyouhowyouare;
        }
        else if(UID.equals("HSC046"))
        {
            id =R.raw.toinfinityandbeyond;
        }
        else if(UID.equals("HSC047"))
        {
            id =R.raw.toasty;
        }
        else if(UID.equals("HSC048"))
        {
            id =R.raw.whatajokerlaugh;
        }
        else if(UID.equals("HSC049"))
        {
            id =R.raw.yay;
        }
        else if(UID.equals("HSC050"))
        {
            id =R.raw.yousuckyoujackass;
        }
        else if(UID.equals("HSC051"))
        {
            id =R.raw.yousuck;
        }
        else if(UID.equals("HSC052"))
        {
            id =R.raw.yourethelastonecompletethemission;
        }
        else if(UID.equals("HSC053"))
        {
            id =R.raw.zachgalifianakislaugh;
        }
        else if(UID.equals("HSC054"))
        {
            id =R.raw.heywhathappened;
        }
        else if(UID.equals("HSC055"))
        {
            id =R.raw.monsterkill;
        }


        switch (item.getTitle().toString()) {
            case "Add to favourites":
                TextView tva =(TextView) view.findViewById(R.id.textView2);
                tva.setTextColor(color1);
                sdb.updateDataTable2(UID,SCN,1);
                Toast.makeText(this, "Added \"" + SCN + "\" to favourites", Toast.LENGTH_SHORT).show();
                break;
            case "Remove from favourites":
                TextView tvb =(TextView) view.findViewById(R.id.textView2);
                tvb.setTextColor(color2);
                sdb.updateDataTable2(UID,SCN,0);
                Toast.makeText(this, "Removed \"" + SCN + "\" from favourites", Toast.LENGTH_SHORT).show();
                break;
            case "Ad-free version features":
                Intent i = new Intent(Main4Activity.this,Main14Activity.class);
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
        //}
        //return super.onContextItemSelected(item);
    //}

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
