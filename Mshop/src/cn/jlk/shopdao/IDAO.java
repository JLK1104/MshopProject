package cn.jlk.shopdao;

import java.util.List;
import java.util.Set;


/**
 * 定义公共的DAO操作标准
 * @author JLK1104
 * @param <K>表示要操作的主键类型，由子接口实现
 * @param <V>要操作的VO类型，由子类实现
 */
public interface IDAO<K,V> {
	
	/**
	 * 实现数据的增加操作
	 * @param vo 包含了要增加数据的vo对象
	 * @return 数据保存成功返回 T 否则返回 F
	 * @throws Exception SQL执行异常
	 */
	public boolean doCreate(V vo)throws Exception;
	/**
	 * 实现数据的修改操作，本次修改是根据ID进行全部字段的修改
	 * @param vo 包含了要修改数据的信息，一定要提供有ID内容
	 * @return 成功T 失败F
	 * @throws Exception SQL执行异常
	 */
	public boolean doUpdate(V vo)throws Exception;
	/**
	 * 执行数据的批量删除操作，所有要删除的数据以Set集合形式保存
	 * @param ids 包含了所有要删除数据的ID不包含重复内容
	 * @return 删除成功返回T 否则返回F
	 * @throws Exception SQL执行异常
	 */
	public boolean doRemoveBatch(Set<K> ids)throws Exception;
	/**
	 * 根据学生号查询指定学生信息
	 * @param id 要查询的学生号
	 * @return 如果学生信息存在，则将数据以VO对象的形式返回，如果不在返回null
	 * @throws Exception  SQL执行异常
	 */
	public V findById(K id)throws Exception;
	/**
	 * 查询数据表的全部内容
	 * @return 以set集合的形式返回
	 * @throws Exception  SQL执行异常
	 */
	public List<V> findAll()throws Exception;
	/**
	 * 分页进行数据的模糊查询查询以集合的形式返回
	 * @param currentPage 当前所在的页
	 * @param linesize 每页显示的数据行数
	 * @param column 要进行模糊查询的数据列
	 * @param keyword 模糊查询的关键字
	 * @return 以set集合的形式返回
	 * @throws Exception  SQL执行异常
	 */
	public List<V> findAllSplit(Integer currentPage,Integer linesize, 
			String column, String keyword)throws Exception;
	/**
	 * 进行模糊查询数据量的统计，如果表中没有记录返回0
	 * @param column 要进行模糊查询的数据列
	 * @param keyword 模糊查询的关键字
	 * @return 返回表中的数据量，如果没有数据返回0
	 * @throws Exception SQL执行异常
	 */
	public Integer getAllCount(String column, String keyword)throws Exception;
}
