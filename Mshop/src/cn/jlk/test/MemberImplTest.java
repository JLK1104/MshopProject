package cn.jlk.test;



import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;

import cn.jlk.Factory.FrontServiceFactory;
import cn.jlk.VO.Member;

public class MemberImplTest {
	@Test
	public void testDoCreate() {
			Member vo=new Member();
			vo.setMid("134004");
			vo.setPassword("jlk134002");
			vo.setRegdate(new Date());
			vo.setStatus(2);
		try {
			TestCase.assertTrue(FrontServiceFactory.getInstanceIfrontService().regist(vo));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
