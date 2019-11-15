package cn.jlk.test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.jlk.Factory.DAOFactory;
import cn.jlk.VO.Member;
import cn.jlk.dbc.DataBaseConnection;

//Imemberdao中findAllSplit()方法的测试
public class TestSplitPage {
	public static void main(String[] args) {
		int currentPage=2;
		int linesize=5;
		String column="mid";//根据mid查找			
		String keyword="";//表示查询全部
		DataBaseConnection conn=new DataBaseConnection();
		List<Member> list=new ArrayList<Member>();
		try {
			list=DAOFactory.getInstanceImemberdao(conn.getConnection()).findAllSplit(currentPage, linesize, column, keyword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Member vo=null;
		Iterator<Member> iterator=list.iterator();
		while (iterator.hasNext()) {
			vo=new Member();
			vo=(Member)iterator.next();
			System.out.println(vo.getMid());
		}
		
		
	}

}
