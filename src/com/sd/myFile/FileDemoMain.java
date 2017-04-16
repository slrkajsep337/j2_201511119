package com.sd.myFile;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;;
import java.io.Reader;
import java.io.File;


public class FileDemoMain {
  public static void main(String[] args) throws Exception {
    File Readme = null;
    InputStream isReadme = null;
    InputStreamReader isrReadme = null;
    BufferedReader brReadme=null;
    int i;
    char c;
    String str;
    StringBuffer sbuffer = new StringBuffer();
      
    
    try {
      
      File myhome = new File(System.getProperty("user.home"));
      System.out.println("my home is"+myhome);
      
      String cwd = new File(".").getCanonicalPath(); //유일한 절대경로
      System.out.println("current working dir is "+cwd);

      Readme = new File(cwd, "hello.txt");
      System.out.println("readme file is "+Readme);
      
      isReadme = new FileInputStream(Readme);
      while((i=isReadme.read()) != -1) { 
        //-1;끝으로 생각(end of file)
        System.out.println((char)i);
      }
      
    } catch(Exception e){
      e.printStackTrace();
    } finally {
      if(isReadme != null)
        isReadme.close();
    }
    
    
    try{
      isReadme=new FileInputStream(Readme);
      isrReadme=new InputStreamReader(isReadme,"UTF8");
      brReadme= new BufferedReader(isrReadme);
     
      while((str=brReadme.readLine())!=null) {
        System.out.println("--"+str);
      }
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      if(brReadme != null)
        brReadme.close();
    }
  }
}
  