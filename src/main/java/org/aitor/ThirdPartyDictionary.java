package org.aitor;

import java.util.List;

/**
 * Created by amolina on 22/04/17.
 */
public class ThirdPartyDictionary implements Dictionary {


    // Could be a WebService to Google/WordReference or whatever you prefer

    @Override
    public String translate(String lang, String word) {
        return null;
    }

    @Override
    public List<String> availableLanguages() {
        return null;
    }


}
