package com.java.util;

/**
 * �ڶ��Σ�
 * �����hash�㷨
 * 
 * @author lxh
 * 
 * �ֲ�ʽ ��ծ����
 * 
 * ѭ���㷨
 * ��ϣ�㷨
 * ���������㷨
 * ��Ӧ�ٶ��㷨
 * ��Ȩ��VIP
 *
 *
 */
public class TestHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 *  public native int hashCode(); ����  cд �Ŀ�����
		 *  
		 */
		Object j = null;
		
		
		
		String d =new String("hello");
		String e =new String("hello");
		System.out.println(d.hashCode());
		System.out.println(e.hashCode());
	}
	
	public void good(String str){
		System.out.println(str);
	}

}
