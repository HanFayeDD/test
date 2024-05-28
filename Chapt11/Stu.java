package Chapt11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Stu {
    public String name = "default name";
    private int id = 100;
    public Stu(){

    }
    public Stu(String aname){
        this.name = aname;
    }
    private void printName(){
        System.out.println(this.name + ' ' + this.id);
    }
    
    public static void main(String[] args) throws Exception {
        var s1 = new Stu("Han");
        Method m = s1.getClass().getDeclaredMethod("printName");
        m.invoke(s1);

        Field f_id = s1.getClass().getDeclaredField("id");
        f_id.setAccessible(true);
        f_id.set(s1, 200);
        m.invoke(s1);

        
        Constructor<?> con = s1.getClass().getConstructor();
        Stu ss1 = (Stu) con.newInstance();
        System.out.println(ss1.id);
        System.out.println(ss1.name);
    }
    

}