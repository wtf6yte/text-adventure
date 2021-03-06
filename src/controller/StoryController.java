package controller;

import model.Event;
import model.Story;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StoryController {

    private Story story;
    private File storyTXT;
    private Scanner in;

    private Event actEvent;

    /*
    Ein Objekt der Klasse StoryController wird erzeugt und instanziiert ein Objekt der Klasse File und Story.
     */
    public StoryController() {
        storyTXT = new File("story.txt");
        story = new Story();
    }

    /*
    Es wird mit einem Scanner für bestimmte Zeichen in einer Textdatei ein neues Event und eine neue Choice für dieses Event und parameter für diese Choice erstellt und abgespeichert.
     */
    public void getStoryFromTxt(){
        try {
            in = new Scanner(storyTXT);
            while(in.hasNextLine()){
                String line = in.nextLine();
                if(line.equals("***")){
                    story.insertNewEvent();
                    story.getAllEvents()[story.getAllEvents().length-1].setIntroduction(in.nextLine());
                }else if(line.equals("**")){
                    story.getAllEvents()[story.getAllEvents().length-1].insertNewChoice();
                    story.getAllEvents()[story.getAllEvents().length-1].getAllChoices()[story.getAllEvents()[story.getAllEvents().length-1].getAllChoices().length-1].setChoiceIntro(in.nextLine());
                }else if(line.equals("*")){
                    story.getAllEvents()[story.getAllEvents().length-1].getAllChoices()[story.getAllEvents()[story.getAllEvents().length-1].getAllChoices().length-1].setChoiceOutcome(in.nextLine());
                }else if(line.equals("#1")){
                    story.getAllEvents()[story.getAllEvents().length-1].getAllChoices()[story.getAllEvents()[story.getAllEvents().length-1].getAllChoices().length-1].setPar1(in.nextInt());
                }else if(line.equals("#2")){
                    story.getAllEvents()[story.getAllEvents().length-1].getAllChoices()[story.getAllEvents()[story.getAllEvents().length-1].getAllChoices().length-1].setPar2(in.nextInt());
                }else if(line.equals("#3")){
                    story.getAllEvents()[story.getAllEvents().length-1].getAllChoices()[story.getAllEvents()[story.getAllEvents().length-1].getAllChoices().length-1].setPar3(in.nextInt());
                }else if(line.equals("#4")){
                    story.getAllEvents()[story.getAllEvents().length-1].getAllChoices()[story.getAllEvents()[story.getAllEvents().length-1].getAllChoices().length-1].setPar4(in.nextInt());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }

    /*
    activeEvent wird ein zufälliges Event aus allen abgespeicherten Events zugewiesen.
     */
    public void startNewEvent(){
        actEvent = story.getAllEvents()[(int)(Math.random()*story.getAllEvents().length)];
    }


    public Event getActEvent(){
        return actEvent;
    }
}
