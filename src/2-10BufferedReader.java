		Reader in=null;
		Writer out=null;
		try{
		    out=new FileWriter("D://s.txt");
		    in=new FileReader("D://s.txt");
		    BufferedWriter bw=new BufferedWriter(out);
		    BufferedReader br=new BufferedReader(in);
			String a="hello java\r\n���������ͨ�ű��";		
			bw.write(a);
			bw.flush();   //ǿ��ˢ�£�����д
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