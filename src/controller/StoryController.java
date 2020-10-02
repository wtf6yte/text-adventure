package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StoryController {

    private int[] story;
    private File storyTXT;
    private BufferedReader in;

    public StoryController() {
        story = new int[0];
        storyTXT = new File("story.txt");
    }

    public String answer(int answer){
        addStory(answer);
        return getStoryFromTxt();
    }

    private String getStoryFromTxt(){
        String help = "test";

        try {
            in = new BufferedReader(new FileReader(storyTXT));
            String str = "0";
            for(int i = 0; i<story.length; i++){
                str = "."+story[i];
            }
            /*while() {

            }*/

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {

                }
            }
        }

        return help;
    }

    private void addStory(int a){
        int[] help = new int[story.length+1];
        for(int i = 0; i<story.length; i++){
            help[i] = story[i];
        }
        help[help.length-1] = a;
        story = help;
    }
}