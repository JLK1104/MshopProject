package cn.jlk.Util;

//��֤������
public class UtilsDemo {
	/**
	 * ��֤����������Ƿ�Ϊ��
	 * @param data ��������
	 * @return �������null����true�����򷵻�false
	 */
	public static boolean validateEmpty(String data){
		if (data==null||"".equals(data)) {
			return false;
		}else {
			return true;
		}
	}
	/**
	 * �������ݵ�������֤
	 * @param data Ҫ��֤������
	 * @param regex Ҫ��֤��������ʽ
	 * @return ��֤ͨ������true�����򷵻�false
	 */
	public static boolean validateRegex(String data,String regex){
		if (validateEmpty(data)) {//��֤ͨ������������֤
			return data.matches(regex);//������֤
		}else{
			return false;
		}
	}
	/**
	 * ��֤�����Ƿ���ͬ
	 * @param data1 ��֤������1
	 * @param data2 ��֤������2
	 * @return �����ͬ����true�����򷵻�false
	 */
	public static boolean validateSame(String data1,String data2){
		if (validateEmpty(data1)&&validateEmpty(data2)) {
			return data1.equalsIgnoreCase(data2);
		}else{
			return false;
		}
	}
	

}
