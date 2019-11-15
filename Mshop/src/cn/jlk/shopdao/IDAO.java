package cn.jlk.shopdao;

import java.util.List;
import java.util.Set;


/**
 * ���幫����DAO������׼
 * @author JLK1104
 * @param <K>��ʾҪ�������������ͣ����ӽӿ�ʵ��
 * @param <V>Ҫ������VO���ͣ�������ʵ��
 */
public interface IDAO<K,V> {
	
	/**
	 * ʵ�����ݵ����Ӳ���
	 * @param vo ������Ҫ�������ݵ�vo����
	 * @return ���ݱ���ɹ����� T ���򷵻� F
	 * @throws Exception SQLִ���쳣
	 */
	public boolean doCreate(V vo)throws Exception;
	/**
	 * ʵ�����ݵ��޸Ĳ����������޸��Ǹ���ID����ȫ���ֶε��޸�
	 * @param vo ������Ҫ�޸����ݵ���Ϣ��һ��Ҫ�ṩ��ID����
	 * @return �ɹ�T ʧ��F
	 * @throws Exception SQLִ���쳣
	 */
	public boolean doUpdate(V vo)throws Exception;
	/**
	 * ִ�����ݵ�����ɾ������������Ҫɾ����������Set������ʽ����
	 * @param ids ����������Ҫɾ�����ݵ�ID�������ظ�����
	 * @return ɾ���ɹ�����T ���򷵻�F
	 * @throws Exception SQLִ���쳣
	 */
	public boolean doRemoveBatch(Set<K> ids)throws Exception;
	/**
	 * ����ѧ���Ų�ѯָ��ѧ����Ϣ
	 * @param id Ҫ��ѯ��ѧ����
	 * @return ���ѧ����Ϣ���ڣ���������VO�������ʽ���أ�������ڷ���null
	 * @throws Exception  SQLִ���쳣
	 */
	public V findById(K id)throws Exception;
	/**
	 * ��ѯ���ݱ��ȫ������
	 * @return ��set���ϵ���ʽ����
	 * @throws Exception  SQLִ���쳣
	 */
	public List<V> findAll()throws Exception;
	/**
	 * ��ҳ�������ݵ�ģ����ѯ��ѯ�Լ��ϵ���ʽ����
	 * @param currentPage ��ǰ���ڵ�ҳ
	 * @param linesize ÿҳ��ʾ����������
	 * @param column Ҫ����ģ����ѯ��������
	 * @param keyword ģ����ѯ�Ĺؼ���
	 * @return ��set���ϵ���ʽ����
	 * @throws Exception  SQLִ���쳣
	 */
	public List<V> findAllSplit(Integer currentPage,Integer linesize, 
			String column, String keyword)throws Exception;
	/**
	 * ����ģ����ѯ��������ͳ�ƣ��������û�м�¼����0
	 * @param column Ҫ����ģ����ѯ��������
	 * @param keyword ģ����ѯ�Ĺؼ���
	 * @return ���ر��е������������û�����ݷ���0
	 * @throws Exception SQLִ���쳣
	 */
	public Integer getAllCount(String column, String keyword)throws Exception;
}
