package Chapt10.Code;

public class New {
    public static void main(String[] args) {
        new Thread1().run();
        new Thread(new Thread2()).start();
    }
}

class Thread1 extends Thread{
    @Override
    public void run(){
        System.out.println("new1");
    }
}

class Thread2 implements Runnable{
    @Override
    public void run(){
        System.out.println("new2");
    }
}