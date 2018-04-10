package vn.javis.tablayoutsample;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Admin on 4/10/18.
 */

public class FragmentTabLayoutSample extends android.support.v4.app.Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Context context;
    private MainActivity mainActivity;
    private View mView;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_sample,container,false);
        return mView;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        tabLayout = (TabLayout) mView.findViewById(R.id.tabLayout);
        viewPager = (ViewPager) mView.findViewById(R.id.viewpager);
        initTabControl();
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

    }
    private void initTabControl(){
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tabLayout.getSelectedTabPosition()) {
                    case 1:
                        //Todo tab selected
                        break;
                    case 2:
                        break;
                    case 3:
                        break;

                    default:

                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    //Todo setup ViewPaper
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getFragmentManager());
        adapter.addFragment(new Fragment1(),"1");
        adapter.addFragment(new Fragment2(),"2");
        adapter.addFragment(new Fragment3(),"3");
        viewPager.setAdapter(adapter);
    }
}
