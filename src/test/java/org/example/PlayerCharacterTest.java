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
}