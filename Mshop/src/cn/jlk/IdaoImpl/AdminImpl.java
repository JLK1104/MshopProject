package cn.jlk.IdaoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;

import cn.jlk.Idao.Iadmindao;
import cn.jlk.Util.AbstractDAOImpl;
import cn.jlk.Util.MD5Util;
import cn.jlk.VO.Admin;

public class AdminImpl extends AbstractDAOImpl implements Iadmindao {
	public AdminImpl(Connection conn) {
		super(conn);
	}

	@Override
	public boolean doCreate(Admin vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doUpdate(Admin vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemoveBatch(Set<String> ids) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Admin findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> findAllSplit(Integer currentPage, Integer linesize,
			String column, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getAllCount(String column, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getByLogin(Admin vo) throws Exception {
		String sql="SELECT lastdate FROM admin WHERE aid=? and password=?";
		super.pstmt=super.conn.prepareStatement(sql);
		super.pstmt.setString(1, vo.getAid());
		super.pstmt.setString(2, MD5Util.MD5Encode(vo.getPassword(), "UTF8"));
		ResultSet res=super.pstmt.executeQuery();
		if (res.next()) {
			vo.setLastdate(res.getTimestamp(1));
			return true;
		}
		return false;
	}

	@Override
	public boolean doUpdateLastdate(String aid) throws Exception {
		String sql="UPDATE admin SET lastdate=? WHERE aid=?";
		super.pstmt=super.conn.prepareStatement(sql);
		super.pstmt.setTimestamp(1, new Timestamp(new Date().getTime()));
		super.pstmt.setString(2, aid);
		return super.pstmt.executeUpdate()>0;
	}

}
