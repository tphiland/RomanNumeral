package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGenerateLetterAmounts() {
        App.generateLetterAmounts(App.letterAmount, -1);
        assertEquals(0 , App.letterAmount[0]);
        assertEquals(0 , App.letterAmount[1]);
        assertEquals(0 , App.letterAmount[2]);
        assertEquals(0 , App.letterAmount[3]);
        assertEquals(0 , App.letterAmount[4]);
        assertEquals(0 , App.letterAmount[5]);
        assertEquals(1 , App.letterAmount[6]);

        App.generateLetterAmounts(App.letterAmount, 0);
        assertEquals(0 , App.letterAmount[0]);
        assertEquals(0 , App.letterAmount[1]);
        assertEquals(0 , App.letterAmount[2]);
        assertEquals(0 , App.letterAmount[3]);
        assertEquals(0 , App.letterAmount[4]);
        assertEquals(0 , App.letterAmount[5]);
        assertEquals(0 , App.letterAmount[6]);

        App.generateLetterAmounts(App.letterAmount, 4);
        assertEquals(0 , App.letterAmount[0]);
        assertEquals(0 , App.letterAmount[1]);
        assertEquals(0 , App.letterAmount[2]);
        assertEquals(0 , App.letterAmount[3]);
        assertEquals(0 , App.letterAmount[4]);
        assertEquals(0 , App.letterAmount[5]);
        assertEquals(4 , App.letterAmount[6]);

        App.generateLetterAmounts(App.letterAmount, 5);
        assertEquals(0 , App.letterAmount[0]);
        assertEquals(0 , App.letterAmount[1]);
        assertEquals(0 , App.letterAmount[2]);
        assertEquals(0 , App.letterAmount[3]);
        assertEquals(0 , App.letterAmount[4]);
        assertEquals(1 , App.letterAmount[5]);
        assertEquals(0 , App.letterAmount[6]);

        App.generateLetterAmounts(App.letterAmount, 7);
        assertEquals(0 , App.letterAmount[0]);
        assertEquals(0 , App.letterAmount[1]);
        assertEquals(0 , App.letterAmount[2]);
        assertEquals(0 , App.letterAmount[3]);
        assertEquals(0 , App.letterAmount[4]);
        assertEquals(1 , App.letterAmount[5]);
        assertEquals(2 , App.letterAmount[6]);

        App.generateLetterAmounts(App.letterAmount, 10);
        assertEquals(0 , App.letterAmount[0]);
        assertEquals(0 , App.letterAmount[1]);
        assertEquals(0 , App.letterAmount[2]);
        assertEquals(0 , App.letterAmount[3]);
        assertEquals(1 , App.letterAmount[4]);
        assertEquals(0 , App.letterAmount[5]);
        assertEquals(0 , App.letterAmount[6]);

        App.generateLetterAmounts(App.letterAmount, 14);
        assertEquals(0 , App.letterAmount[0]);
        assertEquals(0 , App.letterAmount[1]);
        assertEquals(0 , App.letterAmount[2]);
        assertEquals(0 , App.letterAmount[3]);
        assertEquals(1 , App.letterAmount[4]);
        assertEquals(0 , App.letterAmount[5]);
        assertEquals(4 , App.letterAmount[6]);

        App.generateLetterAmounts(App.letterAmount, 17);
        assertEquals(0 , App.letterAmount[0]);
        assertEquals(0 , App.letterAmount[1]);
        assertEquals(0 , App.letterAmount[2]);
        assertEquals(0 , App.letterAmount[3]);
        assertEquals(1 , App.letterAmount[4]);
        assertEquals(1 , App.letterAmount[5]);
        assertEquals(2 , App.letterAmount[6]);

        App.generateLetterAmounts(App.letterAmount, 50);
        assertEquals(0 , App.letterAmount[0]);
        assertEquals(0 , App.letterAmount[1]);
        assertEquals(0 , App.letterAmount[2]);
        assertEquals(1 , App.letterAmount[3]);
        assertEquals(0 , App.letterAmount[4]);
        assertEquals(0 , App.letterAmount[5]);
        assertEquals(0 , App.letterAmount[6]);

        App.generateLetterAmounts(App.letterAmount, 55);
        assertEquals(0 , App.letterAmount[0]);
        assertEquals(0 , App.letterAmount[1]);
        assertEquals(0 , App.letterAmount[2]);
        assertEquals(1 , App.letterAmount[3]);
        assertEquals(0 , App.letterAmount[4]);
        assertEquals(1 , App.letterAmount[5]);
        assertEquals(0 , App.letterAmount[6]);

        App.generateLetterAmounts(App.letterAmount, 125);
        assertEquals(0 , App.letterAmount[0]);
        assertEquals(0 , App.letterAmount[1]);
        assertEquals(1 , App.letterAmount[2]);
        assertEquals(0 , App.letterAmount[3]);
        assertEquals(2 , App.letterAmount[4]);
        assertEquals(1 , App.letterAmount[5]);
        assertEquals(0 , App.letterAmount[6]);

        App.generateLetterAmounts(App.letterAmount, 2459);
        assertEquals(2 , App.letterAmount[0]);
        assertEquals(0 , App.letterAmount[1]);
        assertEquals(4 , App.letterAmount[2]);
        assertEquals(1 , App.letterAmount[3]);
        assertEquals(0 , App.letterAmount[4]);
        assertEquals(1 , App.letterAmount[5]);
        assertEquals(4 , App.letterAmount[6]);
    }

    @Test
    public void testAppendLetters() {
        App.generateLetterAmounts(App.letterAmount, -1);
        App.appendLetters(App.letterAmount);
        assertEquals("I", App.roman.toString());
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 0);
        App.appendLetters(App.letterAmount);
        assertEquals("", App.roman.toString());
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 4);
        App.appendLetters(App.letterAmount);
        assertEquals("IIII", App.roman.toString());
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 5);
        App.appendLetters(App.letterAmount);
        assertEquals("V", App.roman.toString());
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 7);
        App.appendLetters(App.letterAmount);
        assertEquals("VII", App.roman.toString());
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 10);
        App.appendLetters(App.letterAmount);
        assertEquals("X", App.roman.toString());
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 14);
        App.appendLetters(App.letterAmount);
        assertEquals("XIIII", App.roman.toString());
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 17);
        App.appendLetters(App.letterAmount);
        assertEquals("XVII", App.roman.toString());
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 50);
        App.appendLetters(App.letterAmount);
        assertEquals("L", App.roman.toString());
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 55);
        App.appendLetters(App.letterAmount);
        assertEquals("LV", App.roman.toString());
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 125);
        App.appendLetters(App.letterAmount);
        assertEquals("CXXV", App.roman.toString());
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 2459);
        App.appendLetters(App.letterAmount);
        assertEquals("MMCCCCLVIIII", App.roman.toString());
        App.roman=new StringBuilder();
    }

    @Test
    public void testReplaceLetters() {
        App.generateLetterAmounts(App.letterAmount, -1);
        App.appendLetters(App.letterAmount);
        App.replaceLetters();
        assertEquals("I", App.roman2);
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 0);
        App.appendLetters(App.letterAmount);
        App.replaceLetters();
        assertEquals("", App.roman2);
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 4);
        App.appendLetters(App.letterAmount);
        App.replaceLetters();
        assertEquals("IV", App.roman2);
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 5);
        App.appendLetters(App.letterAmount);
        App.replaceLetters();
        assertEquals("V", App.roman2);
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 7);
        App.appendLetters(App.letterAmount);
        App.replaceLetters();
        assertEquals("VII", App.roman2);
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 10);
        App.appendLetters(App.letterAmount);
        App.replaceLetters();
        assertEquals("X", App.roman2);
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 14);
        App.appendLetters(App.letterAmount);
        App.replaceLetters();
        assertEquals("XIV", App.roman2);
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 17);
        App.appendLetters(App.letterAmount);
        App.replaceLetters();
        assertEquals("XVII", App.roman2);
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 50);
        App.appendLetters(App.letterAmount);
        App.replaceLetters();
        assertEquals("L", App.roman2);
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 55);
        App.appendLetters(App.letterAmount);
        App.replaceLetters();
        assertEquals("LV", App.roman2);
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 125);
        App.appendLetters(App.letterAmount);
        App.replaceLetters();
        assertEquals("CXXV", App.roman2);
        App.roman=new StringBuilder();

        App.generateLetterAmounts(App.letterAmount, 2459);
        App.appendLetters(App.letterAmount);
        App.replaceLetters();
        assertEquals("MMCDLIX", App.roman2);
        App.roman=new StringBuilder();
    }
}
