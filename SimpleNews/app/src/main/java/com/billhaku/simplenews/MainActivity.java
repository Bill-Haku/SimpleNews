package com.billhaku.simplenews;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.billhaku.simplenews.model.NewsModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.billhaku.simplenews.databinding.ActivityMainBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sendRequest = (Button)findViewById(R.id.send_request);
        textView = (TextView)findViewById(R.id.request_text);
        sendRequest.setOnClickListener(this);

//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        BottomNavigationView navView = findViewById(R.id.nav_view);
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(binding.navView, navController);

//        sendRequestWithOkHttp();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.send_request) {
            sendRequestWithOkHttp();
        }
    }

    private void sendRequestWithOkHttp(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    OkHttpClient client = new OkHttpClient();//新建一个OKHttp的对象
                    Request request = new Request.Builder()
                            .url("https://api.tianapi.com/bulletin/index?key=861edb3ce746f6440d80430c339eef34")
                            .build();//创建一个Request对象
                    Response response = client.newCall(request).execute();//发送请求获取返回数据
                    String responseData = response.body().string();//处理返回的数据
//                    showResponse(responseData);//更新ui
                    praseJsonWithGSON(responseData);
                    System.out.println(responseData);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void praseJsonWithGSON(String jsonData) {
        try {
            NewsModel newsModel = new Gson().fromJson(jsonData,NewsModel.class);
            List<NewsModel.NewsList> newsList = newsModel.getNewsList();
            String finalResponse = "";
            for (int i = 0; i <= 5; i++) {
                finalResponse += "\n";
                finalResponse += newsList.get(i).getTitle();
                finalResponse += "\n";
                finalResponse += newsList.get(i).getDigest();
            }
            showResponse(finalResponse);
//            showResponse(newsModel.getMsg());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showResponse(final String response){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textView.setText(response);
            }
        });
    }

}