package com.moggido.engine.cf.taste.impl.similarity;

import org.junit.Assert;

import com.moggido.engine.cf.taste.impl.TasteTestCase;

public abstract class SimilarityTestCase extends TasteTestCase {

    static void assertCorrelationEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("Correlation is not NaN", Double.isNaN(actual));
        } else {
            Assert.assertTrue("Correlation is NaN", !Double.isNaN(actual));
            Assert.assertTrue("Correlation > 1.0", actual <= 1.0);
            Assert.assertTrue("Correlation < -1.0", actual >= -1.0);
            Assert.assertEquals(expected, actual, EPSILON);
        }
    }

}
