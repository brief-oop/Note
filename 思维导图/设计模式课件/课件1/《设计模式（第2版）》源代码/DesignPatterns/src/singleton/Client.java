package singleton;


import singleton.Class_init.Single;

public class Client {
//	public static void main(String a[])
//	{
//	   PrintSpoolerSingleton ps1,ps2;
//	   try
//	   {
//	        ps1=PrintSpoolerSingleton.getInstance();
//	        ps1.manageJobs();
//	   }
//	   catch(PrintSpoolerException e)
//	   {
//	   	    System.out.println(e.getMessage());
//	   }
//    	    System.out.println("--------------------------");
//	   try
//	   {
//	       ps2=PrintSpoolerSingleton.getInstance();
//	       ps2.manageJobs();
//	   }
//	   catch(PrintSpoolerException e)
//	   {
//	       System.out.println(e.getMessage());
//	   }
//	}
	public static void main(String[] args) {
		/*Single instance1 = Single.getInstance();
		Single instance2 = Single.getInstance();
		System.out.println(instance1 == instance2);
*/
		Single instance1 = Single.getInstance();
		Single instance2 = Single.getInstance();
		System.out.println(instance1 == instance2);

	}
}

