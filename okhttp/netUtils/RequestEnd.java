package com.qianpei.qpsdk.netUtils;
/**
 * 用于缓存处理
 */
public interface RequestEnd extends RequestListener{
	void onRequest(String url);
}
