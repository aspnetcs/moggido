package com.moggido.engine.cf.taste;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.Recommender;

/**
 *
 * @author ccadete
 *
 */
public final class MoggidoRecommenderBuilder implements RecommenderBuilder {

    @Override
    public Recommender buildRecommender(DataModel dataModel) throws TasteException {
        return new MoggidoRecommender(dataModel);
    }

}
