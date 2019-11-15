package cn.jlk.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 定义数据库连接类
 * @author JLK1104
 */
public class DataBaseConnection {
	private final String DRIVER="org.gjt.mm.mysql.Driver";
	private final String URL="jdbc:mysql://localhost:3306/mshop?zeroDateTimeBehavior=convertToNull";
	private final String USERNAME="root";
	private final String PASSWORD="";
	private Connection conn;
	public DataBaseConnection() {
		try {
			Class.forName(DRIVER);
			this.conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		return this.conn;
	}
	public void close(){
		if (this.conn!=null) {
			try {
				this.conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
