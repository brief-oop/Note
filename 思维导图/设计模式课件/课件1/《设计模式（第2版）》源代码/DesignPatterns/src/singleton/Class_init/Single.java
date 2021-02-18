package singleton.Class_init;

/**
 * @author zhou
 * @Description
 * @createTime 2020-08-29
 */
public class Single {

	static class Single_inner{
		static  Single single = new Single();

	}
	public static Single getInstance(){
		return Single_inner.single;
	}
}
