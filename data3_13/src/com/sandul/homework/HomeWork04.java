package com.sandul.homework;


import java.util.*;

public class HomeWork04 {
    public static void main(String[] args) {

        HashMap<String, Map> sheng = new HashMap<>();
        HashMap<String, List> shengb = new HashMap<>();
        HashMap<String, List> shengn = new HashMap<>();


        sheng.put("河北省", shengb);
        sheng.put("河南省", shengn);
        ArrayList<String> qhd = new ArrayList<>();
        ArrayList<String> ts = new ArrayList<>();
        ArrayList<String> sjz = new ArrayList<>();
        ArrayList<String> zz = new ArrayList<>();
        ArrayList<String> ly = new ArrayList<>();
        ArrayList<String> kf = new ArrayList<>();


        shengb.put("秦皇岛市", qhd);
        shengb.put("唐山市", ts);
        shengb.put("石家庄市", sjz);
        shengn.put("郑州市", zz);
        shengn.put("洛阳市", ly);
        shengn.put("开封市", kf);
        Collections.addAll(qhd, "海港市", "山海关区", "北戴河区", "昌黎县");
        Collections.addAll(ts, "路北区", "路南区", "古冶区", "开平区");
        Collections.addAll(sjz, "石家庄市", "长安区", "桥东区", "桥西区", "新华区");
        Collections.addAll(zz, "中原区", "金水区", "二七区", "管城回族区");
        Collections.addAll(ly, "西工区", "老城区", "润西区", "洛龙区");
        Collections.addAll(kf, "鼓楼区", "龙亭区", "顺河回族区", "禹王台区");
        Set<Map.Entry<String, Map>> entries = sheng.entrySet();
        for (Map.Entry<String, Map> entry : entries) {
            System.out.println(entry.getKey() + ":");
            Set<Map.Entry<String, List>> ens = entry.getValue().entrySet();
            for (Map.Entry<String, List> en : ens) {
                System.out.print("    " + en.getKey() + ":");
                System.out.println(en.getValue());
            }
        }
    }
}
