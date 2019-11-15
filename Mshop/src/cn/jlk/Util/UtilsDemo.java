package cn.jlk.Util;

//验证工具类
public class UtilsDemo {
	/**
	 * 验证输入的数据是否为空
	 * @param data 输入数据
	 * @return 如果不是null返回true，否则返回false
	 */
	public static boolean validateEmpty(String data){
		if (data==null||"".equals(data)) {
			return false;
		}else {
			return true;
		}
	}
	/**
	 * 进行数据的正则验证
	 * @param data 要验证的数据
	 * @param regex 要验证的正则表达式
	 * @return 验证通过返回true，否则返回false
	 */
	public static boolean validateRegex(String data,String regex){
		if (validateEmpty(data)) {//验证通过进行正则验证
			return data.matches(regex);//正则验证
		}else{
			return false;
		}
	}
	/**
	 * 验证数据是否相同
	 * @param data1 验证的数据1
	 * @param data2 验证的数据2
	 * @return 如果相同返回true，否则返回false
	 */
	public static boolean validateSame(String data1,String data2){
		if (validateEmpty(data1)&&validateEmpty(data2)) {
			return data1.equalsIgnoreCase(data2);
		}else{
			return false;
		}
	}
	

}
