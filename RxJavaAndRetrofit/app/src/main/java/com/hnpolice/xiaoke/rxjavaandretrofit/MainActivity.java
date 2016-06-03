package com.hnpolice.xiaoke.rxjavaandretrofit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hnpolice.xiaoke.rxjavaandretrofit.retrofit.RetrofitActivity;
import com.hnpolice.xiaoke.rxjavaandretrofit.retrofitandrxjava.RetrofitAndRxJavaActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.retrofit)
    public void onClick() {
        startActivity(new Intent(MainActivity.this, RetrofitActivity.class));
    }

    @OnLongClick(R.id.retrofit)
    public boolean onLongClick(View v) {
        Snackbar snackbar = Snackbar.make(v, "this is a Snackbar", Snackbar.LENGTH_SHORT);
        snackbar.getView().setBackgroundColor(0xFF78909C);
        snackbar.show();
        return true;
    }

    @OnClick(R.id.retrofit_and_rxjava)
    public void onClickWithRxJava() {
        startActivity(new Intent(MainActivity.this, RetrofitAndRxJavaActivity.class));
    }
}
