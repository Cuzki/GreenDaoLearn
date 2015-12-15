package cuzki_orm_test.com.mygreendao;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import cuzki_orm_test.com.mygreendao.dao.DaoMaster;
import cuzki_orm_test.com.mygreendao.dao.DaoSession;

/**
 * Created by Cuzki on 2015/12/14.
 */
public class MyApplication extends Application {
    private static DaoMaster mDaoMaster;
    private static DaoSession mDaoSession;
    public static SQLiteDatabase mDb;
    public static MyApplication myApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        getDaoMaster(this);
        getDaoSession(this);
    }

    public static DaoMaster getDaoMaster(Context context) {
        if (context == null) {
            return null;
        }
        if (mDaoMaster == null) {
            DBHelper1 help = new DBHelper1(context, "db_name", null);
            mDaoMaster = new DaoMaster(help.getWritableDatabase());
        }
        return mDaoMaster;
    }

    public static DaoSession getDaoSession(Context context) {
        if (context == null) {
            return null;
        }
        if (mDaoSession == null) {
            if (mDaoMaster == null) {
                mDaoMaster = getDaoMaster(context);
            }
            mDaoSession = mDaoMaster.newSession();
        }
        return mDaoSession;
    }

    public static SQLiteDatabase getSQLDatebase(Context context) {
        if (mDaoSession == null) {
            if (mDaoMaster == null) {
                mDaoMaster = getDaoMaster(context);
            }
            mDb = mDaoMaster.getDatabase();
        }
        return mDb;
    }


}
