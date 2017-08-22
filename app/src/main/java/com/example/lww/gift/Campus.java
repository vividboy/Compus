package com.example.lww.gift;

import java.util.ArrayList;

/**
 * Created by Lww on 2017/8/22.
 */
                            //校园

public class Campus {
    public int id;
    public String name;                             //校园名称
    public String remark;                           //校园简介
    public int likes;                               //校园喜欢程度
    public ArrayList<CampusStyle> campuses=new
            ArrayList<>();                          //校园景物列表
}
