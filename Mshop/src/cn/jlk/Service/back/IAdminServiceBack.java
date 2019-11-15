package cn.jlk.Service.back;

import cn.jlk.VO.Admin;

//后台业务层接口
public interface IAdminServiceBack {
    /**
     * 实现管理员的登录功能，并且更新最后一次的登录时间
     * <li>使用Iadmindao.getByLogin()方法</li>
     * <li>使用Iadmindao.doUpdateLastdate()方法,更新最后一次登录日期</li>
     * @param vo 要操作的vo对象
     * @return 登陆成功返回true，否则返回false
     * @throws Exception
     */
    public boolean login(Admin vo)throws Exception;
}
