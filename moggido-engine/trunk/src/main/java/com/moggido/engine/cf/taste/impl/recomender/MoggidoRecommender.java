//package com.moggido.engine.cf.taste.impl.recomender;
//
//import java.io.IOException;
//import java.util.Collection;
//import java.util.List;
//
//import org.apache.mahout.cf.taste.common.Refreshable;
//import org.apache.mahout.cf.taste.common.TasteException;
//import org.apache.mahout.cf.taste.impl.recommender.CachingRecommender;
//import org.apache.mahout.cf.taste.impl.recommender.slopeone.SlopeOneRecommender;
//import org.apache.mahout.cf.taste.model.DataModel;
//import org.apache.mahout.cf.taste.recommender.IDRescorer;
//import org.apache.mahout.cf.taste.recommender.RecommendedItem;
//import org.apache.mahout.cf.taste.recommender.Recommender;
//
//public class MoggidoRecommender implements Recommender {
//
//    private final Recommender recommender;
//
//    public MoggidoRecommender() throws IOException, TasteException {
//        this(new MoggidoDataModel());
//    }
//
//    public MoggidoRecommender(DataModel dataModel) throws TasteException {
//        recommender = new CachingRecommender(new SlopeOneRecommender(dataModel));
//    }
//
//    @Override
//    public float estimatePreference(long userID, long itemID) throws TasteException {
//        // TODO Auto-generated method stub
//        return 0;
//    }
//
//    @Override
//    public DataModel getDataModel() {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    @Override
//    public List<RecommendedItem> recommend(long userID, int howMany) throws TasteException {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    @Override
//    public List<RecommendedItem> recommend(long userID, int howMany, IDRescorer rescorer)
//        throws TasteException {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    @Override
//    public void removePreference(long userID, long itemID) throws TasteException {
//        // TODO Auto-generated method stub
//
//    }
//
//    @Override
//    public void setPreference(long userID, long itemID, float value) throws TasteException {
//        // TODO Auto-generated method stub
//
//    }
//
//    @Override
//    public void refresh(Collection<Refreshable> alreadyRefreshed) {
//        // TODO Auto-generated method stub
//
//    }
//
//}
