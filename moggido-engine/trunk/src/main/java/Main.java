import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.cf.taste.impl.eval.RMSRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

import com.moggido.engine.cf.taste.MoggidoDataModel;
import com.moggido.engine.cf.taste.MoggidoRecommender;
import com.moggido.engine.cf.taste.MoggidoRecommenderBuilder;

/**
 *
 * @author ccadete
 *
 */
public class Main {

    public static void test1() throws Exception {

        String rating = "u1.base";
        File ratingsFile = new File(rating);

        String taste = "u2.test";
        File tasteFile = new File(taste);

        DataModel model = new MoggidoDataModel(ratingsFile);

        MoggidoRecommender recommender = new MoggidoRecommender(model);
        List<RecommendedItem> items = recommender.recommend(474, 10);

        for (RecommendedItem item : items) {
            System.out.println(item);
        }
    }

    public static void test2() throws Exception {
        RMSRecommenderEvaluator evaluator = new RMSRecommenderEvaluator();

        String rating = "u1.base";
        File ratingFile = new File(rating);
        DataModel model = new MoggidoDataModel(ratingFile);

        List<String> total = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            double evaluation = evaluator.evaluate(new MoggidoRecommenderBuilder(), null, model, 0.8, 1.0);

            total.add(String.valueOf(evaluation));
        }

        for (String s : total) {
            System.out.println(s);
        }

    }

    public static void main(String... args) throws Exception {

        // test1();
        test2();
    }
}
