package com.example.s285822.aepjc;

public class PencilKata {
    private StringBuilder noteBook = new StringBuilder();
    private int durability = 4;

    public static void main(String[] args) {

    }

    //We are not considering that the input could also be empty
    void saveSentence(String newSentence){
        noteBook.append(" ").append(newSentence);
    }

    private void readFromNotebook(){
    }

    StringBuilder getNoteBook() {
        return noteBook;
    }


    String printWhatHasBeenWrittenIntoNotebook(){
        return noteBook.toString();
    }

    public int getDurability() {
        return durability;
    }
}
