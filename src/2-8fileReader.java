		Reader in=null;
		Writer out=null;
		try{
			out=new FileWriter("D://s.txt");//1.文件writer
			String a="hello java\r\n计算机网络通信编程";
			out.write(a);   //2.write字符串
			out.flush();  //3.特别重要1，否则不能读出来
		    in=new FileReader("D://s.txt");
		    char[] c=new char[1000];//4.字符数组
            String str="";
		    int len;	         
			while((len=in.read(c))!=-1)
		    {	       
		       str+=new String(c,0,len);//5.特别重要2，一定要有len长度，否则会显示1000个字节的乱码
		    }
			System.out.println(str);
			in.close();
			out.close();
		}
		catch(Exception e){
		    e.printStackTrace();
		}