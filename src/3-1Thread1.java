public class Demo2 extends Thread{//线程1
	int num=8;
	public void run(){  //实现run方法
		while(num>0){
			System.out.println(num--);		
		}
	}
	public static void main(String[] args) {
		Demo2 t1=new Demo2();//线程对象
		t1.start();  //启动，间接调用run方法，不能直接调用run
		Demo2 t2=new Demo2();
		t2.start();
	}
}