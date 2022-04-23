package com.adara.yash.memelordthesoundboard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class SoundClipsDataBase extends SQLiteOpenHelper {

    private static final String DB_NAME ="SoundClipsDataBase.sqlite";

    private static final String DB_PATH = "/data/data/com.adara.yash.memelordthesoundboard/databases/";

    public final static String TABLE_NAME_1 = "AnimalSounds";

    public final static String TABLE_NAME_2 = "HumanSounds";

    public final static String TABLE_NAME_3 = "MusicClips";

    public final static String TABLE_NAME_4 = "FartSounds";

    public final static String TABLE_NAME_5 = "SoundEffects";

    public final static String COL_1 = "ID";

    public final static String COL_2 = "UID";

    public final static String COL_3 = "SOUNDEFFECTNAME";

    public final static String COL_4 = "FAVSTATUS";

    private Context context;

    public SQLiteDatabase db;

    public SoundClipsDataBase(Context context){
        super(context,DB_NAME,null,1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

    private void CopyDBFromExternalSource(){
        db = null;

        try{
            InputStream inputStream = context.getAssets().open(DB_NAME);
            String DB_ABS_PATH = DB_PATH+DB_NAME;
            OutputStream outputStream = new FileOutputStream(DB_ABS_PATH);

            byte[] buff = new byte[1024];
            int length = 0;
            while((length =inputStream.read(buff))>0)
            {
                outputStream.write(buff,0,length);
            }
            outputStream.flush();
            outputStream.close();
            inputStream.close();

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private boolean DBexist(){
        db = null;

        String DB_ABS_PATH = DB_PATH +DB_NAME;
        try{
            db = SQLiteDatabase.openDatabase(DB_ABS_PATH,null,SQLiteDatabase.OPEN_READWRITE);
            db.setLockingEnabled(true);
            db.setLocale(Locale.getDefault());
            db.setVersion(1);
        }catch (Exception e)
        {
          e.printStackTrace();
        }

        if(db != null)
        {
            db.close();
        }

        return db != null ? true : false;
    }

    private void createDB() {
        boolean dbExist = DBexist();

        if(!dbExist) {
            this.getReadableDatabase();
            CopyDBFromExternalSource();
        }
    }

    public void creat_DB_public (){
        createDB();
    }

    public List<String> getArrayTable1()
    {
        ArrayList<String> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_1,null);
        res.moveToFirst();
        do{
            data.add(res.getString(2));
        }
        while(res.moveToNext());
        return data;
    }

    public void insertDataTable1 (String UID,String SCN,int i)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,UID);
        contentValues.put(COL_3,SCN);
        contentValues.put(COL_4,i);
        db.insert(TABLE_NAME_1,null,contentValues);
    }

    public void updateDataTable1(String UID,String SCN,int i) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, UID);
        contentValues.put(COL_3, SCN);
        contentValues.put(COL_4,i);
        db.update(TABLE_NAME_1,contentValues,"UID = ?",new String[] { UID } );
    }

    public void deletedataTable1(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        int effected = db.delete(TABLE_NAME_1,"UID = ?",new String[] { UID });
    }

    public List<String> getArrayTable2()
    {
        ArrayList<String> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_2,null);
        res.moveToFirst();
        do{
            data.add(res.getString(2));
        }
        while(res.moveToNext());
        return data;
    }

    public void insertDataTable2 (String UID,String SCN,int i)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,UID);
        contentValues.put(COL_3,SCN);
        contentValues.put(COL_4,i);
        db.insert(TABLE_NAME_2,null,contentValues);
    }

    public void updateDataTable2(String UID,String SCN,int i) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, UID);
        contentValues.put(COL_3, SCN);
        contentValues.put(COL_4,i);
        db.update(TABLE_NAME_2,contentValues,"UID = ?",new String[] { UID } );
    }

    public void deletedataTable2(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        int effected = db.delete(TABLE_NAME_2,"UID = ?",new String[] { UID });
    }

    public List<String> getArrayTable3()
    {
        ArrayList<String> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_3,null);
        res.moveToFirst();
        do{
            data.add(res.getString(2));
        }
        while(res.moveToNext());
        return data;
    }

    public void insertDataTable3 (String UID,String SCN,int i)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,UID);
        contentValues.put(COL_3,SCN);
        contentValues.put(COL_4,i);
        db.insert(TABLE_NAME_3,null,contentValues);
    }

    public void updateDataTable3(String UID,String SCN,int i) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, UID);
        contentValues.put(COL_3, SCN);
        contentValues.put(COL_4,i);
        db.update(TABLE_NAME_3,contentValues,"UID = ?",new String[] { UID } );
    }

    public void deletedataTable3(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        int effected = db.delete(TABLE_NAME_3,"UID = ?",new String[] { UID });
    }

    public List<String> getArrayTable4()
    {
        ArrayList<String> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_4,null);
        res.moveToFirst();
        do{
            data.add(res.getString(2));
        }
        while(res.moveToNext());
        return data;
    }

    public void insertDataTable4 (String UID,String SCN,int i)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,UID);
        contentValues.put(COL_3,SCN);
        contentValues.put(COL_4,i);
        db.insert(TABLE_NAME_4,null,contentValues);
    }

    public void updateDataTable4(String UID,String SCN,int i) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, UID);
        contentValues.put(COL_3, SCN);
        contentValues.put(COL_4,i);
        db.update(TABLE_NAME_4,contentValues,"UID = ?",new String[] { UID } );
    }

    public void deletedataTable4(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        int effected = db.delete(TABLE_NAME_4,"UID = ?",new String[] { UID });
    }

    public List<String> getArrayTable5()
    {
        ArrayList<String> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from " +TABLE_NAME_5,null);
        res.moveToFirst();
        do{
            data.add(res.getString(2));
        }
        while(res.moveToNext());
        return data;
    }

    public void insertDataTable5 (String UID,String SCN,int i)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,UID);
        contentValues.put(COL_3,SCN);
        contentValues.put(COL_4,i);
        db.insert(TABLE_NAME_5,null,contentValues);
    }

    public void updateDataTable5(String UID,String SCN,int i) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, UID);
        contentValues.put(COL_3, SCN);
        contentValues.put(COL_4,i);
        db.update(TABLE_NAME_5,contentValues,"UID = ?",new String[] { UID } );
    }

    public void deletedataTable5(String UID) {
        SQLiteDatabase db = this.getWritableDatabase();
        int effected = db.delete(TABLE_NAME_5,"UID = ?",new String[] { UID });
    }


    public List<String> getArrayTable1UID()
    {
        ArrayList<String> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_1,null);
        res.moveToFirst();
        do{
            data.add(res.getString(1));
        }
        while(res.moveToNext());
        return data;
    }

    public List<String> getArrayTable2UID()
    {
        ArrayList<String> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_2,null);
        res.moveToFirst();
        do{
            data.add(res.getString(1));
        }
        while(res.moveToNext());
        return data;
    }

    public List<String> getArrayTable3UID()
    {
        ArrayList<String> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_3,null);
        res.moveToFirst();
        do{
            data.add(res.getString(1));
        }
        while(res.moveToNext());
        return data;
    }

    public List<String> getArrayTable4UID()
    {
        ArrayList<String> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_4,null);
        res.moveToFirst();
        do{
            data.add(res.getString(1));
        }
        while(res.moveToNext());
        return data;
    }

    public List<String> getArrayTable5UID()
    {
        ArrayList<String> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_5,null);
        res.moveToFirst();
        do{
            data.add(res.getString(1));
        }
        while(res.moveToNext());
        return data;
    }

    public List<Integer> getArrayTable1FAVSTAT()
    {
        List<Integer> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_1,null);
        res.moveToFirst();
        do{
            data.add(res.getInt(3));
        }
        while(res.moveToNext());
        return data;
    }

    public List<Integer> getArrayTable2FAVSTAT()
    {
        List<Integer> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_2,null);
        res.moveToFirst();
        do{
            data.add(res.getInt(3));
        }
        while(res.moveToNext());
        return data;
    }

    public List<Integer> getArrayTable3FAVSTAT()
    {
        List<Integer> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_3,null);
        res.moveToFirst();
        do{
            data.add(res.getInt(3));
        }
        while(res.moveToNext());
        return data;
    }

    public List<Integer> getArrayTable4FAVSTAT()
    {
        List<Integer> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_4,null);
        res.moveToFirst();
        do{
            data.add(res.getInt(3));
        }
        while(res.moveToNext());
        return data;
    }

    public List<Integer> getArrayTable5FAVSTAT()
    {
        List<Integer> data = new ArrayList();
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor res = mydb.rawQuery("select * from "+TABLE_NAME_5,null);
        res.moveToFirst();
        do{
            data.add(res.getInt(3));
        }
        while(res.moveToNext());
        return data;
    }

    public List<String> getFAVNAME(){

        ArrayList<String> data = new ArrayList();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cur1 = db.rawQuery("select * from "+TABLE_NAME_1,null);
        cur1.moveToFirst();
        Cursor cur2 = db.rawQuery("select * from "+TABLE_NAME_2,null);
        cur2.moveToFirst();
        Cursor cur3 = db.rawQuery("select * from "+TABLE_NAME_3,null);
        cur3.moveToFirst();
        Cursor cur4 = db.rawQuery("select * from "+TABLE_NAME_4,null);
        cur4.moveToFirst();
        Cursor cur5 = db.rawQuery("select * from "+TABLE_NAME_5,null);
        cur5.moveToFirst();
        do{
            if(cur1.getInt(3)==1)
            {
                data.add(cur1.getString(2));
            }
        }
        while(cur1.moveToNext());

        do{
            if(cur2.getInt(3)==1)
            {
                data.add(cur2.getString(2));
            }
        }
        while(cur2.moveToNext());

        do{
            if(cur3.getInt(3)==1)
            {
                data.add(cur3.getString(2));
            }
        }
        while(cur3.moveToNext());

        do{
            if(cur4.getInt(3)==1)
            {
                data.add(cur4.getString(2));
            }
        }
        while(cur4.moveToNext());

        do{
            if(cur5.getInt(3)==1)
            {
                data.add(cur5.getString(2));
            }
        }
        while(cur5.moveToNext());

        if(data.isEmpty())
        {
            data.add("No Favourites :( ");
        }

        return data;
    }

    public List<String> getFAVUID(){

        ArrayList<String> data = new ArrayList();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cur1 = db.rawQuery("select * from "+TABLE_NAME_1,null);
        cur1.moveToFirst();
        Cursor cur2 = db.rawQuery("select * from "+TABLE_NAME_2,null);
        cur2.moveToFirst();
        Cursor cur3 = db.rawQuery("select * from "+TABLE_NAME_3,null);
        cur3.moveToFirst();
        Cursor cur4 = db.rawQuery("select * from "+TABLE_NAME_4,null);
        cur4.moveToFirst();
        Cursor cur5 = db.rawQuery("select * from "+TABLE_NAME_5,null);
        cur5.moveToFirst();
        do{
            if(cur1.getInt(3)==1)
            {
                data.add(cur1.getString(1));
            }
        }
        while(cur1.moveToNext());

        do{
            if(cur2.getInt(3)==1)
            {
                data.add(cur2.getString(1));
            }
        }
        while(cur2.moveToNext());

        do{
            if(cur3.getInt(3)==1)
            {
                data.add(cur3.getString(1));
            }
        }
        while(cur3.moveToNext());

        do{
            if(cur4.getInt(3)==1)
            {
                data.add(cur4.getString(1));
            }
        }
        while(cur4.moveToNext());

        do{
            if(cur5.getInt(3)==1)
            {
                data.add(cur5.getString(1));
            }
        }
        while(cur5.moveToNext());

        if(data.isEmpty())
        {
            data.add("");
        }
        return data;
    }

    public List<Integer> getFAVSTAT(){

        List<Integer> data = new ArrayList();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cur1 = db.rawQuery("select * from "+TABLE_NAME_1,null);
        cur1.moveToFirst();
        Cursor cur2 = db.rawQuery("select * from "+TABLE_NAME_2,null);
        cur2.moveToFirst();
        Cursor cur3 = db.rawQuery("select * from "+TABLE_NAME_3,null);
        cur3.moveToFirst();
        Cursor cur4 = db.rawQuery("select * from "+TABLE_NAME_4,null);
        cur4.moveToFirst();
        Cursor cur5 = db.rawQuery("select * from "+TABLE_NAME_5,null);
        cur5.moveToFirst();
        do{
            if(cur1.getInt(3)==1)
            {
                data.add(cur1.getInt(3));
            }
        }
        while(cur1.moveToNext());

        do{
            if(cur2.getInt(3)==1)
            {
                data.add(cur2.getInt(3));
            }
        }
        while(cur2.moveToNext());

        do{
            if(cur3.getInt(3)==1)
            {
                data.add(cur3.getInt(3));
            }
        }
        while(cur3.moveToNext());

        do{
            if(cur4.getInt(3)==1)
            {
                data.add(cur4.getInt(3));
            }
        }
        while(cur4.moveToNext());

        do{
            if(cur5.getInt(3)==1)
            {
                data.add(cur5.getInt(3));
            }
        }
        while(cur5.moveToNext());

        if(data.isEmpty())
        {
            data.add(1);
        }

        return data;
    }
}
