package org.aitor;

import java.util.Scanner;

/**
 * Created by amolina on 22/04/17.
 */
public class TranslatorApp {

    Scanner theScanner = new Scanner(System.in);
    Dictionary dic = new HashDictionary();

    public static void main(String[] args) {
        TranslatorApp ta = new TranslatorApp();
        ta.start();
    }

    public void start(){
        String tmpDic;
        //String tmpWordPhrase;
        String tmpContinue;
        boolean tmpStop = false;
        while(!tmpStop) {
            System.out.println(Literals.WHICH_DICTIONARY);
            tmpDic = theScanner.nextLine();
            final String dicto = tmpDic; // To use from a lamba
            // Needed Java 8 to use stream API or I could have used a hash instead of a list
            if(tmpDic!=null && tmpDic.length()>0 && !dic.availableLanguages().stream().anyMatch(str -> str.trim().equals(dicto))){
                System.out.println(String.format(Literals.LANG_NOT_FOUND_TRY_AGAIN, tmpDic));
                continue;
            }
            System.out.println(String.format(Literals.DICTIONARY, tmpDic));
            System.out.println(Literals.ASK_WORD_PHRASE);
            String tmpWordPhrase = theScanner.nextLine();
            System.out.println(dic.translate(tmpDic, tmpWordPhrase));
            System.out.println(Literals.THANKS);
            tmpContinue = theScanner.next();
            tmpStop = "N".equalsIgnoreCase(tmpContinue);
        }

    }
}