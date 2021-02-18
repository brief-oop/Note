package singleton.DCL;

/**
 * @author zhou
 * @Description
 * @createTime 2020-08-29
 */
public class Client {


	public static void main(String[] args) {
		Object o1 = Single.getObject();
		Object o2 = Single.getObject();
		System.out.println(o1 == o2);

	}
}
