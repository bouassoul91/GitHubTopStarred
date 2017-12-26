package com.gmail.bouassoul91.gittopsatrred.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Bouassoul on 22/12/2017.
 */

public class Client {

    public static final String BASE_URL = "https://api.github.com";
	
	//to turn HTTP API -Github API- into a Java interface.
    public static Retrofit retrofit = null;
	
	//Default constructor private, to avoid creating new instance.
	private Client(){
	
	}

	//Only one instance is need, also synchronization is not mandatory since we only have one thread.
    public static Retrofit getClient(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
