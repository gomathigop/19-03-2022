package com.java;

//Creating Thread by implementing Runnable interface
class MyThread1 implements Runnable{

@Override
public void run() {
System.out.println("Inside run method"+Thread.currentThread());
}
}

public class MainRunnable {

public static void main(String[] args) {
MyThread1 ob=new MyThread1();
//start method is defined in Thread
//Create an object of Thread class then pass the object of class
//which implements Runnable interface as an argument
Thread tob=new Thread(ob);
tob.setName("MyFirstThread");
tob.start();
MyThread1 ob1=new MyThread1();
Thread tob1=new Thread(ob1);
tob1.setName("MySecondThread");
tob1.start();
}

}
