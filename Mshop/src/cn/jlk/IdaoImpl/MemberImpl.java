package cn.jlk.IdaoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import cn.jlk.Idao.Imemberdao;
import cn.jlk.Util.AbstractDAOImpl;
import cn.jlk.VO.Member;
/**
 * member的真实实现类
 * @author JLK1104
 *
 */
public class MemberImpl extends AbstractDAOImpl implements Imemberdao{
	public MemberImpl(Connection conn) {
		super(conn);
	}

	@Override
	public boolean doCreate(Member vo) throws Exception {
		String sql="insert into member(mid,password,code,regdate,photo,status) values(?,?,?,?,?,?)";
		
		super.pstmt=super.conn.prepareStatement(sql);
		super.pstmt.setString(1, vo.getMid());
		super.pstmt.setString(2, vo.getPassword());
		super.pstmt.setString(3, vo.getCode());
		super.pstmt.setTimestamp(4, new Timestamp(vo.getRegdate().getTime()));
		super.pstmt.setString(5, vo.getPhoto());
		super.pstmt.setInt(6, vo.getStatus());
		return super.pstmt.executeUpdate()>0;
	}



	@Override
	public boolean doUpdate(Member vo) throws Exception {
		String sql="UPDATE SET password=?,name=?,photo=?,status=?,tel=?,address=? WHERE mid=?";
		super.pstmt=super.conn.prepareStatement(sql);
		super.pstmt.setString(1, vo.getPassword());
		super.pstmt.setString(2, vo.getName());
		super.pstmt.setString(3, vo.getPhoto());
		super.pstmt.setInt(4, vo.getStatus());
		super.pstmt.setString(5, vo.getTel());
		super.pstmt.setString(6, vo.getAddress());
		super.pstmt.setString(7, vo.getMid());
		return super.pstmt.executeUpdate()>0;
	}

	@Override
	public boolean doRemoveBatch(Set<String> ids) throws Exception {
		String sql= "DELETE FROM member WHERE mid=?";
		Iterator<String> iter= ids.iterator();
		while (iter.hasNext()) {
			super.pstmt=super.conn.prepareStatement(sql);
			super.pstmt.setString(1, iter.next());			
		}
		return super.pstmt.executeUpdate()>0;
	}

	@Override
	public Member findById(String id) throws Exception {
		Member vo=null;
		String sql="SELECT mid,password,name,tel,address,code,regdate,photo,status FROM member WHERE mid=?";
		super.pstmt=this.conn.prepareStatement(sql);
		super.pstmt.setString(1,id);
		ResultSet res=super.pstmt.executeQuery();
		if (res.next()) {
			vo=new Member();
			vo.setMid(res.getString(1));
			vo.setPassword(res.getString(2));
			vo.setName(res.getString(3));
			vo.setTel(res.getString(4));
			vo.setAddress(res.getString(5));
			vo.setCode(res.getString(6));
			vo.setRegdate(res.getTimestamp(7));
			vo.setPhoto(res.getString(8));
			vo.setStatus(res.getInt(9));
		}
		return vo;
	}

	@Override
	public List<Member> findAll() throws Exception {
		String sql="SELECT mid,password,code,regdate,photo FROM member";
		List<Member> all= new ArrayList<Member>();
		super.pstmt=super.conn.prepareStatement(sql);
		ResultSet res=super.pstmt.executeQuery();
		while (res.next()) {
			Member vo=new Member();
			vo.setMid(res.getString(1));
			vo.setPassword(res.getString(2));
			vo.setCode(res.getString(3));
			vo.setRegdate(res.getDate(4));
			vo.setPhoto(res.getString(5));
			all.add(vo);
		}	
		return all;
	}

