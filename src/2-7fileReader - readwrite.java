		InputStream in=null;
		OutputStream out=null;
	    Reader in2=null;
		Writer out2=null;
		try{
			out=new FileOutputStream("D://s.txt");
			out2=new FileWriter("D://s.txt");
		    in=new FileInputStream("D://s.txt");
			in2=new FileReader("D://s.txt");
		    out.write('a');//����д����
		    out.flush();
		    System.out.println((char)in.read());//���ܶ�����
		    out2.write('��');//����д����
		    out2.flush();//ǿ��ˢ�£������ȡ������
		    System.out.println((char)in2.read());//���Զ�����
		}
		catch(Exception e){
		    e.printStackTrace();
		}