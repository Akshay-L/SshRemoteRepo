package lab2;

public class Demo {
	
	int e,f;
	Demo(int e, int f){
		this.e = e;
		this.f = f;
	}
	
	public int sum(int a, int b){
		return a+b;
		}
	
	public static void main(String[] args) {
		//Demo demo1 = new Demo();//same as method name which is not returning anything then it is constructor
		Demo demo1 = new Demo(5, 6);
		int result = demo1.sum(2,3); //demo1 is the object of the demp class
		
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
