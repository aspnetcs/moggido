package com.moggido.engine.cf.taste.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.cf.taste.impl.common.FastByIDMap;
import org.apache.mahout.cf.taste.impl.model.GenericDataModel;
import org.apache.mahout.cf.taste.impl.model.GenericPreference;
import org.apache.mahout.cf.taste.impl.model.GenericUserPreferenceArray;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.model.Preference;
import org.apache.mahout.cf.taste.model.PreferenceArray;
import org.apache.mahout.common.RandomUtils;
import org.junit.BeforeClass;

public abstract class TasteTestCase {

    public static final double EPSILON = 0.00001;

    @BeforeClass
    public static void setUp() throws Exception {
        RandomUtils.useTestSeed();
    }

    public static DataModel getDataModel(long[] userIDs, Double[][] prefValues) {
        FastByIDMap<PreferenceArray> result = new FastByIDMap<PreferenceArray>();
        for (int i = 0; i < userIDs.length; i++) {
            List<Preference> prefsList = new ArrayList<Preference>();
            for (int j = 0; j < prefValues[i].length; j++) {
                if (prefValues[i][j] != null) {
                    prefsList.add(new GenericPreference(userIDs[i], j, prefValues[i][j].floatValue()));
                }
            }
            if (!prefsList.isEmpty()) {
                result.put(userIDs[i], new GenericUserPreferenceArray(prefsList));
            }
        }
        return new GenericDataModel(result);
    }

    protected static boolean arrayContains(long[] array, long value) {
        for (long l : array) {
            if (l == value) {
                return true;
            }
        }
        return false;
    }

}
