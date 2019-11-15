package cn.jlk.Idao;

import java.util.List;
import java.util.Set;

import cn.jlk.VO.Member;
import cn.jlk.shopdao.IDAO;

public interface Imemberdao extends IDAO<String, Member>{
	/**
	 * 判断给定的mid与给定的code是否相同
	 * @param mid 账户要激活的mid
	 * @param code 账户激活码
	 * @return 如果用户ID和激活码匹配返回true，否则返回false
	 * @throws Exception
	 */
	public boolean findByCode(String mid,String code) throws Exception;
	/**
	 * 更新用户的状态
	 * @param mid 用户id
	 * @param status 用户状态（0表示锁定，1表示激活，2表示待激活）
	 * @return 更新成功返回true，否则返回false
	 * @throws Exception
	 */
    public boolean doUpdatestatus(String mid,Integer status) throws Exception;
    /**
     * 根据用户状态统计人数
     * @param status 用户状态
     * @return 返回统计完的人数
     * @throws Exception 
     */
    public Integer doCountStatus(Integer status,String column,String keyword) throws Exception;
    /**
     * 批量更改用户状态
     * @param mid 用户ID
     * @param status 用户状态
     * @return 修改成功返回true，否则返回false
     * @throws Exception
     */
    public boolean doUpdateByStatus(Set<String> all,Integer status) throws Exception;
    /**
     * 根据用户状态分页
     * @param status 用户状态分为3种（0,1,2）
     * @param currentPage 当前所在页
     * @param linesize 每页显示行数
     * @param column 模糊查询列
     * @param keyword 模糊查询关键字
     * @return 查询成功返回list集合
     * @throws Exception
     */
    public List<Member> findAllByStatus(Integer status,Integer currentPage,
    		Integer linesize,String column,String keyword) throws Exception;
}
