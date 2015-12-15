package cuzki_orm_test.com.mygreendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import cuzki_orm_test.com.mygreendao.dao.DaoMaster;

/**
 * Created by Cuzki on 2015/12/14.
 */
public class DBHelper2 extends DaoMaster.OpenHelper {

    public DBHelper2(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i("greenDAO", "调用DBHelper2 ");
    }
}
