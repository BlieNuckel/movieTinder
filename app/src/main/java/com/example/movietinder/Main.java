package com.example.movietinder;

import java.net.http.*;

public class Main {
    public static void main(String[] args){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://imdb8.p.rapidapi.com/title/auto-complete?q=game%20of%20thr"))
                .header("x-rapidapi-key", "38fa1df955mshca2148d13a7b88ap1eba29jsn0f0eb8a3af8f")
                .header("x-rapidapi-host", "imdb8.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
    public void doSomething(){

    }
}
