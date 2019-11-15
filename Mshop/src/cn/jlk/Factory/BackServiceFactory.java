package cn.jlk.Factory;

import cn.jlk.Service.back.*;
import cn.jlk.Service.back.Impl.IAdminServiceBackImpl;
import cn.jlk.Service.back.Impl.IMemberServiceBackImpl;
//ҵ��㹤����
public class BackServiceFactory {
	public static IAdminServiceBack getInstanceIAdminServiceBack(){
		return new IAdminServiceBackImpl();
	}
	public static IMemberServiceBack getInstanceIMemberServiceBack(){
		return new IMemberServiceBackImpl(); 
	}
}
