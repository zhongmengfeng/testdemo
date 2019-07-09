package com.qianpei.qpsdk.netUtils;


import com.squareup.okhttp.Request;

/**
 * 请求的监听
 */
public interface RequestListener {
	void onResponse(String response);
	void onError(Request request, Exception e) ;
}
