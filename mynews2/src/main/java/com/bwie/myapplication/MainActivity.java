package com.bwie.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bwie.myapplication.fragment.LikeFragment;
import com.bwie.myapplication.fragment.LoginFragment;
import com.bwie.myapplication.fragment.MainFragment;
import com.bwie.myapplication.fragment.VideoFragment;

/**
 *  主页面
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView main_tv_home;
    private LinearLayout mian_ll_home,main_ll_home2,mian_ll_home3,mian_ll_home4;
    private TextView mian_tv2_home;
    private TextView main_tv3_home;
    private TextView mian_tv4_home;
    private ImageView main_iv_home;
    private ImageView mian_iv2_home;
    private ImageView main_iv3_home;
    private ImageView mian_iv4_home;
    private FrameLayout frame;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiView();
    }
    //获取id
    private void intiView(){
        frame = (FrameLayout) findViewById(R.id.main_frame);
        mian_ll_home = (LinearLayout) findViewById(R.id.mian_ll_home);
        main_ll_home2 = (LinearLayout) findViewById(R.id.main_ll_home2);
        mian_ll_home3 = (LinearLayout) findViewById(R.id.mian_ll_home3);
        mian_ll_home4 = (LinearLayout) findViewById(R.id.mian_ll_home4);
        main_tv_home = (TextView) findViewById(R.id.main_tv_home);
        mian_tv2_home = (TextView) findViewById(R.id.mian_tv2_home);
        main_tv3_home = (TextView) findViewById(R.id.main_tv3_home);
        mian_tv4_home = (TextView) findViewById(R.id.mian_tv4_home);
        main_iv_home = (ImageView) findViewById(R.id.main_iv_home);
        mian_iv2_home = (ImageView) findViewById(R.id.mian_iv2_home);
        main_iv3_home = (ImageView) findViewById(R.id.main_iv3_home);
        mian_iv4_home = (ImageView) findViewById(R.id.mian_iv4_home);

        mian_ll_home.setOnClickListener(this);
        main_ll_home2.setOnClickListener(this);
        mian_ll_home3.setOnClickListener(this);
        mian_ll_home4.setOnClickListener(this);
        //进行适配
        manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.main_frame,new MainFragment()).commit();
    }
    @Override
    public void onClick(View view) {
        //重置
        restartBotton();
        switch (view.getId()){
            case R.id.mian_ll_home:
                main_iv_home.setImageResource(R.drawable.b_newhome_tabbar_press);
                main_tv_home.setTextColor(Color.RED);
                manager.beginTransaction().replace(R.id.main_frame,new MainFragment()).commit();
            break;
            case R.id.main_ll_home2:
                mian_iv2_home.setImageResource(R.drawable.b_newvideo_tabbar_press);
                mian_tv2_home.setTextColor(Color.RED);
                manager.beginTransaction().replace(R.id.main_frame,new VideoFragment()).commit();
                break;
            case R.id.mian_ll_home3:
                main_iv3_home.setImageResource(R.drawable.b_newcare_tabbar_press);
                main_tv3_home.setTextColor(Color.RED);
                manager.beginTransaction().replace(R.id.main_frame,new LikeFragment()).commit();
                break;
            case R.id.mian_ll_home4:
                mian_iv4_home.setImageResource(R.drawable.b_newnologin_tabbar_press);
                mian_tv4_home.setTextColor(Color.RED);
                manager.beginTransaction().replace(R.id.main_frame,new LoginFragment()).commit();
                break;
        }
    }
    private  void restartBotton(){
        main_iv_home.setImageResource(R.drawable.b_newhome_tabbar);
        mian_iv2_home.setImageResource(R.drawable.b_newvideo_tabbar);
        main_iv3_home.setImageResource(R.drawable.b_newcare_tabbar);
        mian_iv4_home.setImageResource(R.drawable.b_newnologin_tabbar);
        main_tv_home.setTextColor(Color.BLACK);
        mian_tv2_home.setTextColor(Color.BLACK);
        main_tv3_home.setTextColor(Color.BLACK);
        mian_tv4_home.setTextColor(Color.BLACK);
    }
}
