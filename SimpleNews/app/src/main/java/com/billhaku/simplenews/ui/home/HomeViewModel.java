package com.billhaku.simplenews.ui.home;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText0;
    private MutableLiveData<String> mText1;

    public HomeViewModel() {
        mText0 = new MutableLiveData<>();
        mText0.setValue("This is home fragment0");
        mText1 = new MutableLiveData<>();
        mText1.setValue("Text1");
        sendRequestWithOkHttp();
    }

    public LiveData<String> getText() {
        return mText0;
    }

    private void sendRequestWithOkHttp(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    OkHttpClient client = new OkHttpClient();//新建一个OKHttp的对象
                    Request request = new Request.Builder()
                            .url("https://www.baidu.com")
                            .build();//创建一个Request对象
                    Response response = client.newCall(request).execute();//发送请求获取返回数据
                    String responseData = response.body().string();//处理返回的数据
                    showResponse(responseData);//更新ui
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
    private void showResponse(final String response){
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                mText1.setValue(response);
//            }
//        });
    }
}