public class Demo2 extends Thread{//�߳�1
	int num=8;
	public void run(){  //ʵ��run����
		while(num>0){
			System.out.println(num--);		
		}
	}
	public static void main(String[] args) {
		Demo2 t1=new Demo2();//�̶߳���
		t1.start();  //��������ӵ���run����������ֱ�ӵ���run
		Demo2 t2=new Demo2();
		t2.start();
	}
}