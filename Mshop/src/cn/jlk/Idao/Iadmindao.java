package cn.jlk.Idao;


import cn.jlk.VO.Admin;
import cn.jlk.shopdao.IDAO;

public interface Iadmindao extends IDAO<String, Admin> {
	/**
	 * ������ʵ�ֹ���Ա�ĵ�¼���ܣ��ڵ�½���֮����Ҫ����һ�εĵ�¼ʱ��ȡ��
	 * ���ݵ���һ��vo���������ֱ�ӽ���½�������õ��˶����м��ɷ���
	 * @param vo ������aid password��vo�����
	 * @return ��¼�ɹ�����true�����򷵻�false
	 * @throws Exception
	 */
    public boolean getByLogin(Admin vo) throws Exception;
    /**
     * ������ֻ��Ҫ�������һ�εĵ�½���ڣ�ֻ��Ҫ�����Ҫ���µĹ���Ա��ż���
     * @param aid Ҫ���µĹ���Ա���
     * @return ���³ɹ�����true�����򷵻�false
     * @throws Exception
     */
    public boolean doUpdateLastdate(String aid) throws Exception;
}
