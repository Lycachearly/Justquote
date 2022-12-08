package com.chearly.justquote.API;

import com.chearly.justquote.Model.QuoteModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequesData {
    @GET("quotes")
    Call<List<QuoteModel>> ardRetriveQuote();
}
