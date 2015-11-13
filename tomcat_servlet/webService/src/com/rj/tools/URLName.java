package com.rj.tools;

public class URLName {

	public URLName() {
	}
	
	/**
	 * ��ȡ����http��URL�еĺ���չ�����ļ���
	 * @param url 	    ����http��URL
	 * @param symbol  url��·������б�ܡ�/����б�ܡ�\�����߱���·����"\\"
	*/
	public String getURLFileName(String url,String symbol){
		String fileName   = url.substring(url.lastIndexOf(symbol) + 1,url.lastIndexOf(".")); 
		String expandName = url.substring(url.lastIndexOf(".") + 1,url.length()).toLowerCase(); 
		
		return fileName+"."+expandName;
	}
	
	/**
	 * ��ȡ����http��URL�в�����չ�����ļ���
	 * @param url 	    ����http��URL
	 * @param symbol  url��·������б�ܡ�/����б�ܡ�\�����߱���·����"\\"
	*/
	public String fileName(String url,String symbol){
		String fileName   = url.substring(url.lastIndexOf(symbol) + 1,url.lastIndexOf(".")); 
		return fileName;
	}
	
	/**
	 * ��ȡ����http��URL�е��ļ�������չ��
	 * @param url 	    ����http��URL
	 * @param symbol  url��·������б�ܡ�/����б�ܡ�\�����߱���·����"\\"
	*/
	public String expandName(String url){
		String expandName = url.substring(url.lastIndexOf(".") + 1,url.length()).toLowerCase(); 
		return expandName;
	}
}