	@Override
	public List<Member> findAllSplit(Integer currentPage, Integer linesize,
			String column, String keyword) throws Exception {
		List<Member> all=new ArrayList<Member>();
		String sql="SELECT mid,password,name,tel,address,status,code,regdate,photo FROM member WHERE "+ column +" LIKE ? LIMIT ?,? ";
		super.pstmt=super.conn.prepareStatement(sql);
		super.pstmt.setString(1, "%"+ keyword +"%");
		super.pstmt.setInt(2, (currentPage-1) * linesize);
		super.pstmt.setInt(3, linesize);
		ResultSet res=super.pstmt.executeQuery();
		while (res.next()) {
			Member vo=new Member();
			vo.setMid(res.getString(1));
			vo.setPassword(res.getString(2));
			vo.setName(res.getString(3));
			vo.setTel(res.getString(4));
			vo.setAddress(res.getString(5));
			vo.setStatus(res.getInt(6));
			vo.setCode(res.getString(7));
			vo.setRegdate(res.getTimestamp(8));
			vo.setPhoto(res.getString(9));
			all.add(vo);
		}
		return all;
	}

	@Override
	public Integer getAllCount(String column, String keyword) throws Exception {
		Integer in=null;
		String sql="select count(*) from member where "+column+" like ? ";
		super.pstmt=super.conn.prepareStatement(sql);
		super.pstmt.setString(1, "%"+keyword+"%");
		ResultSet res=super.pstmt.executeQuery();
		if (res.next()) {
			in=res.getInt(1);
		}
		return in;
	}

	@Override
	public boolean findByCode(String mid, String code) throws Exception {
		String sql="select count(*) from member where mid=? and code=? and status=2";
		super.pstmt=super.conn.prepareStatement(sql);
		super.pstmt.setString(1, mid);
		super.pstmt.setString(2, code);
		ResultSet res=pstmt.executeQuery();
		if (res.next()) {
			if (res.getInt(1)>0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean doUpdatestatus(String mid, Integer status) throws Exception {
		String sql="update member set status=? where mid=?";
		super.pstmt=super.conn.prepareStatement(sql);
		super.pstmt.setInt(1, status);
		super.pstmt.setString(2, mid);
		return super.pstmt.executeUpdate()>0;
	}

	@Override
	public Integer doCountStatus(Integer status,String column,String keyword) throws Exception {
		Integer in=null;
		String sql="select count(*) from member where status=? and "+ column +" like ? ";
		super.pstmt=super.conn.prepareStatement(sql);
		super.pstmt.setInt(1, status);
		super.pstmt.setString(2, "%"+keyword+"%");
		ResultSet res=super.pstmt.executeQuery();
		while (res.next()) {
			in=res.getInt(1);
		}
		return in;
	}

	@Override
	public boolean doUpdateByStatus(Set<String> all, Integer status)
			throws Exception {
		if (all.size()==0) {
			return false;
		}
		boolean flag=true;
		String sql="update member set status=? from mid=?";
		super.pstmt=super.conn.prepareStatement(sql);
		Iterator<String> iter=all.iterator();
		while (iter.hasNext()) {
			super.pstmt.setInt(1, status);
			super.pstmt.setString(2, iter.next());
			super.pstmt.addBatch();//增加到批处理之中
		}
		int result[]= super.pstmt.executeBatch();//进行批处理
		for(int x=0;x<result.length;x++){
			if (result[x]==0) {//没有数据进行更新 /*有一个数据没有被更新*/
				flag=false;
			}
		}
		return flag;
	}

	@Override
	public List<Member> findAllByStatus(Integer status, Integer currentPage,
			Integer linesize, String column, String keyword) throws Exception {
		List<Member> all=new ArrayList<Member>();
		String sql="SELECT mid,password,name,tel,address,status,code,regdate,photo FROM member WHERE status=? and "+ column +" LIKE ? LIMIT ?,? ";
		super.pstmt=super.conn.prepareStatement(sql);
		super.pstmt.setInt(1, status);
		super.pstmt.setString(2, "%"+keyword+"%");
		super.pstmt.setInt(3, (currentPage-1) * linesize);
		super.pstmt.setInt(4, linesize);
		ResultSet res=super.pstmt.executeQuery();
		while (res.next()) {
			Member vo=new Member();
			vo.setMid(res.getString(1));
			vo.setPassword(res.getString(2));
			vo.setName(res.getString(3));
			vo.setTel(res.getString(4));
			vo.setAddress(res.getString(5));
			vo.setStatus(res.getInt(6));
			vo.setCode(res.getString(7));
			vo.setRegdate(res.getTimestamp(8));
			vo.setPhoto(res.getString(9));
			all.add(vo);
		}
		return all;
	}
}
