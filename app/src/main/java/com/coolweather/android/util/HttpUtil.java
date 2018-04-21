package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by psychosis on 2018/4/18.
 */

public class HttpUtil {
    //与服务器交互,因为全国省市县的数据都是从服务器端获取
    public static void senOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
