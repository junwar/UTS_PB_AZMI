package com.example.uts_pb_azmi.data.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GithubSearchResponse {
    @SerializedName("items")
    private List<GithubUser> users;

    public GithubSearchResponse(List<GithubUser> users) {
        this.users = users;
    }

    public List<GithubUser> getUsers() {

        return users;
    }
}
