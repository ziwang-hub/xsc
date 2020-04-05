public class ThreadSafe implements Runnable {
	int num = 10; // 设置当前总票数
	
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
		ThreadSafe t = new ThreadSafe(); // 实例化类对象
		Thread t1 = new Thread(t); // 以该类对象分别实例化3个线程
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start(); // 分别启动线程
		t2.start();
		t3.start();
	}
}
