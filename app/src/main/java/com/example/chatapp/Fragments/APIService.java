package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAGM-ujDw:APA91bFx1gVpGRHCPYFmHl5QMDqGxrgz1T_gcIjzaknxrZ_jOz_MrcZAof7jgVMmWAbFoSfPKzzFGwys5hN1mvU6do6UmHqiECjWloyK3GZ18iV0kh9aGMb_2M0aRW-9UJk1Be1sYvzT"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
