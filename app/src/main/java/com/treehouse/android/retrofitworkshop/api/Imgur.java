package com.treehouse.android.retrofitworkshop.api;

import com.treehouse.android.retrofitworkshop.model.Basic;
import com.treehouse.android.retrofitworkshop.model.Image;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Imgur {


    String IMGUR_BASE_URL = "https://api.imgur.com";
    String IMGUR_CLIENT_ID = "68caa5af8860b9b";
    String AUTHORIZATION_URL = "https:/api.imgur.com/oauth2/authorize?client_id=" + IMGUR_CLIENT_ID + "&response_type=token";
    String REDIRECT_URL = "https://treehouseworkshop:88";

    interface Auth {
        @GET("3/account/{username}/images{page}")
        Call<Basic<ArrayList<Image>>> images(@Path("username") String username,
                                             @Path("page") int page);
    }
}
