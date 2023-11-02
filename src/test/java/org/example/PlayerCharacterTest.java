package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void getX_return0_WhenStart() {
        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerCharakter.getX();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void getY_return0_WhenStart() {
        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerCharakter.getY();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_returnY1_WhenW() {
        //GIVEN
        String direction = "w";
        int expected = 1;
        //WHEN
        int actual = PlayerCharakter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_returnY2_WhenWW() {
        //GIVEN
        String direction = "w";
        int expected = 2;
        //WHEN
        int actual = PlayerCharakter.move(direction);
        actual = PlayerCharakter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }
}