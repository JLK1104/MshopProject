package cn.jlk.Service.back;

import cn.jlk.VO.Admin;

//��̨ҵ���ӿ�
public interface IAdminServiceBack {
    /**
     * ʵ�ֹ���Ա�ĵ�¼���ܣ����Ҹ������һ�εĵ�¼ʱ��
     * <li>ʹ��Iadmindao.getByLogin()����</li>
     * <li>ʹ��Iadmindao.doUpdateLastdate()����,�������һ�ε�¼����</li>
     * @param vo Ҫ������vo����
     * @return ��½�ɹ�����true�����򷵻�false
     * @throws Exception
     */
    public boolean login(Admin vo)throws Exception;
}
