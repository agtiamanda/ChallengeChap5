package service

import android.telecom.Call
import model.GetAccount
import model.GetAllTrending
import retrofit2.http.GET

interface APIService {
    @GET("movie/akun")
    fun getAllFruits() : Call<List<GetAccount>>
    @GET("movie/trending")
    fun getAllTrending(): Call<List<GetAllTrending>>
}