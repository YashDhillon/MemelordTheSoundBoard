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

public class Main6Activity extends AppCompatActivity {

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
        setContentView(R.layout.activity_main6);

        sdb = new SoundClipsDataBase(this);

        String[] FSC = new String[sdb.getArrayTable4().size()];
        FSC = sdb.getArrayTable4().toArray(FSC);

        String[] FSC_UID = new String[sdb.getArrayTable4UID().size()];
        FSC_UID = sdb.getArrayTable4UID().toArray(FSC_UID);

        Integer[] FSC_FAV_STATUS = new Integer[sdb.getArrayTable4FAVSTAT().size()];
        FSC_FAV_STATUS = sdb.getArrayTable4FAVSTAT().toArray(FSC_FAV_STATUS);

        lv = (ListView)findViewById(R.id.lv);

        MyAdapter ma = new MyAdapter(this,FSC,FSC_UID,FSC_FAV_STATUS);

        lv.setAdapter(ma);

        //registerForContextMenu(lv);
        /*lv.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
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

                if(UID.equals("FSC000"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main6Activity.this,R.raw.burp);
                    mp.start();
                }
                else if(UID.equals("FSC001"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main6Activity.this,R.raw.fart);
                    mp.start();
                }
                else if(UID.equals("FSC002"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main6Activity.this,R.raw.fart2);
                    mp.start();
                }
                else if(UID.equals("FSC003"))
                {
                    if(mp != null)
                    {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                    mp = MediaPlayer.create(Main6Activity.this,R.raw.fart3);
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
                sdb.updateDataTable4(UID,SCN,1);
                Toast.makeText(Main6Activity.this, "Added \"" + SCN + "\" to favourites", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        fb1 = (FloatingActionButton)findViewById(R.id.fab_home);
        fb2 = (FloatingActionButton)findViewById(R.id.fab_fav);
        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main6Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });
        fb3 = (FloatingActionButton)findViewById(R.id.fab_cat);
        fb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main6Activity.this,MainActivity.class);
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

        mAdView = (AdView)findViewById(R.id.adView5);
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

        switch (item.getTitle().toString()) {
            case "Add to favourites":
                TextView tva =(TextView) view.findViewById(R.id.textView2);
                tva.setTextColor(color1);
                sdb.updateDataTable4(UID,SCN,1);
                Toast.makeText(this, "Added \"" + SCN + "\" to favourites", Toast.LENGTH_SHORT).show();
                break;
            case "Remove from favourites":
                TextView tvb =(TextView) view.findViewById(R.id.textView2);
                tvb.setTextColor(color2);
                sdb.updateDataTable4(UID,SCN,0);
                Toast.makeText(this, "Removed \"" + SCN + "\" from favourites", Toast.LENGTH_SHORT).show();
                break;
            case "Ad-free version features":
                Intent i = new Intent(Main6Activity.this,Main14Activity.class);
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
