package com.example.uts_pb_azmi.data.retrofit;


import com.example.uts_pb_azmi.data.response.GithubSearchResponse;
import com.example.uts_pb_azmi.data.response.GithubUser;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({"Authorization: token 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"})
    @GET("search/users")
    Call<GithubSearchResponse> searchUsers(@Query("q") String query);


    @Headers({"Authorization: token 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"})
    @GET("users/{username}")
    Call<GithubUser> getUser(@Path("username") String username);

}