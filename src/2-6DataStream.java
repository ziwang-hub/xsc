import java.io.*;

public class Example_01 { // 创建类
	public static void main(String[] args) { // 主方法
				try {
			// 创建FileOutputStream对象
			FileOutputStream fs = new FileOutputStream("D://word.txt");
			// 创建DataOutputStream对象
			DataOutputStream ds = new DataOutputStream(fs);
			ds.writeInt(120);
			ds.writeFloat(3.6f);
			ds.writeUTF("使用writeUFT()方法写入数据;"); // 写入磁盘文件数据
			ds.writeBytes("使用writeBytes()方法写入数据.");
			ds.close(); // 将流关闭
			// 创建FileInputStream对象
			FileInputStream fis = new FileInputStream("D://word.txt");
			// 创建DataInputStream对象
			DataInputStream dis = new DataInputStream(fis);
			System.out.print(dis.readInt()); // 将文件数据输出
			System.out.print(dis.readFloat()); // 将文件数据输出
			System.out.print(dis.readUTF()); // 将文件数据输出
		} catch (Exception e) {
			e.printStackTrace(); // 输出异常信息
		}
	}
}
