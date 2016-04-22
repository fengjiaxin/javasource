package com.java.sort;


/**
 * ����
 * @author lxh
 * 
 *
 */
public class Sort {

	public static void main(String[] args) {
		int[] data = new int[]{3,6,7,9,2,1,5,8,4};
		// TODO Auto-generated method stub
		SelectSort(data);
		bubblesort(data);
	}
	
	
	
	
	/**
	 * 1.ð������
	 * @param arr
	 * ð�������ʱ�临�Ӷ�ΪO(n^2)��
	 */
	public static void bubblesort(int[] arr){
		if(arr==null||arr.length==0){
			return ;
		}else{
			int len  =arr.length;
			for(int i=0;i<len-1;i++){
				/**
				 * ð������������Ԫ�رȽϰ�С��"����"����ǰ��.
				 */
				for(int j=len-1;j>i;j--){
					if(arr[j]<arr[j-1]){
						swap(arr,j,j-1);
					}
				}
			}
			System.out.println("ð������");
			result(arr);
			System.out.println("");
		}
	}
	
	
	/**
	 * 2.ѡ������
	 * ð��������ͨ�����ڵıȽϺͽ���
	 * ��ѡ��������ͨ���������ѡ��
	 * ѡ�������ʱ�临�Ӷ�ΪO(n^2)
	 * @param arr
	 * @return
	 */
	public static void SelectSort(int[] arr){
		if(arr==null||arr.length==0){
			return ;
		}else{
			int len  =arr.length;
			int minIndex;
			for(int i=0;i<len-1;i++){
				
				 minIndex = i;
				/**
				 * һ��Ҫ����ڶ���forѭ��������,jÿ�ζ���i+1��ʼ,�����Ǵ�1��ʼ
				 */
				for(int j=i+1;j<len;j++){
					/**
					 * ֻ��ѡ������ֻ����ȷ������С����ǰ���²Ž��н������������˽����Ĵ���.
					 */
					if(arr[j]<arr[i]){
						//��������ķ�ʽ������ȱ��,�����˶�εĽ��������õķ�ʽ���� minIndex = j;
						/*swap(arr,i,j);*/
						minIndex = j;
					}
				}
				
				if(minIndex != i) { //���minIndex��Ϊi��˵���ҵ��˸�С��ֵ������֮��
	                swap(arr, i, minIndex);
	            }
			}
			
			System.out.println("ѡ������");
			result(arr);
			System.out.println("");
		}
	}
	
	/**
	 * ��������
	 * @param arr
	 */
	public static void InsertSort(int[] arr){
		int arrlen = arr.length;
		int[] newarr = new int[arrlen];
		for(int i = 0;i<arrlen;i++){
			if(i == 0){
				newarr[i] = arr[i];
			}else{
				
			}
		}
	}
	
	
	/**
	 * �����������±�����ݽ���
	 * @param arr ����
	 * @param i	�±�i
	 * @param j �±�j
	 */
	public static void swap(int[] arr,int i,int j){
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	
	/**
	 * ��ӡ���
	 * @param data
	 */
	public static void result(int[] data){
		for(int i=0,len=data.length;i<len;i++){
			System.out.print(data[i]+" ");
		}
	}

}
