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
	 * ʵ�����ݵ�����ɾ�������ʱ�������ɾ�����ڳ���ɾ������
	 * @param table ������
	 * @param column ɾ�����������
	 * @param ids ���е�id���ݣ�ʹ��set���Ͽ��Ա����ظ�
	 * @return ɾ���ɹ�����true�����򷵻�false
	 * @throws Exception
	 */
	public boolean removeHandle(String table,String column,Set<?> ids) throws Exception {
		if (ids.size()==0) {//Ϊ��
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
	 * ����ͳ�Ƴ�������
	 * @param table  Ҫ��ѯ�����ݱ�
	 * @param column ģ����ѯ��������
	 * @param keyword ģ����ѯ�Ĺؼ���
	 * @return ����ָ�������������û�����ݷ���0
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
