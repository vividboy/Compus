package com.example.lww.gift;

import android.support.annotation.NonNull;

/**
 * Created by Lww on 2017/8/22.
 */
                // 攻略
public class Strategy implements Comparable<Strategy>{
    public int id;
    public String title;                //名称
    public String remark;               //说明
    public String pic1;                 //图片一
    public String pic2;                 //图片二
    public String pic3;                 //图片三
    public String pic4;                 //图片四
    public String pic5;                 //图片五
    public String content;              //内容
    public String createdTime;          //创建时间

    @Override
    public int compareTo( Strategy another ) {
        return createdTime.compareTo(another.createdTime);
    }
}
