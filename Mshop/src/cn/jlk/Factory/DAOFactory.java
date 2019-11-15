package cn.jlk.Factory;

import java.sql.Connection;

import cn.jlk.Idao.Iadmindao;
import cn.jlk.Idao.Imemberdao;
import cn.jlk.IdaoImpl.AdminImpl;
import cn.jlk.IdaoImpl.MemberImpl;

//数据层工厂类
public class DAOFactory {
	//用户实例化
	public static Imemberdao getInstanceImemberdao(Connection conn){
		return new MemberImpl(conn);
	}
	//管理员实例化
	public static Iadmindao getInstanceIadmindao(Connection conn){
		return new AdminImpl(conn);
	}

}
