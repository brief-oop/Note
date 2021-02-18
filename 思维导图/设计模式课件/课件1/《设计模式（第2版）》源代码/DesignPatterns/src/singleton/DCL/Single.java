package singleton.DCL;

/**
 * @author zhou
 * @Description
 * @createTime 2020-08-29
 */
public class Single {
	private volatile static  Single single;
	public static Object getObject(){
		if( single == null){
			synchronized (Single.class){
				if(single == null){
					single = new Single();
				}
			}
		}
		return single;
	}
}
