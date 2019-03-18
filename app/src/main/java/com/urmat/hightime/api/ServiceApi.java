package com.urmat.hightime.api;


import com.urmat.hightime.Auth.login.TokenLogin;
import com.urmat.hightime.lessons.advanced.Advanced;
import com.urmat.hightime.news.News;
import com.urmat.hightime.Auth.register.TokenRegister;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ServiceApi {

    @FormUrlEncoded
    @POST("api/auth/register")
    Call<TokenRegister> signUp(@Field("name") String name,
                               @Field("email") String email,
                               @Field("password") String password);
    @FormUrlEncoded
    @POST("/api/auth/login")
    Call<TokenLogin> toComeIn(@Field("name") String name,
                              @Field("password") String password);

    @GET("/api/news")
    Call<List<News>> getTest();

    @GET("/api/news/")
    Call<List<News>> getNewsById(@Query("id") int id);

    @GET("/api/level/{id}")
    Call<List<Advanced>> getLevelById(@Path("id") int id);
}
