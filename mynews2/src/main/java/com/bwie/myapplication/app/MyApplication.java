package com.bwie.myapplication.app;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Process;

/**
 * Created by dell on 2016/12/27.
 */

public class MyApplication extends Application {
    private static Context context;
    private static Handler handler;
    private static int mainThreadId;
    private static Thread currentThread;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        handler = new Handler();
        //获得主线程的唯一id
        mainThreadId = Process.myTid();
        //获得主线程
        currentThread = Thread.currentThread();
    }

    /**
     * 得到上下文
     * @return
     */
    public  static  Context getContext(){
        return context;
    }

    /**
     * 的到主线程
     * @return
     */
    public static Handler getHandler(){
        return handler;
    }

    /**
     * 得到主线程的唯一id
     * @return
     */
    public static int  getMainThreadId(){
        return mainThreadId;
    }

    /**
     * 得到主线程
     * @return
     */
    public static Thread getMainTread(){
        return currentThread;
    }
}
