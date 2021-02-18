package proxy;

public class Client
{
	public static void main(String args[])
	{
		AbstractPermission permission;
		permission=(AbstractPermission)XMLUtil.getBean();   //<className>proxy.PermissionProxy</className>
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();
		System.out.println("----------------------------");
		permission.setLevel(1);
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();
	} 
}