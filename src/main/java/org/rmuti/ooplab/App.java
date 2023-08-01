package org.rmuti.ooplab;

import org.rmuti.ooplab.ui.AbstractClick;
import org.rmuti.ooplab.ui.CardDie;
import org.rmuti.ooplab.ui.Die;
import org.rmuti.ooplab.ui.DisplayMessage;
import org.rmuti.ooplab.util.WebReader;

import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println( "Hello World!" );
//        WebReader webReader = new WebReader();
//        String text = webReader.read("https://en.wikipedia.org/wiki/Java_(programming_language)");
//        String[] arrText = text.split(" ");
//        int counter = 0;
//        for (int i = 0; i < arrText.length; i++) {
//            if("the".equals(arrText[i])){
//                counter++;
//            }
//        }
//        System.out.println(counter);

//        DisplayMessage displayMessage = new DisplayMessage("lab02");
//        displayMessage.drawMessage("abcd");

        CardDie cardDie = new CardDie();
        cardDie.setOnClick(new AbstractClick() {
            @Override
            public int getRandomDie() {
                return new Random().nextInt(6);
            }
        });

    }
}
