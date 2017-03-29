package com.sd.sort.v1;


public class Weight implements Comparable{
  //interface comparable을 가져다 사용함
  private int kilo;
  public Weight(int k) {
    this.kilo=k;
  }
  public int compareTo(Object o) {
    //compareTo가 (Object o)로 구현되어있으므로
    //Weight w -> Object o 로 고쳐주고 casting해준다
    Weight w=(Weight)o; //casting해주어야 return에서 오류x
    return this.kilo-w.kilo;
  }
}
