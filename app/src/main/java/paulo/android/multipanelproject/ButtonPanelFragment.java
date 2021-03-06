package paulo.android.multipanelproject;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Paulo Vila Nova on 2016-09-13.
 */
public class ButtonPanelFragment extends Fragment {


    /*  The container parameter passed to onCreateView()
    is the parent ViewGroup (from the activity's layout)
      in which your fragment layout will be inserted. */

    Button button1;
    Button button2;
    Button button3;
    Fragment frag;
    FragmentTransaction fragTrans;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.button_panel, container, false);


        button1 = (Button)rootView.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new MainPanelFragment();
                fragTrans = getFragmentManager().beginTransaction().replace(R.id.primary_panel, frag);
                fragTrans.commit();

            }
        });

        button2 = (Button)rootView.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new MainPanelFragment2();
                fragTrans = getFragmentManager().beginTransaction().replace(R.id.primary_panel, frag);
                fragTrans.commit();

            }
        });

        button3 = (Button)rootView.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new MainPanelFragment3();
                fragTrans = getFragmentManager().beginTransaction().replace(R.id.primary_panel, frag);
                fragTrans.commit();

            }
        });


        return rootView;

    }

     /* The inflate() method takes three arguments:

            1) The resource ID of the layout you want to inflate.

            2) The ViewGroup to be the parent of the inflated layout.
                Passing the container is important in order for the system to apply layout parameters to the root view
                of the inflated layout, specified by the parent view in which it's going.

            3)A boolean indicating whether the inflated layout should be attached to the ViewGroup
            (the second parameter) during inflation. (In this case, this is false because the system
                is already inserting the inflated layout into the container—passing true would create
                a redundant view group in the final layout.)

            */

}
