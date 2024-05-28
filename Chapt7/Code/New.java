package Chapt7.Code;

import java.util.HashMap;
import java.util.HashSet;

public class New {
    public static void main(String[] args) {
        var sites = new HashSet<String>();
        sites.add("hanhan");
        boolean flag = sites.remove("pp");
        System.out.println(flag);

        HashMap<Integer, String> pp = new HashMap<>();
        pp.put(1, "jj");
        pp.put(2, "ou");
        System.out.println(pp);
        System.out.println(pp.keySet().getClass());
        System.out.println();
    }
    
}