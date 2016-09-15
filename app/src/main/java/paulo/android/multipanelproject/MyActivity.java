package paulo.android.multipanelproject;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MyActivity extends AppCompatActivity {

     /*A fragment must always be embedded in an activity
    and the fragment's lifecycle is directly affected by the host activity's lifecycle.*/
    //Fragment cannot exist without Activity !!!

    Fragment frag;
    FragmentTransaction fragTran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        frag = new MainPanelFragment();
        fragTran = getFragmentManager().beginTransaction().add(R.id.primary_panel, frag);
        fragTran.commit();

        frag = new ButtonPanelFragment();
        fragTran = getFragmentManager().beginTransaction().add(R.id.side_panel, frag);
        fragTran.commit();





//        // Hides the side panel when in portrait mode HIGHLIGHT THIS
//        // SECTION AND COMMENT IT OUT TO SEE WHAT HAPPENS
//        int screenOrientation = getResources().getConfiguration().orientation;
//        if(screenOrientation == Configuration.ORIENTATION_PORTRAIT){
//            hideSidePane();
//        }
    }

    // Hides the side panel
    private void hideSidePane(){
        View sidePane = findViewById(R.id.side_panel);
        if(sidePane.getVisibility() == View.VISIBLE){
            sidePane.setVisibility(View.GONE);
        }
    }


}
