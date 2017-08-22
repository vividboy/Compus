package com.example.lww.gift;

/**
 * Created by Lww on 2017/8/22.
 */
                                 //校园类型

public class CampusType implements Comparable<CampusType>{
    public int id;
    public String name;
    public String pic;
    public int orderNum;
    @Override
    public int compareTo(CampusType another){
        return orderNum < another.orderNum ? -1
                :(orderNum == another.orderNum? 0:1);
    }

}
