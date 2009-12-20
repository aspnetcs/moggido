package com.moggido.engine.cf.taste.impl.similarity;

import org.apache.mahout.cf.taste.common.Weighting;
import org.apache.mahout.cf.taste.model.DataModel;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ccadete
 *
 */

public final class PearsonCorrelationUserSimilarityTest extends SimilarityTestCase {

    /** simple datamodel */
    public static DataModel getDataModel() {
        return getDataModel(new long[] {1, 2, 3, 4}, new Double[][] { {0.1, 0.3}, {0.2, 0.3, 0.3},
            {0.4, 0.3, 0.5}, {0.7, 0.3, 0.8},});
    }

    @Test
    public void testFullCorrelation1() throws Exception {
        DataModel dataModel = getDataModel(new long[] {1, 2}, new Double[][] { {3.0, -2.0}, {3.0, -2.0},});
        double correlation = new PearsonCorrelationUserSimilarity(dataModel).userSimilarity(1, 2);
        assertCorrelationEquals(1.0, correlation);
    }

    @Test
    public void testFullCorrelation1Weighted() throws Exception {
        DataModel dataModel = getDataModel(new long[] {1, 2}, new Double[][] { {3.0, -2.0}, {3.0, -2.0},});
        double correlation = new PearsonCorrelationUserSimilarity(dataModel, Weighting.WEIGHTED).userSimilarity(
            1,
            2);
        assertCorrelationEquals(1.0, correlation);
    }

    @Test
    public void testFullCorrelation2() throws Exception {
        DataModel dataModel = getDataModel(new long[] {1, 2}, new Double[][] { {3.0, 3.0}, {3.0, 3.0},});
        double correlation = new PearsonCorrelationUserSimilarity(dataModel).userSimilarity(1, 2);
        // Yeah, undefined in this case
        Assert.assertTrue(Double.isNaN(correlation));
    }

    @Test
    public void testNoCorrelation1() throws Exception {
        DataModel dataModel = getDataModel(new long[] {1, 2}, new Double[][] { {3.0, -2.0}, {-3.0, 2.0},});
        double correlation = new PearsonCorrelationUserSimilarity(dataModel).userSimilarity(1, 2);
        assertCorrelationEquals(-1.0, correlation);
    }

    @Test
    public void testNoCorrelation1Weighted() throws Exception {
        DataModel dataModel = getDataModel(new long[] {1, 2}, new Double[][] { {3.0, -2.0}, {-3.0, 2.0},});
        double correlation = new PearsonCorrelationUserSimilarity(dataModel, Weighting.WEIGHTED).userSimilarity(
            1,
            2);
        assertCorrelationEquals(-1.0, correlation);
    }

    @Test
    public void testNoCorrelation2() throws Exception {
        DataModel dataModel = getDataModel(new long[] {1, 2}, new Double[][] { {null, 1.0, null},
            {null, null, 1.0},});
        double correlation = new PearsonCorrelationUserSimilarity(dataModel).userSimilarity(1, 2);
        Assert.assertTrue(Double.isNaN(correlation));
    }

    @Test
    public void testNoCorrelation3() throws Exception {
        DataModel dataModel = getDataModel(new long[] {1, 2}, new Double[][] { {90.0, 80.0, 70.0},
            {70.0, 80.0, 90.0},});
        double correlation = new PearsonCorrelationUserSimilarity(dataModel).userSimilarity(1, 2);
        assertCorrelationEquals(-1.0, correlation);
    }

    @Test
    public void testSimple() throws Exception {
        DataModel dataModel = getDataModel(new long[] {1, 2}, new Double[][] { {1.0, 2.0, 3.0},
            {2.0, 5.0, 6.0},});
        double correlation = new PearsonCorrelationUserSimilarity(dataModel).userSimilarity(1, 2);
        assertCorrelationEquals(0.9607689228305227, correlation);
    }

    @Test
    public void testSimpleWeighted() throws Exception {
        DataModel dataModel = getDataModel(new long[] {1, 2}, new Double[][] { {1.0, 2.0, 3.0},
            {2.0, 5.0, 6.0},});
        double correlation = new PearsonCorrelationUserSimilarity(dataModel, Weighting.WEIGHTED).userSimilarity(
            1,
            2);
        assertCorrelationEquals(0.9901922307076306, correlation);
    }

    @Test
    public void testRefresh() throws Exception {
        new PearsonCorrelationUserSimilarity(getDataModel()).refresh(null);
    }

}
