package cn.jlk.Idao;

import java.util.List;
import java.util.Set;

import cn.jlk.VO.Member;
import cn.jlk.shopdao.IDAO;

public interface Imemberdao extends IDAO<String, Member>{
	/**
	 * �жϸ�����mid�������code�Ƿ���ͬ
	 * @param mid �˻�Ҫ�����mid
	 * @param code �˻�������
	 * @return ����û�ID�ͼ�����ƥ�䷵��true�����򷵻�false
	 * @throws Exception
	 */
	public boolean findByCode(String mid,String code) throws Exception;
	/**
	 * �����û���״̬
	 * @param mid �û�id
	 * @param status �û�״̬��0��ʾ������1��ʾ���2��ʾ�����
	 * @return ���³ɹ�����true�����򷵻�false
	 * @throws Exception
	 */
    public boolean doUpdatestatus(String mid,Integer status) throws Exception;
    /**
     * �����û�״̬ͳ������
     * @param status �û�״̬
     * @return ����ͳ���������
     * @throws Exception 
     */
    public Integer doCountStatus(Integer status,String column,String keyword) throws Exception;
    /**
     * ���������û�״̬
     * @param mid �û�ID
     * @param status �û�״̬
     * @return �޸ĳɹ�����true�����򷵻�false
     * @throws Exception
     */
    public boolean doUpdateByStatus(Set<String> all,Integer status) throws Exception;
    /**
     * �����û�״̬��ҳ
     * @param status �û�״̬��Ϊ3�֣�0,1,2��
     * @param currentPage ��ǰ����ҳ
     * @param linesize ÿҳ��ʾ����
     * @param column ģ����ѯ��
     * @param keyword ģ����ѯ�ؼ���
     * @return ��ѯ�ɹ�����list����
     * @throws Exception
     */
    public List<Member> findAllByStatus(Integer status,Integer currentPage,
    		Integer linesize,String column,String keyword) throws Exception;
}
