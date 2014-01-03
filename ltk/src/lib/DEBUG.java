package lib;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DEBUG {
	//usage:System.out.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
	public static String ClassName()  { return ((new Exception()).getStackTrace())[1].getClassName();  }
	public static String MethodName() { return ((new Exception()).getStackTrace())[1].getMethodName(); }
	public static String FileName()   { return ((new Exception()).getStackTrace())[1].getFileName();   }
	public static int LineNumber()    { return ((new Exception()).getStackTrace())[1].getLineNumber(); }

	//usage:System.out.println(DEBUG.DateTime());
	public static String DateTime()   { return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")).format(new Date()); }

	//usage:System.out.println(e);
	//usage:e.printStackTrace();

	public static void println(String stringforprint) {
//		System.out.println(stringforprint);
	}
}
