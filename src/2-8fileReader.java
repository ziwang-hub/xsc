		Reader in=null;
		Writer out=null;
		try{
			out=new FileWriter("D://s.txt");//1.�ļ�writer
			String a="hello java\r\n���������ͨ�ű��";
			out.write(a);   //2.write�ַ���
			out.flush();  //3.�ر���Ҫ1�������ܶ�����
		    in=new FileReader("D://s.txt");
		    char[] c=new char[1000];//4.�ַ�����
            String str="";
		    int len;	         
			while((len=in.read(c))!=-1)
		    {	       
		       str+=new String(c,0,len);//5.�ر���Ҫ2��һ��Ҫ��len���ȣ��������ʾ1000���ֽڵ�����
		    }
			System.out.println(str);
			in.close();
			out.close();
		}
		catch(Exception e){
		    e.printStackTrace();
		}