package com.hnpolice.xiaoke.rxjavaandretrofit.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.hnpolice.xiaoke.rxjavaandretrofit.R;
import com.hnpolice.xiaoke.rxjavaandretrofit.bean.MovieBean;
import com.hnpolice.xiaoke.rxjavaandretrofit.http.HttpUrl;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_retrofit);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.click)
    public void onClick() {
        scrollView.setVisibility(View.GONE);
        loading.setVisibility(View.VISIBLE);
        connection();
    }


    /**
     * 网络请求
     */
    private void connection() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HttpUrl.BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MovieService ms = retrofit.create(MovieService.class);
        Call<MovieBean> call = ms.getTopMovie(0, 3);
        call.enqueue(new Callback<MovieBean>() {
            @Override
            public void onResponse(Call<MovieBean> call, Response<MovieBean> response) {
                show.setText(response.body().toString());
                scrollView.setVisibility(View.VISIBLE);
                loading.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<MovieBean> call, Throwable t) {
                show.setText(t.getMessage());
                scrollView.setVisibility(View.VISIBLE);
                loading.setVisibility(View.GONE);
            }

        });

    }
}
