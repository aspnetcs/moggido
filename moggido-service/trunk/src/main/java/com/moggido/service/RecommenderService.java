package com.moggido.service;

import java.util.List;

import org.apache.mahout.cf.taste.recommender.RecommendedItem;

public interface RecommenderService {

    List<RecommendedItem> getRecommendedItems(long userID, int howMany);
}
