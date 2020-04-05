		InputStream in=null;
		OutputStream out=null;
		try{
			out=new FileOutputStream("D://s.txt");
			String a="hello java\r\n计算机网络通信编程";
			out.write(a.getBytes());
		    in=new FileInputStream("D://s.txt");
		    byte[] c=new byte[1000];
                    String str="";
		    int len;	         
			while((len=in.read(c))!=-1)
		    {	       
		       str+=new String(c,0,len);//特别重要，一定要有len长度，否则会显示1000个字节的乱码
		    }
			System.out.println(str);
			in.close();
			out.close();
		}
		catch(Exception e){
		    e.printStackTrace();
		}	