package org.aitor;


import java.util.List;

/**
 * Created by amolina on 22/04/17.
 */
public interface Dictionary {

    String translate(String lang, String word);
    List<String> availableLanguages();
}
