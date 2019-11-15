package cn.jlk.Service.back.Impl;

import cn.jlk.Factory.DAOFactory;
import cn.jlk.Service.back.IAdminServiceBack;
import cn.jlk.VO.Admin;
//业务层实现类
import cn.jlk.dbc.DataBaseConnection;
public class IAdminServiceBackImpl implements IAdminServiceBack {
	DataBaseConnection conn=new DataBaseConnection();
	@Override
	public boolean login(Admin vo) throws Exception {
		try {
			if (DAOFactory.getInstanceIadmindao(conn.getConnection()).getByLogin(vo)) {
				return DAOFactory.getInstanceIadmindao(conn.getConnection()).doUpdateLastdate(vo.getAid());
			}
			return false;
		} catch (Exception e) {
			throw e;
		}finally{
			this.conn.close();
		}
	}

//	@Override
//	public boolean insert(Member vo) throws Exception {
//		if (DAOFactory.getInstanceImemberdao(conn.getConnection()).findById(vo.getMid())==null) {
//			return DAOFactory.getInstanceImemberdao(conn.getConnection()).doCreate(vo);
//		}
//		return false;
//	}
//
//	@Override
//	public boolean update(Member vo) throws Exception {
//		return DAOFactory.getInstanceImemberdao(conn.getConnection()).doUpdate(vo);
//	}
//
//	@Override
//	public boolean delete(Set<String> ids) throws Exception {
//		return DAOFactory.getInstanceImemberdao(conn.getConnection()).doRemoveBatch(ids);
//	}
//
//	@Override
//	public Member get(String id) throws Exception {
//		return DAOFactory.getInstanceImemberdao(conn.getConnection()).findById(id);
//	}
//
//	@Override
//	public List<Member> getall() throws Exception {
//		return DAOFactory.getInstanceImemberdao(conn.getConnection()).findAll();
//	}

}
