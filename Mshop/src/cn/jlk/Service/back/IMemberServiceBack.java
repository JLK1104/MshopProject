package cn.jlk.Service.back;

import java.util.Map;
import java.util.Set;

public interface IMemberServiceBack {
	/**
	 * ����ȫ���û��ķ�ҳ������ʾ��Ҫ����Imemberdao�е����·�����<br>
	 * <li> ����Imemberdao�е�findAll()��������ѯ��ȫ��������</li>
	 * <li> ����Imemberdao�е�getAllCount()������ͳ��ȫ��������</li> 
	 * @param cloumn ģ����ѯ��
	 * @param keyword ģ����ѯ�ؼ���
	 * @param currenPage ��ǰ����ҳ
	 * @param linesize ÿҳ��ʾ��������
	 * @return ����Ҫ���ص�������list��Integer�������ͣ�����ʹ��Map���أ������������ݣ�<br>
	 *     <li>key=allMembers��value=findAllSplit()</li>
	 *     <li>key=allRecoders��value=getAllcount()</li>
	 * @throws Exception
	 */
	public Map<String , Object> list(int currentPage,int linesize,
			 String column,String keyword) throws Exception;
	/**
	 * �����û�״̬����
	 * @param status status=1ʱΪ����״̬
	 * @return ����ɹ�����true�����򷵻�false
	 * @throws Exception
	 */
	public boolean updateActive(Set<String> all) throws Exception;
	/**
	 * �����û�״̬����
	 * @param status status=0ʱΪ����״̬
	 * @return �����ɹ�����true�����򷵻�false
	 * @throws Exception
	 */
	public boolean updateLock(Set<String> all) throws Exception;
	/**
	 * �����û�״̬���з�ҳ������ʾ��Ҫ����Imemberdao�е����·�����<br>
	 * <li> ����Imemberdao�е�findAllByStatus()�����������û�״̬��ѯ��ȫ��������</li>
	 * <li> ����Imemberdao�е�doCountStatus()������ͳ�Ƹ���״̬������</li>
	 * @param status �û�״̬
	 * @param cloumn ģ����ѯ��
	 * @param keyword ģ����ѯ�ؼ���
	 * @param currenPage ��ǰ����ҳ
	 * @param linesize ÿҳ��ʾ��������
	 * @return ����Ҫ���ص�������list��Integer�������ͣ�����ʹ��Map���أ������������ݣ�<br>
	 *     <li>key=allMembers��value=findAllByStatus()</li>
	 *     <li>key=allRecoders��value=doCountStatus()</li>
	 * @throws Exception
	 */
	public Map<String, Object> getListByStatus(int status,int currentPage,int linesize,
			 String column,String keyword) throws Exception;

}
