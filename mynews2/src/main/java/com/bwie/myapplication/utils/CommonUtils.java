package com.bwie.myapplication.utils;

import android.graphics.drawable.Drawable;
import android.view.View;

import com.bwie.myapplication.app.MyApplication;

/**
 * 有关字体，图片的工具类
 */

public class CommonUtils {
    /**
     * @param layoutId
     * @return
     */
    public static View inflate(int layoutId) {
        View view = View.inflate(MyApplication.getContext(), layoutId, null);
        return view;
    }

    /**
     * 获取资源文件中的字符串
     *
     * @param stringId
     * @return
     */
    public static String getString(int stringId) {
        return MyApplication.getContext().getResources().getString(stringId);
    }

    /**
     * 获取字体大小
     *
     * @param id
     * @return
     */
    public static int getDimes(int id) {
        return (int) MyApplication.getContext().getResources().getDimension(id);
    }

    /**
     * 获取图片
     * @param id
     * @return
     */
    public static Drawable getDrawable(int id) {
        return MyApplication.getContext().getResources().getDrawable(id);
    }

    /**
     * 直接运行到主线程
     * @param runable
     */
    public static void runOnUIThread(Runnable runable) {
        //先判断当前属于子线程主线程
        if(android.os.Process.myTid()==MyApplication.getMainThreadId()){
            runable.run();
        }else{
            //子线程
            MyApplication.getHandler().post(runable);
        }
    }

    /**
     * 根据手机的分辨率dp的单位转为px(像素)
     * @param px
     * @return
     */
    public static int px2dip(int px) {
        //获取像素密度
        float density = MyApplication.getContext().getResources().getDisplayMetrics().density;
        int dip = (int) (px / density + 0.5f);
        return dip;

    }
}
