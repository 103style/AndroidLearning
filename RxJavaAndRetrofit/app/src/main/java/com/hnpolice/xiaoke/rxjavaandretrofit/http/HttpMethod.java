package com.hnpolice.xiaoke.rxjavaandretrofit.http;


import com.hnpolice.xiaoke.rxjavaandretrofit.bean.MovieBean;
import com.hnpolice.xiaoke.rxjavaandretrofit.retrofitandrxjava.MovieService;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * create by luoxiaoke on 2016/6/2 11:45.
 * use for
 */
public class HttpMethod {
    //默认超时时间
    public final int DEFAULT_TIMEOUT = 5;

    private Retrofit retrofit;
    private MovieService movieService;

    //私有的构造方法
    private HttpMethod() {
        //手动设置一个OKHttpClient 并设置超时时间
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder()
                .client(httpClientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(HttpUrl.BASEURL)
                .build();

        movieService = retrofit.create(MovieService.class);
    }

    //构造单例
    private static class SingletonHolder {
        private static final HttpMethod INSTANCE = new HttpMethod();
    }

    //获取单例
    public static HttpMethod getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * @param subscriber 观察者对象
     * @param start      开始位置
     * @param count      一共多少条
     */
    public void getTopMovie(Subscriber<MovieBean> subscriber, int start, int count) {
        movieService.getTopMovie(start, count)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


}
