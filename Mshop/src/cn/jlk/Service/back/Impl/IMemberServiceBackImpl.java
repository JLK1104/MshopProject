package cn.jlk.Service.back.Impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import cn.jlk.Factory.DAOFactory;
import cn.jlk.Service.back.IMemberServiceBack;
import cn.jlk.dbc.DataBaseConnection;

public class IMemberServiceBackImpl implements IMemberServiceBack {
	DataBaseConnection conn=new DataBaseConnection();
	@Override
	public Map<String, Object> list(int currentPage,int linesize,
			 String column,String keyword) throws Exception {
		try {
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("allMembers", DAOFactory.getInstanceImemberdao(conn.getConnection()).findAllSplit(currentPage, linesize, column, keyword));
			map.put("allRecorders", DAOFactory.getInstanceImemberdao(conn.getConnection()).getAllCount(column, keyword));
			return map;
		} catch (Exception e) {
			throw e;
		}finally{
			this.conn.close();
		}
	}
	@Override
	public boolean updateActive(Set<String> all) throws Exception {
		try {
			return DAOFactory.getInstanceImemberdao(conn.getConnection()).doUpdateByStatus(all, 1);
		} catch (Exception e) {
			throw e;
		}finally{
			this.conn.close();
		}
	}
	@Override
	public boolean updateLock(Set<String> all) throws Exception {
		try {
			return DAOFactory.getInstanceImemberdao(conn.getConnection()).doUpdateByStatus(all, 0);
		} catch (Exception e) {
			throw e;
		}finally{
			this.conn.close();
		}
	}
	@Override
	public Map<String, Object> getListByStatus(int status,int currentPage, int linesize,
			String column, String keyword) throws Exception {
		try {
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("allMembers", DAOFactory.getInstanceImemberdao(conn.getConnection()).findAllByStatus(status,currentPage, linesize, column, keyword));
			map.put("allRecorders", DAOFactory.getInstanceImemberdao(conn.getConnection()).doCountStatus(status,column,keyword));
			return map;
		} catch (Exception e) {
			throw e;
		}finally{
			this.conn.close();
		}
	}

}
