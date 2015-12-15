package cuzki_orm_test.com.mygreendao.migrations;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Cuzki on 2015/12/14.
 */
public abstract class AbstractMigratorHelper {
    public abstract void onUpgrade(SQLiteDatabase db);
}
