package com.company;
//package webscrape;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String url = "https://basicswithbabish.co/basicsepisodes/pizza-dough";
        Document doc = Jsoup.connect(url).get();

        String title = doc.title();
        Elements ingredient = doc.select("div.sqs-block-content");
        for (int i = 0; i < ingredient.size(); i++){
            String text = ingredient.get(i).text();
            String[] top = text.split(" ", 2);
            if (top[0].equals("Ingredients")){
                System.out.println(i);
                System.out.println(text);
                break;
            }
        }
//        String text = ingredient.get(1).text();
    }
}
