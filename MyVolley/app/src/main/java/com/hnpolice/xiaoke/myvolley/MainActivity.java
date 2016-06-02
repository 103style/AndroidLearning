package com.hnpolice.xiaoke.myvolley;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.LruCache;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    NetworkImageView netImg;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.imageView);
        netImg = (NetworkImageView) findViewById(R.id.netImg);
        tv = (TextView) findViewById(R.id.tv);
//        loadImgVolley();
        getJsonVolley();
//        getNetWorkImageView();
    }

    public void loadImgVolley() {
        String imgUrl = "http://i1.sinaimg.cn/IT/2012/1205/U9167P2DT20121205111129.png";
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        final LruCache<String, Bitmap> lruCache = new LruCache<>(20);
        ImageLoader.ImageCache imageCache = new ImageLoader.ImageCache() {
            @Override
            public Bitmap getBitmap(String url) {
                return lruCache.get(url);
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {
                lruCache.put(url, bitmap);
            }
        };

        ImageLoader imageLoader = new ImageLoader(requestQueue, imageCache);
        ImageLoader.ImageListener listener = ImageLoader.getImageListener(img, R.mipmap.ic_launcher, R.mipmap.ic_launcher);
        imageLoader.get(imgUrl, listener);
    }


    public void getJsonVolley() {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String jsonUrl = "http://fanyi.youdao.com/openapi.do?keyfrom=a5464asads&key=493544320&type=data&doctype=json&version=1.1&q=good";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, jsonUrl, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        tv.setText(response.toString());
                        Log.e("response", response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        tv.setText(error.toString());
                        Log.e("response", "<<<<<<<<<error>>>>>>>>>>");
                    }
                });

        requestQueue.add(jsonObjectRequest);
    }


    public void getNetWorkImageView() {
        String imgUrl = "http://i1.sinaimg.cn/IT/2012/1205/U9167P2DT20121205111129.png";
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        final LruCache<String, Bitmap> lruCache = new LruCache<>(20);
        final ImageLoader.ImageCache imageCache = new ImageLoader.ImageCache() {
            @Override
            public Bitmap getBitmap(String url) {
                return lruCache.get(url);
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {
                lruCache.put(url, bitmap);
            }
        };

        ImageLoader imageLoader = new ImageLoader(requestQueue, imageCache);
        netImg.setTag("url");
        netImg.setImageUrl(imgUrl, imageLoader);
    }
}
