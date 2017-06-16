package headfirst.state.gumball;

public class GumballMachine {
  final static int SOLD_OUT=0;
  final static int NO_QUARTER=1;
  final static int HAS_QUARTER=2;
  final static int SOLD=3;
  
  int state = SOLD_OUT; //ÇöÀç state ÀúÀå(¸¾´ë·Î ¼³Á¤)
  int count = 0; //»çÅÁÀÇ °¹¼ö 
  
  public GumballMachine(int count) {
    this.count=count;
    if(count>0) {
      state = NO_QUARTER;
    }
  }
  
  public void insertQuarter() {
    if(state==HAS_QUARTER) {
      System.out.println("You can't not insert another quarter!");
    } else if(state==NO_QUARTER) {
      state=HAS_QUARTER;
      System.out.println("You inserted a quarter!");
    } else if(state==SOLD_OUT) {
      System.out.println("You can't not insert a quarter! sold out");
    } else if(state==SOLD) {
      System.out.println("wait..seling now!");
    }
  }
}
                           
                           

       
    
  