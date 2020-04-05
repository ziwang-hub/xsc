		InputStream in=null;
		OutputStream out=null;
	    Reader in2=null;
		Writer out2=null;
		try{
			out=new FileOutputStream("D://s.txt");
			out2=new FileWriter("D://s.txt");
		    in=new FileInputStream("D://s.txt");
			in2=new FileReader("D://s.txt");
		    out.write('a');//不能写汉字
		    out.flush();
		    System.out.println((char)in.read());//不能读汉字
		    out2.write('网');//可以写汉字
		    out2.flush();//强制刷新，否则读取有问题
		    System.out.println((char)in2.read());//可以读汉字
		}
		catch(Exception e){
		    e.printStackTrace();
		}