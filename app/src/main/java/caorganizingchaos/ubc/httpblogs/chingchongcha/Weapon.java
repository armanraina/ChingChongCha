package caorganizingchaos.ubc.httpblogs.chingchongcha;

import java.util.Random;

/**
 * Created by Arman on 2015-12-31.
 */
public enum Weapon {
    ROCK, PAPER, SCISSORS;

    private static final Weapon[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static Weapon getRandomWeapon()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
    public boolean beats(Weapon weapon){
        switch (this) {
            case ROCK:
            switch (weapon){
                case PAPER: return false;
                case SCISSORS: return true;
            }
            case PAPER:
                switch (weapon){
                    case SCISSORS: return false;
                    case ROCK: return true;
                }
            case SCISSORS:
                switch (weapon){
                    case ROCK: return false;
                    case PAPER: return true;
                }
            default: return false;
        }
    }
}

