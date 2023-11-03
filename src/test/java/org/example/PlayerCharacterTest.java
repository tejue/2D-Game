package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    //War NICHT Teil der Aufgabe. Hiermit könnt ihr aber x & y in PlayerCharacter static machen ohne das sich eure Tests gegenseitig manipulieren.
    @BeforeEach
    // -> Wird vor jedem Test ausgeführt
    void resetAllXY() {
        //Setze x & y wieder auf 0. Das macht jeden Test wieder erwartbar, da immer von x&y=0 ausgegangen wird.
        PlayerCharacter.x =0;
        PlayerCharacter.y =0;
    }
    @Test
    void getX_return0_WhenStart() {
        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerCharacter.getX();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void getY_return0_WhenStart() {
        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerCharacter.getY();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_returnYPlus1_WhenW() {
        //GIVEN
        String direction = "w";
        int expected = 1;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }

/*    @Test
    void move_returnYPlus2_WhenWW() {
        //GIVEN
        String direction = "w";
        int expected = 2;
        //WHEN
        int actual = PlayerCharakter.move(direction);
        actual = PlayerCharakter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }
*/

    @Test
    void move_returnYMinus1_WhenS() {
        //GIVEN
        String direction = "s";
        int expected = -1;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_returnXPlus1_WhenD() {
        //GIVEN
        String direction = "d";
        int expected = 1;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_returnXMinus1_WhenA() {
        //GIVEN
        String direction = "a";
        int expected = -1;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }
}


