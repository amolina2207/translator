package org.aitor;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by amolina on 22/04/17.
 */
public class TestTraductor {

    @Test
    public void checkMapOfLanguages(){

        HashDictionary dic = new HashDictionary();
        String lang = "en-fr";
        dic.loadDictionary(lang);
        Map<String, Object> dicHash = dic.theDictionaries.get(lang);

        assertThat(dicHash, IsMapContaining.hasEntry("goodbye","Au Revoir"));

        assertThat(dicHash, not(IsMapContaining.hasEntry("Aitor", "Molina")));

        //check error
        //assertThat(dicHash, not(IsMapContaining.hasEntry("goodbye","Au Revoir")));

        assertThat(dicHash, IsMapContaining.hasValue("Au Revoir"));

    }

}
