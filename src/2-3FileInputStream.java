		InputStream in=null;
		OutputStream out=null;
		try{
			out=new FileOutputStream("D://s.txt");
			String a="hello java\r\n���������ͨ�ű��";
			out.write(a.getBytes());
		    in=new FileInputStream("D://s.txt");
		    byte[] c=new byte[1000];
                    String str="";
		    int len;	         
			while((len=in.read(c))!=-1)
		    {	       
		       str+=new String(c,0,len);//�ر���Ҫ��һ��Ҫ��len���ȣ��������ʾ1000���ֽڵ�����
		    }
			System.out.println(str);
			in.close();
			out.close();
		}
		catch(Exception e){
		    e.printStackTrace();
		}	