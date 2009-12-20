package com.moggido.service.impl;

import com.moggido.service.RecommenderService;

public class MoggidoRecommenderService implements RecommenderService {

    //    @GET
    //    @Path("/{apikey}")
    //    public void addRating(@PathParam("apikey") String apikey, @PathParam("userId") long userId,
    //        @PathParam("itemId") long itemId, @PathParam("rating") int rating) {
    //
    //    }

    public void addItem(String apikey, long itemId) {
        System.out.println("item:" + itemId);
    }

    public void addUser(String apikey, long userId) {
        System.out.println("user:" + userId);
    }

    //    @GET
    //    @Path("/")
    //    public int getRating(long userID, long itemID) {
    //        return 33;
    //    }
    //
    //    @GET
    //    @Path("/")
    //    public long[] getRecommendedItems(long userID, long itemID) {
    //        return new long[] {1, 2, 3};
    //    }
}
