package cn.jlk.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Set;

public abstract class AbstractDAOImpl {
	protected Connection conn;
	protected PreparedStatement pstmt;
	public AbstractDAOImpl(Connection conn) {
		this.conn=conn;
	}
	/**
	 * 实现数据的批量删除，这个时候的批量删除属于彻底删除功能
	 * @param table 表名称
	 * @param column 删除表的列名称
	 * @param ids 所有的id数据，使用set集合可以避免重复
	 * @return 删除成功返回true，否则返回false
	 * @throws Exception
	 */
	public boolean removeHandle(String table,String column,Set<?> ids) throws Exception {
		if (ids.size()==0) {//为空
			return false;
		}
		Iterator<?> iter =ids.iterator();
		StringBuffer buf=new StringBuffer();
		buf.append("DELETE FROM ").append(table).append(" WHERE ")
		.append(column).append(" IN ( ");
		while (iter.hasNext()) {
			buf.append(iter.next()).append(",");	
		}
		buf.delete(buf.length()-1, buf.length()).append(")");
		this.pstmt=this.conn.prepareStatement(buf.toString());
		return this.pstmt.executeUpdate()>0;
	}
	/**
	 * 负责统计出数据量
	 * @param table  要查询的数据表
	 * @param column 模糊查询的数据列
	 * @param keyword 模糊查询的关键字
	 * @return 返回指定表的数据量，没有数据返回0
	 */
	public Integer countHandle(String table,String column,String keyword) throws Exception{
		StringBuffer sql= new StringBuffer();
		sql.append("SELECT COUNT(*) FROM ").append(table).append("WHERE").append(column).append("LIKE ?");
		this.pstmt=this.conn.prepareStatement(sql.toString());
		this.pstmt.setString(1, "%"+keyword+"%");
		ResultSet res=this.pstmt.executeQuery();
		if (res.next()) {
			return res.getInt(1);
		}
	    return 0;
	}
}
