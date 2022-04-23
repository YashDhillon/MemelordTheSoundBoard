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

import com.google.android.gms.ads.AdView;

public class Main3Activity extends AppCompatActivity {

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
        setContentView(R.layout.activity_main3);
        sdb = new SoundClipsDataBase(this);
        lv = (ListView)findViewById(R.id.lv);
        String[] SNC = new String[sdb.getFAVNAME().size()];
        SNC = sdb.getFAVNAME().toArray(SNC);

        String[] UID = new String[sdb.getFAVUID().size()];
        UID = sdb.getFAVUID().toArray(UID);

        Integer[] Favint = new Integer[sdb.getFAVSTAT().size()];
        Favint = sdb.getFAVSTAT().toArray(Favint);

        MyAdapter ma =new MyAdapter(this,SNC,UID,Favint);
        lv.setAdapter(ma);

        /*registerForContextMenu(lv);
        lv.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                if (view.getId() == R.id.lv) {
                    AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
                    int position = info.position;
                    contextMenu.setHeaderTitle("What do you wanna do ??");
                    contextMenu.add("Remove from favourites");
                    //contextMenu.add("Set as ringtone");
                    //contextMenu.add("Save sound clip");
                    contextMenu.add("Ad-free version features");

                }
            }
        });*/

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

