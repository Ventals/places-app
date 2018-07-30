package places.startuppartizans.places.ui.login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

import places.startuppartizans.places.ui.placePreview.PlaceFragment;
import places.startuppartizans.places.R;

public class LoginFragment extends Fragment {

    View view;
    Button button;

    private int flag = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.login_fragment, container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button = view.findViewById(R.id.login_button);

        makeTransparent();
        setOnClickListener();
    }

    private void setOnClickListener(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPlaceFragment();
                clearTransparent();
            }
        });
    }

    private void openPlaceFragment(){
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_container, new PlaceFragment()).commit();
    }

    public void makeTransparent(){
        getActivity().getWindow().addFlags(flag);
    }

    public void clearTransparent(){
        getActivity().getWindow().clearFlags(flag);
    }

}
