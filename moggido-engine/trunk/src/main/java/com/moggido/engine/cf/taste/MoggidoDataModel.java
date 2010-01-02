package com.moggido.engine.cf.taste;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;

/**
 * This is a moggido file data model used for testing purposes
 *
 * @author ccadete
 *
 */
public final class MoggidoDataModel extends FileDataModel {

    public MoggidoDataModel(File ratingsFile) throws IOException {
        super(ratingsFile);
    }

    @Override
    public String toString() {
        return "MoggidoDataModel";
    }

    /**
     * This method create a compatible datamodel from the movielens rating files
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //convertFile(new File("u.data"));
        System.out.println(new File(".").getAbsolutePath());
        MoggidoDataModel data = new MoggidoDataModel(new File("u1.base"));
        data.buildModel();
    }
}
