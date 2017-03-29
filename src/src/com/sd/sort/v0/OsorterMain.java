package com.sd.sort.v0;

public class OsorterMain {
  public static void main(String[] args){
    Integer[] data={new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
    for(int i=data.length-1;i>=0;i--) {
      int indexOfMax=0;
      for(int j=1;j<=i;j++) {
        if(data[j] > data[indexOfMax])
          indexOfMax=j;
      }
      Integer temp=data[i];
      data[i]=data[indexOfMax];
      data[indexOfMax]=temp;
    }

    for(int i=0; i<data.length; i++)
      System.out.println("data["+i+"]="+data[i]);
  }
}