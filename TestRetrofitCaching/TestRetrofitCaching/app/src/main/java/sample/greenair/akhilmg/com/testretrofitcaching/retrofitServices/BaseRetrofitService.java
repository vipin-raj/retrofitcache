package sample.greenair.akhilmg.com.testretrofitcaching.retrofitServices;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by AKHIL MG on 27-04-2017.
 */

public class BaseRetrofitService {
    private static final String BASE_MODIFIED_URL = "https://api.github.com/";
//    private static final String BASE_MODIFIED_URL = "http://54.65.217.197/ItsApiV25/api/";
//    private static final String BASE_MODIFIED_URL = "http://www.mocky.io/v2/";
//     public static String BASE_MODIFIED_URL = "https://api.github.com/";

    public static Retrofit retrofit;


    public static Retrofit getRetrofitInstance(final Context context) {
        try {
//            String BASE_API = SPHelper.getUrlServer(context);
//            String BASE_MODIFIED_URL = Util.modifyUrlIfNeeded(BASE_API);
            if (retrofit==null) {
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                long SIZE_OF_CACHE = 10 * 1024 * 1024; // 10 MiB
                Cache cache = new Cache(new File(context.getCacheDir(), "http"), SIZE_OF_CACHE);

                OkHttpClient client = new OkHttpClient
                        .Builder()
                        .addInterceptor(interceptor)
                        .connectTimeout(30, TimeUnit.SECONDS)
                        .readTimeout(30, TimeUnit.SECONDS)
                        .addNetworkInterceptor(new Interceptor() {
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request request = chain.request();
                                if (isNetworkConnected(context)) {
                                    request = request.newBuilder().removeHeader("Pragma").removeHeader("Cache-Control").header("Cache-Control", "public, max-age=" + 600).build();
                                } else {
                                    request = request.newBuilder().removeHeader("Pragma").removeHeader("Cache-Control").header("Cache-Control", "public, only-if-cached, max-stale=" + 60 * 60 * 24 * 7).build();
                                }
                                return chain.proceed(request);
                            }
                        })
                        .cache(cache)
                        .connectTimeout(60, TimeUnit.SECONDS)
                        .readTimeout(60, TimeUnit.SECONDS)
                        .build();

            /*OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .build();*/


                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_MODIFIED_URL)
                        .client(client)
                        .addConverterFactory(GsonConverterFactory.create(new GsonBuilder()
                                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                                .create()))
                        .build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retrofit;
    }
    private static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnected()) {
            return true;

        }
        return false;
    }
}