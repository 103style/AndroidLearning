package com.hnpolice.xiaoke.rxjavaandretrofit.retrofitandrxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.hnpolice.xiaoke.rxjavaandretrofit.R;
import com.hnpolice.xiaoke.rxjavaandretrofit.bean.MovieBean;
import com.hnpolice.xiaoke.rxjavaandretrofit.http.HttpMethod;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscriber;

public class RetrofitAndRxJavaActivity extends AppCompatActivity {

    @Bind(R.id.show)
    TextView show;
    @Bind(R.id.click)
    Button click;
    @Bind(R.id.loading)
    LinearLayout loading;
    @Bind(R.id.scrollView)
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_and_rx_java);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.click)
    public void onClick() {
        scrollView.setVisibility(View.GONE);
        loading.setVisibility(View.VISIBLE);
        connection();
    }


//    /**
//     * 网络请求
//     */
//    private void connection() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(HttpUrl.BASEURL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .build();
//
//        MovieService ms = retrofit.create(MovieService.class);
//
//        ms.getTopMovie(0, 3)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<MovieBean>() {
//                    @Override
//                    public void onCompleted() {
//                        scrollView.setVisibility(View.VISIBLE);
//                        loading.setVisibility(View.GONE);
//                        Toast.makeText(RetrofitAndRxJavaActivity.this, "Get Top Movie Completed", Toast.LENGTH_SHORT).show();
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        show.setText(e.getMessage());
//                    }
//
//                    @Override
//                    public void onNext(MovieBean movieBean) {
//                        show.setText(movieBean.toString());
//                    }
//                });
//
//    }

    /**
     * 网络请求
     */
    private void connection() {

        Subscriber<MovieBean> subscriber = new Subscriber<MovieBean>() {
            @Override
            public void onCompleted() {
                scrollView.setVisibility(View.VISIBLE);
                loading.setVisibility(View.GONE);
                Toast.makeText(RetrofitAndRxJavaActivity.this, "Get Top Movie Completed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable e) {
                show.setText(e.getMessage());
            }

            @Override
            public void onNext(MovieBean movieBean) {
                show.setText(movieBean.toString());
            }
        };

        HttpMethod.getInstance().getTopMovie(subscriber, 0, 3);

    }
}
