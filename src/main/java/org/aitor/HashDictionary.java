package org.aitor;

import java.util.*;

/**
 * Created by amolina on 22/04/17.
 */
public class HashDictionary implements Dictionary{

    public Map<String, Map<String, Object>> theDictionaries = new HashMap<String, Map<String, Object>>();
    private List<String> theLanguages = Arrays.asList("en-fr");

    // Load dictionary
    public void loadDictionary(String lang){
        if(!theDictionaries.containsKey(lang)){
            Map<String, Object> tmpLang = new HashMap<String, Object>();
            tmpLang.put("hello","bonjour");
            tmpLang.put("goodbye","Au Revoir");
            tmpLang.put("how", "que");
            tmpLang.put("are", "sont");
            tmpLang.put("you", "vous");
            theDictionaries.put(lang,tmpLang);
        }
    }

    // Translate
    public String translate(String lang, String words){

        loadDictionary(lang);
        String[] tmpWordToTranslate = StringUtils.clean(words);
        List<String> tmpResult = new LinkedList<String>(); // for order purposes
        for (String currentWord : tmpWordToTranslate) {
            if(theDictionaries.get(lang).containsKey(currentWord)){
                tmpResult.add(theDictionaries.get(lang).get(currentWord).toString());
            }else{
                tmpResult.add(currentWord); // We set the same word in case of we do not find the translation as google does
            }
        }
        // Return altogetther as a single String
        return String.join(" ", tmpResult);
    }

    @Override
    public List<String> availableLanguages() {
        return theLanguages;
    }

}