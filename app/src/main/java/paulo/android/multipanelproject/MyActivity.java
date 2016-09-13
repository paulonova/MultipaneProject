package paulo.android.multipanelproject;

import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends FragmentActivity {

     /*A fragment must always be embedded in an activity
    and the fragment's lifecycle is directly affected by
    the host activity's lifecycle.*/
    //Fragment cannot exist without Activity !!!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


        // Hides the side panel when in portrait mode HIGHLIGHT THIS
        // SECTION AND COMMENT IT OUT TO SEE WHAT HAPPENS
        int screenOrientation = getResources().getConfiguration().orientation;
        if(screenOrientation == Configuration.ORIENTATION_PORTRAIT){
            hideSidePane();
        }else {
            View bttnPanel = findViewById(R.id.main_panel);
            if(bttnPanel.getVisibility() == View.VISIBLE){
                bttnPanel.setVisibility(View.GONE);
            }
        }


    }

    // Hides the side panel
    private void hideSidePane(){
        View sidePane = findViewById(R.id.side_panel);
        if(sidePane.getVisibility() == View.VISIBLE){
            sidePane.setVisibility(View.GONE);
        }
    }


}
