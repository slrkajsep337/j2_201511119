package com.sd.sort.v2;
import java.util.*;
import com.sd.turtle.WeightTurtle;
import com.sd.sort.*;

public class SorterMainV2 {
  public static void main(String[] args) {
    String[] B={"John", "Adam", "Skrien", "Smith", "Jones"};
    Comparator stringComp=new StringComparator();
    Sorter.sort(B, stringComp);
    
    Integer[] C = {new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
    Comparator integerComp=new IntegerComparator();
    Sorter.sort(C, integerComp);
    //run할 때는 전략적으로 type이 바뀜(고정부 변동부 분리)
    //-> 전략패턴(strategy)

    for(int i=0; i<B.length; i++)
      System.out.println("B["+i+"]="+B[i]);
    for(int i=0; i<C.length; i++)
      System.out.println("C["+i+"]="+C[i]);
    
    WeightTurtle wt30 = new WeightTurtle(30);
    WeightTurtle wt10 = new WeightTurtle(10);
    WeightTurtle wt20 = new WeightTurtle(20);
    WeightTurtle[] wts={wt30, wt10, wt20};
    Comparator turtleComp=new TurtleComparator();
    Sorter.sort(wts, turtleComp);
    
    for(int i=0; i<wts.length; i++)
      System.out.println("WeightTurtleArray["+i+"]="+wts[i].getWeight());
  }
}
