package sample.greenair.akhilmg.com.testretrofitcaching;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sample.greenair.akhilmg.com.testretrofitcaching.model.ITSCreateConfigDto;
import sample.greenair.akhilmg.com.testretrofitcaching.model.IssueClassWrapperDto;
import sample.greenair.akhilmg.com.testretrofitcaching.model.SampleData;
import sample.greenair.akhilmg.com.testretrofitcaching.model.TestData;
import sample.greenair.akhilmg.com.testretrofitcaching.retrofitServices.BaseRetrofitService;
import sample.greenair.akhilmg.com.testretrofitcaching.retrofitServices.SampleService;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callAPI(View view) {
        SampleService service = BaseRetrofitService.getRetrofitInstance(this).create(SampleService.class);
        /*HashMap<String, String> map=new HashMap<>();
        map.put("UserID",null);
        map.put("UpdateDateUTC",null);
        map.put("UserName","onboard");
        map.put("UpdateBySQLUser",null);
        map.put("aspnetUserPasswordReset",null);
        map.put("SiteID",null);
        map.put("ToDelete",null);
        map.put("gUID",null);
        map.put("Password","m4X/VtrAaXqu3Y7QTyaKmA\u003d\u003d");
        Call<IssueClassWrapperDto> dtoCall=service.onResponse(map);
        final ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();
        dtoCall.enqueue(new Callback<IssueClassWrapperDto>() {
            @Override
            public void onResponse(Call<IssueClassWrapperDto> call, Response<IssueClassWrapperDto> response) {
                Log.d(TAG, "onResponse: ");
                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<IssueClassWrapperDto> call, Throwable t) {
                Log.d(TAG, "onFailure: ");
                progressDialog.dismiss();
            }
        });*/

        /*Call<ITSCreateConfigDto> repos = service.getConfig();
        final ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();
        repos.enqueue(new Callback<ITSCreateConfigDto>() {
            @Override
            public void onResponse(Call<ITSCreateConfigDto> call, Response<ITSCreateConfigDto> response) {
                if (response.body() != null) {
                    Log.d(TAG, "onResponse: ");
//                    Log.d(TAG, "onResponse: "+response.body().get(0).getFullName());
                }
                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<ITSCreateConfigDto> call, Throwable t) {
                Log.d(TAG, "onFailure: ");
                progressDialog.dismiss();
            }
        });*/

        Call<List<SampleData>> repos = service.listRepos("vipin-raj");
        final ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();
        repos.enqueue(new Callback<List<SampleData>>() {
            @Override
            public void onResponse(Call<List<SampleData>> call, Response<List<SampleData>> response) {
                if (response.body() != null) {
                    Log.d(TAG, "onResponse: "+response.body().get(0).getFullName());
                }
                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<List<SampleData>> call, Throwable t) {
                Log.d(TAG, "onFailure: ");
                progressDialog.dismiss();
            }
        });
//TestData data=new TestData();
//        data.setHello("Haii");
//        Call<TestData> repos = service.getsample(data);
//        final ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
//        progressDialog.setMessage("Loading...");
//        progressDialog.show();
//        repos.enqueue(new Callback<TestData>() {
//            @Override
//            public void onResponse(Call<TestData> call, Response<TestData> response) {
//                if (response.body() != null) {
//                    Log.d(TAG, "onResponse: "+response.body().getHello());
//                }
//                progressDialog.dismiss();
//            }
//
//            @Override
//            public void onFailure(Call<TestData> call, Throwable t) {
//                Log.d(TAG, "onFailure: ");
//                progressDialog.dismiss();
//            }
//        });
    }
}
