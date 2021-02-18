package strategy;

public class Client
{
	public static void main(String args[])
	{
//	   int arr[]={1,4,6,2,5,3,7,10,9};
//	   int result[];
//	   ArrayHandler ah=new ArrayHandler();
//
//	   Sort sort;
//       sort=(Sort)XMLUtil.getBean(); // <className>strategy.BubbleSort</className>
//
//       ah.setSortObj(sort); //设置具体策略
//       result=ah.sort(arr);
//
//       for(int i=0;i<result.length;i++)
//       {
//       	    System.out.print(result[i] + ",");
//       }
		long l = System.currentTimeMillis();
		new A().run();
		new A().run();
		System.out.println((System.currentTimeMillis()-l)/1000);
	}
	static class A extends Thread{
		@Override
		public void run() {
			try {
				Thread.sleep(2000);
				System.out.println(123);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}