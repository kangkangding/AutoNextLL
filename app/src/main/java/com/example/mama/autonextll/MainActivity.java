package com.example.mama.autonextll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        ll_parent = (LinearLayout) findViewById(R.id.ll_parent);
        AotuLL autoll = new AotuLL(this);
        autoll.initAutoLL(ll_parent,datas);
    }
    //    数据
    ArrayList<String> datas = new ArrayList<>();

    //    初始化数据
    private void initData() {
        datas.add("咨 询");
        datas.add("哈 哈 哈");
        datas.add("快 讯 读 者");
        datas.add("码 农  爱 好 者");
        datas.add("打 码");
        datas.add("你是会说，都是你的理");
        datas.add("黑夜给了群殴一双黑色的眼睛");
        datas.add("对对对");
    }

    //    最外层的竖直线性布局
    private LinearLayout ll_parent;



}
