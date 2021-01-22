package practice;

import java.io.File;

public class FileTest9 {
	public static void main(String args[]){
	    File file = new File("src/practice/testOutput.txt");

	    if (file.exists()) {
	    	System.out.println("OK");
	    }

	    if (file.canRead()){
	      System.out.println("ファイルは読み込み可能です");
	    }

	    if (file.canWrite()){
	      System.out.println("ファイルは書き込み可能です");
	    }
	  }
}
