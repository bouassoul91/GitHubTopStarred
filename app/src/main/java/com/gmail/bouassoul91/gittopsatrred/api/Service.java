package com.gmail.bouassoul91.gittopsatrred.api;

import com.gmail.bouassoul91.gittopsatrred.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Bouassoul on 22/12/2017.
 */

public interface Service {

    @GET
    Call<ItemResponse> getItems(@Url String url);
    
}
