		Reader in=null;
		Writer out=null;
		try{
		    out=new FileWriter("D://s.txt");
		    in=new FileReader("D://s.txt");
		    BufferedWriter bw=new BufferedWriter(out);
		    BufferedReader br=new BufferedReader(in);
			String a="hello java\r\n计算机网络通信编程";		
			bw.write(a);
			bw.flush();   //强制刷新，否则不写
		    char[] c=new char[1000];
            String str="";
		    int len;	/*	    
			while((len=br.read(c))!=-1)
		    {
		       str+=new String(c,0,len);
		       System.out.println(str);
		    }*/
			while((str=br.readLine())!=null)
		    {
		       System.out.println(str);
		    }
			in.close();
			out.close();
		}
		catch(Exception e){
		    e.printStackTrace();
		}