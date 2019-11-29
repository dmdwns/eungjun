package com.mystudy.ex02_url;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Exam {

	public static void main(String[] args) throws MalformedURLException {
		//프로토콜://호스트(서버):포트/경로(패스)?질의(query)
		URL url = new URL("http", "com.mystudy.java", 8080, 
				"aaa/bbb/test.jsp?id=hong&pw=1234#content");
		// http://com.mystudy.java:8080/aaa/bbb/test.jsp?id=hong&pw=1234#content
		url = new URL("http://com.mystudy.java:8080/aaa/bbb/test.jsp?id=hong&pw=1234#content");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		int defaultPort = url.getDefaultPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println("프로토콜(protocol) : " + protocol);
		System.out.println("호스트(host) : " + host);
		System.out.println("포트번호(port) : " + port);
		System.out.println("디폴트포트번호(defaultPort) : " + defaultPort);
		System.out.println("경로-패스(path) : " + path);
		System.out.println("쿼리-질문(query) : " + query);
		System.out.println("참조(reference) : " + ref);
		
		System.out.println("================================");
		url = new URL("https://sports.news.naver.com/news.nhn?oid=477&aid=0000215270");
		
		protocol = url.getProtocol();
		host = url.getHost();
		port = url.getPort();
		defaultPort = url.getDefaultPort();
		path = url.getPath();
		query = url.getQuery();
		ref = url.getRef();
		
		System.out.println("프로토콜(protocol) : " + protocol);
		System.out.println("호스트(host) : " + host);
		System.out.println("포트번호(port) : " + port);
		System.out.println("디폴트포트번호(defaultPort) : " + defaultPort);
		System.out.println("경로-패스(path) : " + path);
		System.out.println("쿼리-질문(query) : " + query);
		System.out.println("참조(reference) : " + ref);
	}

}








