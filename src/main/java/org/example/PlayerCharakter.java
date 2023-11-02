package org.example;

import java.util.Objects;

public class PlayerCharakter {

    static int x = 0;
    static int y = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int move(String direction) {

        if (direction.equals("w")) {
            y++;
            return getY();
        }
        return 0;

    }
}
