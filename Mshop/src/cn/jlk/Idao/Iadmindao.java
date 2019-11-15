package cn.jlk.Idao;


import cn.jlk.VO.Admin;
import cn.jlk.shopdao.IDAO;

public interface Iadmindao extends IDAO<String, Admin> {
	/**
	 * 本操作实现管理员的登录功能，在登陆完成之后需要将上一次的登录时间取出
	 * 传递的是一个vo类对象，所以直接将登陆日期设置到此对象中即可返回
	 * @param vo 包含有aid password的vo类对象
	 * @return 登录成功返回true，否则返回false
	 * @throws Exception
	 */
    public boolean getByLogin(Admin vo) throws Exception;
    /**
     * 本操作只需要更新最后一次的登陆日期，只需要传入的要更新的管理员编号即可
     * @param aid 要更新的管理员编号
     * @return 更新成功返回true，否则返回false
     * @throws Exception
     */
    public boolean doUpdateLastdate(String aid) throws Exception;
}
