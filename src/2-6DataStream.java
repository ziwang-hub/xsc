import java.io.*;

public class Example_01 { // ������
	public static void main(String[] args) { // ������
				try {
			// ����FileOutputStream����
			FileOutputStream fs = new FileOutputStream("D://word.txt");
			// ����DataOutputStream����
			DataOutputStream ds = new DataOutputStream(fs);
			ds.writeInt(120);
			ds.writeFloat(3.6f);
			ds.writeUTF("ʹ��writeUFT()����д������;"); // д������ļ�����
			ds.writeBytes("ʹ��writeBytes()����д������.");
			ds.close(); // �����ر�
			// ����FileInputStream����
			FileInputStream fis = new FileInputStream("D://word.txt");
			// ����DataInputStream����
			DataInputStream dis = new DataInputStream(fis);
			System.out.print(dis.readInt()); // ���ļ��������
			System.out.print(dis.readFloat()); // ���ļ��������
			System.out.print(dis.readUTF()); // ���ļ��������
		} catch (Exception e) {
			e.printStackTrace(); // ����쳣��Ϣ
		}
	}
}