                if(UID.contains("ASC"))
                {
                    if(UID.equals("ASC000"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cricketschirping);
                        mp.start();
                    }
                    else if(UID.equals("ASC001"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.dolphin);
                        mp.start();
                    }
                    else if(UID.equals("ASC002"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.meepmeep);
                        mp.start();
                    }
                    else if(UID.equals("ASC003"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.snakehissing);
                        mp.start();
                    }
                }
                else if(UID.contains("HSC"))
                {
                    if(UID.equals("HSC000"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.aintnobodygottimeforthat);
                        mp.start();
                    }
                    else if(UID.equals("HSC001"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.arnoldillbeback);
                        mp.start();
                    }
                    else if(UID.equals("HSC002"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.aww);
                        mp.start();
                    }
                    else if(UID.equals("HSC003"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.byehaveagreattime);
                        mp.start();
                    }
                    else if(UID.equals("HSC004"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cartoonlaugh);
                        mp.start();
                    }
                    else if(UID.equals("HSC005"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.codterrioristshouting);
                        mp.start();
                    }
                    else if(UID.equals("HSC006"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.codzombieskaboom);
                        mp.start();
                    }else if(UID.equals("HSC007"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.crowdcheering);
                        mp.start();
                    }
                    else if(UID.equals("HSC008"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.denied);
                        mp.start();
                    }
                    else if(UID.equals("HSC009"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.derpyell);
                        mp.start();
                    }else if(UID.equals("HSC010"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.doh);
                        mp.start();
                    }
                    else if(UID.equals("HSC011"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.doh2);
                        mp.start();
                    }
                    else if(UID.equals("HSC012"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.drzoidbergwoop);
                        mp.start();
                    }else if(UID.equals("HSC013"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.everybodyputyourhandsintheair);
                        mp.start();
                    }
                    else if(UID.equals("HSC014"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.evillaugh);
                        mp.start();
                    }
                    else if(UID.equals("HSC015"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.fragout);
                        mp.start();
                    }else if(UID.equals("HSC016"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.fusrodah);
                        mp.start();
                    }
                    else if(UID.equals("HSC017"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.getnoscoped);
                        mp.start();
                    }
                    else if(UID.equals("HSC018"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.getoverhere);
                        mp.start();
                    }else if(UID.equals("HSC019"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.gibberish);
                        mp.start();
                    }
                    else if(UID.equals("HSC020"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.hagay);
                        mp.start();
                    }
                    else if(UID.equals("HSC021"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.hagotemm);
                        mp.start();
                    }else if(UID.equals("HSC022"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.hahanelson);
                        mp.start();
                    }
                    else if(UID.equals("HSC023"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.heartbeat);
                        mp.start();
                    }
                    else if(UID.equals("HSC024"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.hellocutiepie);
                        mp.start();
                    }else if(UID.equals("HSC025"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.igottabadfeelingaboutthishansolo);
                        mp.start();
                    }
                    else if(UID.equals("HSC026"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.killshot);
                        mp.start();
                    }
                    else if(UID.equals("HSC027"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.kobe);
                        mp.start();
                    }else if(UID.equals("HSC028"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.lookatthisdudelaugh);
                        mp.start();
                    }
                    else if(UID.equals("HSC029"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.marioherewego);
                        mp.start();
                    }
                    else if(UID.equals("HSC030"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.nope);
                        mp.start();
                    }else if(UID.equals("HSC031"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.ohhellno);
                        mp.start();
                    }
                    else if(UID.equals("HSC032"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.omgwhothehellcares);
                        mp.start();
                    }
                    else if(UID.equals("HSC033"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.quad);
                        mp.start();
                    }else if(UID.equals("HSC034"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.saywhat);
                        mp.start();
                    }
                    else if(UID.equals("HSC035"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.scream);
                        mp.start();
                    }
                    else if(UID.equals("HSC036"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.spongebobtimecardsafewincheslater);
                        mp.start();
                    }else if(UID.equals("HSC037"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.spongebobtimecardsafewmomentslater);
                        mp.start();
                    }
                    else if(UID.equals("HSC038"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.spongebobtimecardseventually);
                        mp.start();
                    }
                    else if(UID.equals("HSC039"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.spongebobtimecardsmeanwhile);
                        mp.start();
                    }else if(UID.equals("HSC040"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.spongebobtimecardsoneeternitylater);
                        mp.start();
                    }
                    else if(UID.equals("HSC041"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.spongebobtimecardsuhh);
                        mp.start();
                    }
                    else if(UID.equals("HSC042"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.superhotfireooohhh);
                        mp.start();
                    }else if(UID.equals("HSC043"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.tangodown);
                        mp.start();
                    }
                    else if(UID.equals("HSC044"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.targetneutralized);
                        mp.start();
                    }
                    else if(UID.equals("HSC045"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.theyaskyouhowyouare);
                        mp.start();
                    }
                    else if(UID.equals("HSC046"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.toinfinityandbeyond);
                        mp.start();
                    }
                    else if(UID.equals("HSC047"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.toasty);
                        mp.start();
                    }
                    else if(UID.equals("HSC048"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.whatajokerlaugh);
                        mp.start();
                    }else if(UID.equals("HSC049"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.yay);
                        mp.start();
                    }
                    else if(UID.equals("HSC050"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.yousuckyoujackass);
                        mp.start();
                    }
                    else if(UID.equals("HSC051"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.yousuck);
                        mp.start();
                    }else if(UID.equals("HSC052"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.yourethelastonecompletethemission);
                        mp.start();
                    }
                    else if(UID.equals("HSC053"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.zachgalifianakislaugh);
                        mp.start();
                    }
                    else if(UID.equals("HSC054"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.heywhathappened);
                        mp.start();
                    }
                    else if(UID.equals("HSC055"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.monsterkill);
                        mp.start();
                    }
                }
                else if(UID.contains("MSC"))
                {
                    if(UID.equals("MSC000"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.boxingglovesbyjuliokladniew);
                        mp.start();
                    }
                    else if(UID.equals("MSC001"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.epicchoirsuspense);
                        mp.start();
                    }
                    else if(UID.equals("MSC002"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.failwhawhaversion);
                        mp.start();
                    }
                    else if(UID.equals("MSC003"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.heavenlychoir);
                        mp.start();
                    }
                    else if(UID.equals("MSC004"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.hiddenmasterstheme);
                        mp.start();
                    }
                    else if(UID.equals("MSC005"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.illuminati);
                        mp.start();
                    }
                    else if(UID.equals("MSC006"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.introsoundeffect);
                        mp.start();
                    }else if(UID.equals("MSC007"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.kevinmacleodfluffingaduck);
                        mp.start();
                    }
                    else if(UID.equals("MSC008"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.kevinmacleodmonkeysspinningmonkeys);
                        mp.start();
                    }
                    else if(UID.equals("MSC009"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.kevinmacleodschemingweasel);
                        mp.start();
                    }else if(UID.equals("MSC010"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.kevinmacleodthebuilder);
                        mp.start();
                    }
                    else if(UID.equals("MSC011"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.kevinmacleodhiddenagenda);
                        mp.start();
                    }
                    else if(UID.equals("MSC012"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.kevinmacleodinvestigations);
                        mp.start();
                    }else if(UID.equals("MSC013"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.kevinmacleodmovementproposition);
                        mp.start();
                    }
                    else if(UID.equals("MSC014"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.kevinmacleodsneakysnitch);
                        mp.start();
                    }
                    else if(UID.equals("MSC015"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.sadmusic);
                        mp.start();
                    }else if(UID.equals("MSC016"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.sadmusic2);
                        mp.start();
                    }
                    else if(UID.equals("MSC017"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.victory);
                        mp.start();
                    }
                    else if(UID.equals("MSC018"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.yualwayslying);
                        mp.start();
                    }
                }
                else if(UID.contains("FSC"))
                {
                    if(UID.equals("FSC000"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.burp);
                        mp.start();
                    }
                    else if(UID.equals("FSC001"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.fart);
                        mp.start();
                    }
                    else if(UID.equals("FSC002"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.fart2);
                        mp.start();
                    }
                    else if(UID.equals("FSC003"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.fart3);
                        mp.start();
                    }
                }
                else if(UID.contains("SESC"))
                {
                    if(UID.equals("SESC000"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.badumtss);
                        mp.start();
                    }
                    else if(UID.equals("SESC001"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.ballistaslowmo);
                        mp.start();
                    }
                    else if(UID.equals("SESC002"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.barrett50calslowmo);
                        mp.start();
                    }
                    else if(UID.equals("SESC003"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.barrett50cal);
                        mp.start();
                    }
                    else if(UID.equals("SESC004"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.boomswoosh);
                        mp.start();
                    }
                    else if(UID.equals("SESC005"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.boom);
                        mp.start();
                    }
                    else if(UID.equals("SESC006"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.buzzerorwronganswer);
                        mp.start();
                    }else if(UID.equals("SESC007"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.camerashutter);
                        mp.start();
                    }
                    else if(UID.equals("SESC008"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.camerashutter2);
                        mp.start();
                    }
                    else if(UID.equals("SESC009"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.carcrash);
                        mp.start();
                    }else if(UID.equals("SESC010"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.carhorn);
                        mp.start();
                    }
                    else if(UID.equals("SESC011"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cartoonboing);
                        mp.start();
                    }
                    else if(UID.equals("SESC012"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cartoonboing2);
                        mp.start();
                    }else if(UID.equals("SESC013"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cartoonboing3);
                        mp.start();
                    }
                    else if(UID.equals("SESC014"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cartoonclock);
                        mp.start();
                    }
                    else if(UID.equals("SESC015"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cartoonpop);
                        mp.start();
                    }else if(UID.equals("SESC016"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cartoonricochet);
                        mp.start();
                    }
                    else if(UID.equals("SESC017"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cartoonricochet2);
                        mp.start();
                    }
                    else if(UID.equals("SESC018"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cartoonspin);
                        mp.start();
                    }else if(UID.equals("SESC019"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cartoontaunt);
                        mp.start();
                    }
                    else if(UID.equals("SESC020"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cartoontirescreech);
                        mp.start();
                    }
                    else if(UID.equals("SESC021"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.cartoontransition);
                        mp.start();
                    }else if(UID.equals("SESC022"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.censorbeep);
                        mp.start();
                    }
                    else if(UID.equals("SESC023"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.swooshdramatic);
                        mp.start();
                    }
                    else if(UID.equals("SESC024"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.denied);
                        mp.start();
                    }else if(UID.equals("SESC025"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.drumroll);
                        mp.start();
                    }
                    else if(UID.equals("SESC026"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.dsrslowmo);
                        mp.start();
                    }
                    else if(UID.equals("SESC027"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.dundundunnn);
                        mp.start();
                    }else if(UID.equals("SESC028"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.eatormunch);
                        mp.start();
                    }
                    else if(UID.equals("SESC029"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.eatormunch2);
                        mp.start();
                    }
                    else if(UID.equals("SESC030"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.explosion);
                        mp.start();
                    }else if(UID.equals("SESC031"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.explosion2);
                        mp.start();
                    }
                    else if(UID.equals("SESC032"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.fail);
                        mp.start();
                    }
                    else if(UID.equals("SESC033"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.fail2);
                        mp.start();
                    }else if(UID.equals("SESC034"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.falling);
                        mp.start();
                    }
                    else if(UID.equals("SESC035"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.fasttiptoes);
                        mp.start();
                    }
                    else if(UID.equals("SESC036"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.monsterkill);
                        mp.start();
                    }else if(UID.equals("SESC037"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.inceptionfoghorn);
                        mp.start();
                    }
                    else if(UID.equals("SESC038"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.kick);
                        mp.start();
                    }
                    else if(UID.equals("SESC039"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.lightsaber);
                        mp.start();
                    }else if(UID.equals("SESC040"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.lightsaber2);
                        mp.start();
                    }
                    else if(UID.equals("SESC041"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.m40a3);
                        mp.start();
                    }
                    else if(UID.equals("SESC042"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.mariojump);
                        mp.start();
                    }else if(UID.equals("SESC043"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.mgsalert);
                        mp.start();
                    }
                    else if(UID.equals("SESC044"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.mlghorns);
                        mp.start();
                    }
                    else if(UID.equals("SESC045"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.punch);
                        mp.start();
                    }
                    else if(UID.equals("SESC046"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.punch2);
                        mp.start();
                    }
                    else if(UID.equals("SESC047"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.punch3);
                        mp.start();
                    }
                    else if(UID.equals("SESC048"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.punch4);
                        mp.start();
                    }else if(UID.equals("SESC049"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.recordrewind);
                        mp.start();
                    }
                    else if(UID.equals("SESC050"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.recordscratch);
                        mp.start();
                    }
                    else if(UID.equals("SESC051"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.recordscratch2);
                        mp.start();
                    }else if(UID.equals("SESC052"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.reloading);
                        mp.start();
                    }
                    else if(UID.equals("SESC053"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.rubberduck);
                        mp.start();
                    }
                    else if(UID.equals("SESC054"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.rubberduck2);
                        mp.start();
                    }
                    else if(UID.equals("SESC055"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.scramblingfredflintstone);
                        mp.start();
                    }
                    else if(UID.equals("SESC056"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.slideup);
                        mp.start();
                    }
                    else if(UID.equals("SESC057"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.slip);
                        mp.start();
                    }
                    else if(UID.equals("SESC058"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.splat);
                        mp.start();
                    }
                    else if(UID.equals("SESC059"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.suddensuspense);
                        mp.start();
                    }else if(UID.equals("SESC060"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.suspensesudden);
                        mp.start();
                    }
                    else if(UID.equals("SESC061"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.suspensesudden2);
                        mp.start();
                    }
                    else if(UID.equals("SESC062"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.suspense1);
                        mp.start();
                    }
                    else if(UID.equals("SESC063"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.suspense2);
                        mp.start();
                    }
                    else if(UID.equals("SESC064"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.suspense3);
                        mp.start();
                    }
                    else if(UID.equals("SESC065"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.suspense4);
                        mp.start();
                    }
                    else if(UID.equals("SESC066"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.swoosh);
                        mp.start();
                    }
                    else if(UID.equals("SESC067"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.swoosh2);
                        mp.start();
                    }
                    else if(UID.equals("SESC068"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.swoosh3);
                        mp.start();
                    }
                    else if(UID.equals("SESC069"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.swoosh4);
                        mp.start();
                    }else if(UID.equals("SESC070"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.swoosh5);
                        mp.start();
                    }
                    else if(UID.equals("SESC071"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.throwingknifehitmarker);
                        mp.start();
                    }
                    else if(UID.equals("SESC072"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.throwing);
                        mp.start();
                    }
                    else if(UID.equals("SESC073"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.tiptoecartoonxylophone);
                        mp.start();
                    }
                    else if(UID.equals("SESC074"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.tomahawkhitmarker);
                        mp.start();
                    }
                    else if(UID.equals("SESC075"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.tvstatic);
                        mp.start();
                    }
                    else if(UID.equals("SESC076"))
                    {
                        if(mp != null)
                        {
                            mp.stop();
                            mp.release();
                            mp=null;
                        }
                        mp = MediaPlayer.create(Main3Activity.this,R.raw.vinegunshotakaboom);
                        mp.start();
                    }
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

                TextView tvb =(TextView) view.findViewById(R.id.textView2);
                tvb.setTextColor(color2);

                if(UID.contains("ASC")){
                    sdb.updateDataTable1(UID,SCN,0);
                    Toast.makeText(Main3Activity.this, "Removed \"" + SCN + "\" from favourites", Toast.LENGTH_SHORT).show();
                } else if(UID.contains("HSC")){
                    sdb.updateDataTable2(UID,SCN,0);
                    Toast.makeText(Main3Activity.this, "Removed \"" + SCN + "\" from favourites", Toast.LENGTH_SHORT).show();
                } else if(UID.contains("MSC")){
                    sdb.updateDataTable3(UID,SCN,0);
                    Toast.makeText(Main3Activity.this, "Removed \"" + SCN + "\" from favourites", Toast.LENGTH_SHORT).show();
                } else if(UID.contains("FSC")){
                    sdb.updateDataTable4(UID,SCN,0);
                    Toast.makeText(Main3Activity.this, "Removed \"" + SCN + "\" from favourites", Toast.LENGTH_SHORT).show();
                } else if(UID.contains("SESC")){
                    sdb.updateDataTable5(UID,SCN,0);
                    Toast.makeText(Main3Activity.this, "Removed \"" + SCN + "\" from favourites", Toast.LENGTH_SHORT).show();
                }


                return false;
            }
        });


        fb1 = (FloatingActionButton)findViewById(R.id.fab_home);
        fb2 = (FloatingActionButton)findViewById(R.id.fab_fav);
        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });
        fb3 = (FloatingActionButton)findViewById(R.id.fab_cat);
        fb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this,MainActivity.class);
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
                    mp=null;
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

        /*mAdView = (AdView)findViewById(R.id.adView2);
        final AdRequest adRequest = new AdRequest.Builder().build();
        MobileAds.initialize(this,"ca-app-pub-9804648583897414~8081344279");
        mAdView.loadAd(adRequest);*/

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

        if(UID.contains("ASC")) {
            if(UID.equals("ASC000"))
            {
                id = R.raw.cricketschirping;
            }
            else if(UID.equals("ASC001"))
            {
                id = R.raw.dolphin;
            }
            else if(UID.equals("ASC002"))
            {
                id = R.raw.meepmeep;
            }
            else if(UID.equals("ASC003"))
            {
                id = R.raw.snakehissing;
            }
        }
        else if(UID.contains("HSC")) {
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
        }
        else if(UID.contains("MSC")) {
            if(UID.equals("MSC000"))
            {
                id = R.raw.boxingglovesbyjuliokladniew;
            }
            else if(UID.equals("MSC001"))
            {
                id =R.raw.epicchoirsuspense;
            }
            else if(UID.equals("MSC002"))
            {
                id =R.raw.failwhawhaversion;
            }
            else if(UID.equals("MSC003"))
            {
                id =R.raw.heavenlychoir;
            }
            else if(UID.equals("MSC004"))
            {
                id =R.raw.hiddenmasterstheme;
            }
            else if(UID.equals("MSC005"))
            {
                id =R.raw.illuminati;
            }
            else if(UID.equals("MSC006"))
            {
                id =R.raw.introsoundeffect;
            }
            else if(UID.equals("MSC007"))
            {
                id =R.raw.kevinmacleodfluffingaduck;
            }
            else if(UID.equals("MSC008"))
            {
                id =R.raw.kevinmacleodmonkeysspinningmonkeys;
            }
            else if(UID.equals("MSC009"))
            {
                id =R.raw.kevinmacleodschemingweasel;
            }
            else if(UID.equals("MSC010"))
            {
                id =R.raw.kevinmacleodthebuilder;
            }
            else if(UID.equals("MSC011"))
            {
                id =R.raw.kevinmacleodhiddenagenda;
            }
            else if(UID.equals("MSC012"))
            {
                id =R.raw.kevinmacleodinvestigations;
            }
            else if(UID.equals("MSC013"))
            {
                id =R.raw.kevinmacleodmovementproposition;
            }
            else if(UID.equals("MSC014"))
            {
                id =R.raw.kevinmacleodsneakysnitch;
            }
            else if(UID.equals("MSC015"))
            {
                id =R.raw.sadmusic;
            }
            else if(UID.equals("MSC016"))
            {
                id =R.raw.sadmusic2;
            }
            else if(UID.equals("MSC017"))
            {
                id =R.raw.victory;
            }
            else if(UID.equals("MSC018"))
            {
                id =R.raw.yualwayslying;
            }
        }
        else if(UID.contains("FSC")) {
            if(UID.equals("FSC000"))
            {
                id = R.raw.burp;
            }
            else if(UID.equals("FSC001"))
            {
                id = R.raw.fart;
            }
            else if(UID.equals("FSC002"))
            {
                id = R.raw.fart2;
            }
            else if(UID.equals("FSC003"))
            {
                id = R.raw.fart3;
            }
        }
        else if(UID.contains("SESC")) {
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
        }

        switch (item.getTitle().toString()) {
            case "Remove from favourites":
                TextView tva =(TextView) view.findViewById(R.id.textView2);
                tva.setTextColor(color1);
                if(UID.contains("ASC")) {
                    sdb.updateDataTable1(UID,SCN,0);
                }
                else if(UID.contains("HSC")) {
                    sdb.updateDataTable2(UID,SCN,0);
                }
                else if(UID.contains("MSC")) {
                    sdb.updateDataTable3(UID,SCN,0);
                }
                else if(UID.contains("FSC")) {
                    sdb.updateDataTable4(UID,SCN,0);
                }
                else if(UID.contains("SESC")) {
                    sdb.updateDataTable5(UID,SCN,0);
                }
                Toast.makeText(this, "Removed \"" + SCN + "\" from favourites", Toast.LENGTH_SHORT).show();
                break;
            case "Ad-free version features":
                Intent i = new Intent(Main3Activity.this,Main14Activity.class);
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
       // return super.onContextItemSelected(item);
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
            mp=null;
        }
    }
}