package com.exam.thread;



public class TestThread extends Thread{
  int seq;
  public TestThread(int seq) {
    this.seq = seq;
  }

  public void run(){
    System.out.System.out.println(this.seq + " thread start");

    try{
      Thread.sleep(1000);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
}
public static Void main(String[] args) {
    for(int i=0; i<10; i++){
      Thread t = new TestThread(i);
      i.start();
    }
    System.out.println("Main ended....  ");
  }
}
