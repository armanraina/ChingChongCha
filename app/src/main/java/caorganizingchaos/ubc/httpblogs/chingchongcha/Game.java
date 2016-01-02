package caorganizingchaos.ubc.httpblogs.chingchongcha;

/**
 * Created by Arman on 2015-12-31.
 */
public class Game {
    private Weapon mUserWeapon;
    private Weapon mAIWeapon;


    public Game(Weapon userWeapon) {
        mUserWeapon = userWeapon;
        mAIWeapon = Weapon.getRandomWeapon();
        while (mUserWeapon.equals(mAIWeapon)) {
            mAIWeapon = Weapon.getRandomWeapon();
        }

    }


    public Weapon getAIWeapon() {
        return mAIWeapon;
    }

    public boolean didUserWin() {
        return (mUserWeapon.beats(mAIWeapon));
    }
}


