package com.example.a23b_11345b_l05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.a23b_11345b_l05.Models.Movie;
import com.example.a23b_11345b_l05.Models.MovieList;
import com.example.a23b_11345b_l05.Utilities.MySPv1;
import com.example.a23b_11345b_l05.Utilities.MySPv2;
import com.example.a23b_11345b_l05.Utilities.MySPv3;
import com.example.a23b_11345b_l05.Utilities.SignalGenerator;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MovieList movieList = new MovieList();
//        movieList.setName("Top 10");
//
//        movieList.getMovies().add(
//                new Movie()
//                        .setTitle("Spirited Away")
//                        .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/39wmItIWsg5sZMyRUHLkWBcuVCM.jpg")
//                        .setFavorite(false)
//                        .setDuration(125)
//                        .setYear(2001)
//                        .setRating(85)
//                        .setReviews(5)
//        );
//
//        movieList.getMovies().add(
//                new Movie()
//                        .setTitle("Forest Gump")
//                        .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/arw2vcBveWOVZr6pxd9XTd1TdQa.jpg")
//                        .setFavorite(false)
//                        .setDuration(142)
//                        .setYear(1994)
//                        .setRating(85)
//                        .setReviews(7)
//        );
//
//        String movieListJson = new Gson().toJson(movieList);
//        Log.d("JSON:", movieListJson);

        String json = "{\"movies\":[{\"duration\":125,\"image\":\"https://www.themoviedb.org/t/p/w600_and_h900_bestv2/39wmItIWsg5sZMyRUHLkWBcuVCM.jpg\",\"isFavorite\":false,\"rating\":85.0,\"reviews\":5,\"title\":\"Spirited Away\",\"year\":2001},{\"duration\":142,\"image\":\"https://www.themoviedb.org/t/p/w600_and_h900_bestv2/arw2vcBveWOVZr6pxd9XTd1TdQa.jpg\",\"isFavorite\":false,\"rating\":85.0,\"reviews\":7,\"title\":\"Forest Gump\",\"year\":1994}],\"name\":\"Top 10\"}";
//        MovieList fromJsonMovieList = new Gson().fromJson(json,MovieList.class);
//        Log.d("FromJSON:", fromJsonMovieList.toString());

//        MySPv1.putString(this,"23B-11345B-L05", json);

//        String fromSP = MySPv1.getString(this,"23B-11345B-L05","");
//        Log.d("FromSP:", fromSP);

//        MySPv2 mySPv2 = new MySPv2(this);
//        String read = mySPv2.getString("23B-11345B-L05","");
//        Log.d("FromSP:", read);

        MySPv3.getInstance().putString("23B-11345B-L05", json);

        String fromSP = MySPv3.getInstance().getString("23B-11345B-L05","");
        MovieList movieListFromJson = new Gson().fromJson(fromSP, MovieList.class);
        Log.d("Movies from json:", movieListFromJson.toString());

SignalGenerator.getInstance().toast("", Toast.LENGTH_SHORT);
    }
}