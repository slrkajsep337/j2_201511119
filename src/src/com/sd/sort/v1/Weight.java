package com.sd.sort.v1;


public class Weight implements Comparable{
  //interface comparable�� ������ �����
  private int kilo;
  public Weight(int k) {
    this.kilo=k;
  }
  public int compareTo(Object o) {
    //compareTo�� (Object o)�� �����Ǿ������Ƿ�
    //Weight w -> Object o �� �����ְ� casting���ش�
    Weight w=(Weight)o; //casting���־�� return���� ����x
    return this.kilo-w.kilo;
  }
}
