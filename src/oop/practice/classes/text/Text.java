package oop.practice.classes.text;

import java.util.ArrayList;

public class Text {
    private Word header;
    private ArrayList<Sentence> sentences;

    public Text(Word header) {
        this.header = header;
    }

    public Text(Word header, Sentence sentence) {
        this.header = header;
        this.sentences = new ArrayList<>();
        sentences.add(sentence);
    }

    public Text(Word header, ArrayList<Sentence> sentences) {
        this.header = header;
        this.sentences = sentences;
    }

    public void addSentence(Sentence sentence) {
        this.sentences.add(sentence);
    }

    public void printText() {
        for (Sentence sentence : this.sentences) {
            System.out.print(sentence);
        }
    }

    public void printHeader() {
        System.out.println(header);
    }

    public Word getHeader() {
        return header;
    }

    public void setHeader(Word header) {
        this.header = header;
    }
}
