package com.moggido.service.impl;

import java.io.File;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

import com.moggido.engine.cf.taste.MoggidoDataModel;
import com.moggido.engine.cf.taste.MoggidoRecommender;
import com.moggido.service.RecommenderService;

/**
 * API to expose
 *
 * @author ccadete
 *
 */
public class MoggidoRecommenderService implements RecommenderService {

    private MoggidoRecommender recommender;

    public MoggidoRecommenderService() {
        try {
            recommender = new MoggidoRecommender(new MoggidoDataModel(new File("taste.u1.test")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    public void addRating(String apikey, long userId, long itemId, int rating) {
    //        System.out.println("NOT USED: addRating");
    //    }
    //
    //    public void addItem(String apikey, long itemId) {
    //        System.out.println("NOT USED: addItem");
    //    }
    //
    //    public void addUser(String apikey, long userId) {
    //        System.out.println("NOT USED: addUser");
    //    }

    public List<RecommendedItem> getRecommendedItems(long userID, int howMany) {
        try {
            return recommender.recommend(userID, howMany);
        } catch (TasteException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        RecommenderService service = new MoggidoRecommenderService();

        List<RecommendedItem> items = service.getRecommendedItems(474, 10);

        for (RecommendedItem item : items) {
            System.out.println(item);
        }
    }
}
