package cn.jlk.Service.front.Impl;

import cn.jlk.Factory.DAOFactory;
import cn.jlk.Service.front.IMemberServiceFront;
import cn.jlk.VO.Member;
import cn.jlk.dbc.DataBaseConnection;

public class IMemberServiceFrontImpl implements IMemberServiceFront {
	DataBaseConnection conn=new DataBaseConnection();
	@Override
	public boolean regist(Member vo) throws Exception {
		try {
			//System.out.println(MemberFactory.getInstanceImemberdao(conn.getConnection()).findById(vo.getMid())==null);
			if (DAOFactory.getInstanceImemberdao(conn.getConnection()).findById(vo.getMid())==null) {
			return DAOFactory.getInstanceImemberdao(conn.getConnection()).doCreate(vo);
		}
		return false;
		} catch (Exception e) {
			throw e;
		}finally{
			this.conn.close();
		}
		
	}
	@Override
	public boolean active(Member vo) throws Exception {
		try {
			if (DAOFactory.getInstanceImemberdao(conn.getConnection()).findByCode(vo.getMid(), vo.getCode())) {
				return DAOFactory.getInstanceImemberdao(conn.getConnection()).doUpdatestatus(vo.getMid(), 1);			
			}
		    return false;
		} catch (Exception e) {
			throw e;
		}finally{
			this.conn.close();
	    }
	}
	@Override
	public Member login(String mid) throws Exception {
		try {
			Member vo=new Member();
			vo= DAOFactory.getInstanceImemberdao(conn.getConnection()).findById(mid);
			return vo;
		} catch (Exception e) {
			throw e;
		}finally{
			this.conn.close();
	    }	
	}
}
