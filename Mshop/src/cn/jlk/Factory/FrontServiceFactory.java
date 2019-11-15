package cn.jlk.Factory;

import cn.jlk.Service.front.IMemberServiceFront;
import cn.jlk.Service.front.Impl.IMemberServiceFrontImpl;

public class FrontServiceFactory {
	public static IMemberServiceFront getInstanceIfrontService(){
		return new IMemberServiceFrontImpl();
	}
}
