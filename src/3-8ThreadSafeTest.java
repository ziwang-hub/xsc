public class ThreadSafe implements Runnable {
	int num = 10; // ���õ�ǰ��Ʊ��
	
	public void run() {
		while (true) {
			if (num > 0) {
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("tickets" + num--);
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadSafe t = new ThreadSafe(); // ʵ���������
		Thread t1 = new Thread(t); // �Ը������ֱ�ʵ����3���߳�
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start(); // �ֱ������߳�
		t2.start();
		t3.start();
	}
}
