package caorganizingchaos.ubc.httpblogs.chingchongcha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RSPActivity extends AppCompatActivity {
    private Button mRockButton;
    private Button mPaperButton;
    private Button mScissorsButton;
    private TextView mComputerChoice;


    private void showResult(Game game){
        Weapon aiWeapon = game.getAIWeapon();
        mComputerChoice.setText(aiWeapon.toString());
        int messageResId;
        if (game.didUserWin()){
            messageResId = R.string.win_toast;
        } else {messageResId = R.string.lose_toast;}
        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsp);

        mComputerChoice = (TextView) findViewById(R.id.computer_choice_textview);

        mRockButton = (Button) findViewById(R.id.rock_button);
        mRockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Game game = new Game(Weapon.ROCK);
                showResult(game);
            }
        });

        mPaperButton = (Button) findViewById(R.id.paper_button);

        mPaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Game game = new Game(Weapon.PAPER);
                showResult(game);
            }
        });
        mScissorsButton = (Button) findViewById(R.id.scissors_button);

        mScissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Game game = new Game(Weapon.SCISSORS);
                showResult(game);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rs, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
