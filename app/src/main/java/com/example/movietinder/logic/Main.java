package com.example.movietinder.logic;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {
    public static void main(String[] args) {

    }

    public void callAPI() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://imdb8.p.rapidapi.com/title/auto-complete?q=game%20of%20thr")
                .get()
                .addHeader("x-rapidapi-key", "ad20faac89msh7f16d75b1a51be9p1709dajsnba93ea5ea2b7")
                .addHeader("x-rapidapi-host", "imdb8.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
    }
}
