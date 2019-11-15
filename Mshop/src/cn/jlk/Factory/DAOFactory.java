package cn.jlk.Factory;

import java.sql.Connection;

import cn.jlk.Idao.Iadmindao;
import cn.jlk.Idao.Imemberdao;
import cn.jlk.IdaoImpl.AdminImpl;
import cn.jlk.IdaoImpl.MemberImpl;

//���ݲ㹤����
public class DAOFactory {
	//�û�ʵ����
	public static Imemberdao getInstanceImemberdao(Connection conn){
		return new MemberImpl(conn);
	}
	//����Աʵ����
	public static Iadmindao getInstanceIadmindao(Connection conn){
		return new AdminImpl(conn);
	}

}
