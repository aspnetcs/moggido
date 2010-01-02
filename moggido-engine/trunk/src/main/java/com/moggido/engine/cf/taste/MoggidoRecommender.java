package com.moggido.engine.cf.taste;

import java.util.Collection;
import java.util.List;

import org.apache.mahout.cf.taste.common.Refreshable;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.recommender.CachingRecommender;
import org.apache.mahout.cf.taste.impl.recommender.slopeone.SlopeOneRecommender;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.IDRescorer;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

/**
 * The moggido recommender, it uses the standard slope one recommender
 *
 * @author ccadete
 *
 */
public final class MoggidoRecommender implements Recommender {

    private final Recommender recommender;

    public MoggidoRecommender(DataModel dataModel) throws TasteException {
        recommender = new CachingRecommender(new SlopeOneRecommender(dataModel));
    }

    @Override
    public List<RecommendedItem> recommend(long userID, int howMany) throws TasteException {
        return recommender.recommend(userID, howMany);
    }

    @Override
    public List<RecommendedItem> recommend(long userID, int howMany, IDRescorer rescorer)
        throws TasteException {
        return recommender.recommend(userID, howMany, rescorer);
    }

    @Override
    public float estimatePreference(long userID, long itemID) throws TasteException {
        return recommender.estimatePreference(userID, itemID);
    }

    @Override
    public void setPreference(long userID, long itemID, float value) throws TasteException {
        recommender.setPreference(userID, itemID, value);
    }

    @Override
    public void removePreference(long userID, long itemID) throws TasteException {
        recommender.removePreference(userID, itemID);
    }

    @Override
    public DataModel getDataModel() {
        return recommender.getDataModel();
    }

    @Override
    public void refresh(Collection<Refreshable> alreadyRefreshed) {
        recommender.refresh(alreadyRefreshed);
    }

    @Override
    public String toString() {
        return "MoggidoRecommender[recommender:" + recommender + ']';
    }

}
