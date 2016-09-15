package paulo.android.multipanelproject;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Paulo Vila Nova on 2016-09-13.
 */

/*    A fragment is like a modular section of an activity,
        which has its own lifecycle, receives its own input events,
        and which you can add or remove while the activity is running*/

//To create a fragment, extend the Fragment class
public class MainPanelFragment extends Fragment {

    /*
     LayoutInflator takes the xml layout and puts it in a "view container" is the view the fragment should be attached to
     savedInstanceState is passed if the fragment is being re-constructed from a saved state

     inflate() is passed the layout xml to place, the optional view to attach to and
     true or false on whether to attach to the optional view named container
      */


    /*    R.layout.main_panel is a reference to a layout resource named main_panel.xml
        saved in the application resources*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.main_panel, container, false);

        return rootView;


    }

}
