package com.java;

class Table{
 synchronized void printTable(int n) { //if n=2
  for(int i=1;i<=10;i++) {
   System.out.println(n+"X"+i+"="+n*i); //2X1=2
  }
 }
}

class FirstThread extends Thread{
 Table t;
 FirstThread(Table t){
  this.t=t;
 }
 public void run() {
  t.printTable(5);
 }
}

class SecondThread extends Thread{
 Table t;
 SecondThread(Table t){
  this.t=t;
  
 }
 public void run() {
  t.printTable(10);
 }
}

public class MainTable {

 public static void main(String[] args) throws InterruptedException {
  Table tob=new Table();
  FirstThread t1=new FirstThread(tob);
  SecondThread t2=new SecondThread(tob);
  t1.start();
  //t1.join();
  t2.start();
  
 }

}


