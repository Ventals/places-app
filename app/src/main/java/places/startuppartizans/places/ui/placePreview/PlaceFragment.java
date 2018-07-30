package places.startuppartizans.places.ui.placePreview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

import places.startuppartizans.places.entity.PlaceSn;
import places.startuppartizans.places.R;

public class PlaceFragment extends Fragment/* implements NavigationView.OnNavigationItemSelectedListener */{

    View view;
    /*DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;*/

    PlaceSnRecyclerAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.place_preview_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Toolbar toolbar = view.findViewById(R.id.place_toolbar);
        RecyclerView recyclerView = view.findViewById(R.id.place_rv);
        TextView placeName = view.findViewById(R.id.place_name_text);

        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.place_preview);

        placeName.bringToFront();
        placeName.setText("Karting Need For Speed!");

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);

        adapter = new PlaceSnRecyclerAdapter();
        adapter.setData(setModels());
        recyclerView.setAdapter(adapter);
      /*

        drawer = view.findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                getActivity(), drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = view.findViewById(R.id.navigation_view);
        //navigationView.setNavigationItemSelectedListener(this);

        View headerLayout = navigationView.inflateHeaderView(R.layout.nav_header_profile);
        SearchView searchView = headerLayout.findViewById(R.id.search_view_nav);*/
    }

    private List<PlaceSn> setModels(){
        return Arrays.asList(new PlaceSn("Telegram", "878-788-573"),
                new PlaceSn("Viber", "541-845-424"),
                new PlaceSn("WhatsApp", "784-337-007"));
    }

   /*
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }

        switch (item.getItemId()) {
            case R.id.nav_settings:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.nav_settings) {
            //open settings
        }

        DrawerLayout drawer = view.findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }*/
}
