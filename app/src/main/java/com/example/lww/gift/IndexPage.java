package com.example.lww.gift;

import java.util.ArrayList;

/**
 * Created by Lww on 2017/8/22.
 */
                              //首页资源

public class IndexPage {
    static final String SERVER="      ";                //服务器地址
    public String [] recommedTop;
    public String recommendBottomLeft;
    public String recommendBottomRight;
    public String campusCommon;
    public String strategy;
    public IndexPage(ArrayList<IndexPageResource>settings){
        ArrayList<String>recommendTopList = new ArrayList<>();
        for (IndexPageResource s :settings){
            switch(s.place){
                case 1:
                    recommendTopList.add(SERVER + s.picUrl);
                    break;
                case 2:
                    recommendBottomLeft = SERVER + s.picUrl;
                    break;
                case 3:
                    recommendBottomRight = SERVER +s.picUrl;
                    break;
                case 4:
                    campusCommon = SERVER + s.picUrl;
                    break;
                case 5:
                    strategy = SERVER + s.picUrl;
                    break;
            }
        }

        recommedTop = recommendTopList.toArray(new String[recommendTopList.size()]);
    }
}
