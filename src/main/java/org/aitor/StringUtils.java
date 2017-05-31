package org.aitor;

/**
 * Created by amolina on 22/04/17.
 */
public class StringUtils {

    // Clean all non-alphabetic characters
    public static String[] clean(String aText) {
        String tmpNormalText = aText.replaceAll("[^A-Za-z]", " ");
        // Clean blank spaces
        return tmpNormalText.split("\\s+");
    }

}
