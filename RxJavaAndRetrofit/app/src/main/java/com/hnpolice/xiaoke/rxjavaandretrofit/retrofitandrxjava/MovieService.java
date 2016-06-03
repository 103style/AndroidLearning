package com.hnpolice.xiaoke.rxjavaandretrofit.retrofitandrxjava;

import com.hnpolice.xiaoke.rxjavaandretrofit.bean.MovieBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * create by luoxiaoke on 2016/6/2 11:12.
 * use for  接口
 */
public interface MovieService {

    @GET("top250")
    Observable<MovieBean> getTopMovie(@Query("start") int start, @Query("count") int count);


}
