package com.example.s285822.aepjc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PencilKataTest {
    private PencilKata pencilKata;

    @Before
    public void stubbing(){
        pencilKata = new PencilKata();
    }

    @Test
    public void whenUserHasNotWrittenSomethingNotebookThenLengthShouldBeZero(){
        assertEquals(0, pencilKata.getNoteBook().length());
    }

    @Test
    public void whenUserHasWrittenInToTheNotebookThenLengthShouldNotBeZero(){
        pencilKata.saveSentence("This is a test");
        assertNotEquals(0, pencilKata.getNoteBook().length());
    }

    @Test
    public void whenUserHasWrittenSomethingThenThatSomethingShouldMatch(){
        pencilKata.saveSentence("This is a test1");
        pencilKata.saveSentence("This is a test2");
        assertEquals(" This is a test1 This is a test2", pencilKata.printWhatHasBeenWrittenIntoNotebook());
    }

    @Test
    public void whenPencilIsNotUsedIthasDurabilityOf4(){
        assertEquals(4, pencilKata.getDurability());
    }



}
