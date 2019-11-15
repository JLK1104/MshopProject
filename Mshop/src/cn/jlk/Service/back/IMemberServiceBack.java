package cn.jlk.Service.back;

import java.util.Map;
import java.util.Set;

public interface IMemberServiceBack {
	/**
	 * 进行全部用户的分页数据显示，要调用Imemberdao中的如下方法：<br>
	 * <li> 调用Imemberdao中的findAll()方法，查询出全部的数据</li>
	 * <li> 调用Imemberdao中的getAllCount()方法，统计全部数据量</li> 
	 * @param cloumn 模糊查询列
	 * @param keyword 模糊查询关键字
	 * @param currenPage 当前所在页
	 * @param linesize 每页显示的数据量
	 * @return 由于要返回的数据有list和Integer两种类型，所以使用Map返回，包含如下内容：<br>
	 *     <li>key=allMembers、value=findAllSplit()</li>
	 *     <li>key=allRecoders、value=getAllcount()</li>
	 * @throws Exception
	 */
	public Map<String , Object> list(int currentPage,int linesize,
			 String column,String keyword) throws Exception;
	/**
	 * 批量用户状态激活
	 * @param status status=1时为激活状态
	 * @return 激活成功返回true，否则返回false
	 * @throws Exception
	 */
	public boolean updateActive(Set<String> all) throws Exception;
	/**
	 * 批量用户状态锁定
	 * @param status status=0时为锁定状态
	 * @return 锁定成功返回true，否则返回false
	 * @throws Exception
	 */
	public boolean updateLock(Set<String> all) throws Exception;
	/**
	 * 根据用户状态进行分页数据显示，要调用Imemberdao中的如下方法：<br>
	 * <li> 调用Imemberdao中的findAllByStatus()方法，根据用户状态查询出全部的数据</li>
	 * <li> 调用Imemberdao中的doCountStatus()方法，统计各个状态数据量</li>
	 * @param status 用户状态
	 * @param cloumn 模糊查询列
	 * @param keyword 模糊查询关键字
	 * @param currenPage 当前所在页
	 * @param linesize 每页显示的数据量
	 * @return 由于要返回的数据有list和Integer两种类型，所以使用Map返回，包含如下内容：<br>
	 *     <li>key=allMembers、value=findAllByStatus()</li>
	 *     <li>key=allRecoders、value=doCountStatus()</li>
	 * @throws Exception
	 */
	public Map<String, Object> getListByStatus(int status,int currentPage,int linesize,
			 String column,String keyword) throws Exception;

}
