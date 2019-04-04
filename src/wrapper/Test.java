package wrapper;

public class Test {
	
	static int max=0;
	public void Test() {
		max++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Test t=new Test();
    t.Test();
    Test  t1=new Test();
    t1.Test();
    Test t2=new Test();
    t2.Test();
    Test t3=new Test();
    t3.Test();
    System.out.println(Test.max);
		
	}

}
