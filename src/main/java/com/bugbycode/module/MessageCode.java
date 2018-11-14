package com.bugbycode.module;

public abstract class MessageCode {
	
	public final static int HEARTBEAT = 0; 	//心跳通信
	
	public final static int REGISTER = 1;	//注册
	
	public final static int CONNECTION = 2;	//连接目标设备
	
	public final static int CONNECTION_SUCCESS = 7; //建立连接结果
	
	public final static int CONNECTION_ERROR = 8;
	
	public final static int TRANSFER_DATA = 3; //流量转发
	
	public final static int CLOSE_CONNECTION = 4; //断开与目标设备的连接
}
