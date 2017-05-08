package sample.greenair.akhilmg.com.testretrofitcaching.retrofitServices;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import sample.greenair.akhilmg.com.testretrofitcaching.model.ITSCreateConfigDto;
import sample.greenair.akhilmg.com.testretrofitcaching.model.IssueClassWrapperDto;
import sample.greenair.akhilmg.com.testretrofitcaching.model.SampleData;
import sample.greenair.akhilmg.com.testretrofitcaching.model.TestData;

/**
 * Created by AKHIL MG on 27-04-2017.
 */

public interface SampleService {
    @GET("users/{user}/repos")
    Call<List<SampleData>> listRepos(@Path("user") String user);

    @POST("MobileLogin/LoginUser")
    Call<IssueClassWrapperDto> onResponse(@Body HashMap<String, String> parameters);

    @Headers("Cache-Control: max-age=640000")
    @GET("MobileLogin/GetItsMobileCreateConfiguration")
    Call<ITSCreateConfigDto> getConfig();

    @POST("5901e9500f0000c614d2ca81/")
    Call<TestData> getsample(@Body TestData data);

}
