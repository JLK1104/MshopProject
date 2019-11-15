package cn.jlk.Service.front;

import cn.jlk.VO.Member;

public interface IMemberServiceFront {
	/**
	 * 实现用户的注册操作，要提供有mid、password、regdate、code、status几个数据<br>
	 * 本程序将调用如下的几个操作:<br>
	 *  <li>调用Imemberdao中的findById方法判断注册mid是否存在</li>
	 *  <li>调用Imemberdao中doCreate方法保存基本信息</li>
	 * @param vo 包含有注册信息的vo对象
	 * @return 注册成功返回 true 否则返回 false
	 * @throws Exception
	 */
	public boolean regist(Member vo) throws Exception;
    /**
     * 实现用户的激活操作，只有激活后的用户才可以登录，本操作要调用如下功能：<br>
     *   <li>调用Imemberdao.findByCode()方法判断用户的激活码是否正确</li>
     *   <li>调用Imemberdao.doUpdatestatus()方法修改用户状态</li>
     * @param vo 包含有mid和code数据
     * @return 激活成功返回true，否则返回false
     * @throws Exception
     */
	public boolean active(Member vo) throws Exception;
	/**
	 * 实现用户的登录操作，利用Imemberdao.findById()方法
	 * @param vo 要实现登录的vo对象，包含mid password信息
	 * @return 登陆成功返回true，否则返回false
	 * @throws Exception
	 */
	public Member login(String mid) throws Exception;
    
}
