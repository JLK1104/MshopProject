package cn.jlk.Service.front;

import cn.jlk.VO.Member;

public interface IMemberServiceFront {
	/**
	 * ʵ���û���ע�������Ҫ�ṩ��mid��password��regdate��code��status��������<br>
	 * �����򽫵������µļ�������:<br>
	 *  <li>����Imemberdao�е�findById�����ж�ע��mid�Ƿ����</li>
	 *  <li>����Imemberdao��doCreate�������������Ϣ</li>
	 * @param vo ������ע����Ϣ��vo����
	 * @return ע��ɹ����� true ���򷵻� false
	 * @throws Exception
	 */
	public boolean regist(Member vo) throws Exception;
    /**
     * ʵ���û��ļ��������ֻ�м������û��ſ��Ե�¼��������Ҫ�������¹��ܣ�<br>
     *   <li>����Imemberdao.findByCode()�����ж��û��ļ������Ƿ���ȷ</li>
     *   <li>����Imemberdao.doUpdatestatus()�����޸��û�״̬</li>
     * @param vo ������mid��code����
     * @return ����ɹ�����true�����򷵻�false
     * @throws Exception
     */
	public boolean active(Member vo) throws Exception;
	/**
	 * ʵ���û��ĵ�¼����������Imemberdao.findById()����
	 * @param vo Ҫʵ�ֵ�¼��vo���󣬰���mid password��Ϣ
	 * @return ��½�ɹ�����true�����򷵻�false
	 * @throws Exception
	 */
	public Member login(String mid) throws Exception;
    
}
