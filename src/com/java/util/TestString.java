package com.java.util;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a =null;
		StringBuilder b =null;
		String c = null;
		
		
	 	/**
	 	 * true
	 	 * 
	 	 * string pool
	 	 * 
	 	 */
	 	String str ="hello";
	 	String str1 = "hello";
	 	/**
	 	 * string pool����
	 	 * û�ҵ� �� һ��
	 	 * 
	 	 * �ҵ�  ���� hello
	 	 * 
	 	 * ��һ�������� ʱ�򻺴�
	 	 * 
	 	 * integer ������ �ͻ���
	 	 */
	 	System.out.println(str == str1);
	 	
	 	
	 	/**
	 	 * false
	 	 * 
	 	 * new �����ڴ�ռ�������һ��ռ�
	 	 */
	 	String str3 = new String("hello2");
	 	/**
	 	 * ��Ȼ ���� string pool��
	 	 */
	 	String str4 = "hello2";
	 	
	 	
	 	
	 	/**
	 	 * false
	 	 * 
	 	 * new �����ڴ�ռ�������һ��ռ�
	 	 */
	 	String str5 = new String("hello2");
	 	/**
	 	 * new Ҳ�����ڴ�ռ�������һ��ռ�
	 	 */
	 	String str6 = new String("hello2");
	 	
		
	
		System.out.println(a.equals(b));
		
		/**
		 * jdk �д��� ����λ���� 
		 * ��� ���Ч��
		 * == �Ƚ�stack ջ  �� ��ָ���ڴ�ռ�ĵ�ַ
		 * equal �Ƚ�heap  �� �ڴ�ռ�
		 * 1.heap�Ƕѣ�stack��ջ��
		 * 2.stack�Ŀռ��ɲ���ϵͳ�Զ�������ͷţ�heap�Ŀռ����ֶ�������ͷŵģ�heap����new�ؼ��������䡣
		 * 3.stack�ռ����ޣ�heap�Ŀռ��Ǻܴ����������
		 * ��Java�У���ֻ������һ������������ջ�ڴ���Ϊ������ַ�ռ䣬����newһ�£�ʵ�����������ڶ��ڴ���Ϊ������ַ��
		 * 4.�������������� ����������������Ķ�����ջ����
		 * �磺Object a =null; ֻ��ջ�ڴ��з���ռ�new ��������();����malloc(����); 
		 * ��������Ķ������ڶ����磺Object b =new Object(); ���ڶ��ڴ��з���ռ�
		 * 
		 * ��ҵ��digist
		 */
		
		
	}

}
