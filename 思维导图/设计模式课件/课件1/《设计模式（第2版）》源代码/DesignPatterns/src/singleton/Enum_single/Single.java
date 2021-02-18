package singleton.Enum_single;

/**
 * @author zhou
 * @Description
 * @createTime 2020-08-29
 */
public class Single {

	private enum ins{
		INSTANCE;
		private Single single;
		ins(){
			single = new Single();
		}
		private Single getSingle(){
			return single;
		}
	}
	public static Single getInstance(){
		return ins.INSTANCE.getSingle();
	}

}
