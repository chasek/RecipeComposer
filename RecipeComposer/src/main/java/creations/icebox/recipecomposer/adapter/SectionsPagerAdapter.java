package creations.icebox.recipecomposer.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.Locale;

import creations.icebox.recipecomposer.IngredientsFragment;
import creations.icebox.recipecomposer.R;
import creations.icebox.recipecomposer.RecipesFragment;

/**
 * A {@link android.support.v4.app.FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    static final int NUM_TABS = 2;
    static final String TAB = "***SECTIONS PAGER ADAPTER";
    Context mContext;

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        switch (position) {
            case 0:
                Log.d(TAB, "Ingredients Fragment new instance");
                return IngredientsFragment.newInstance();
            case 1:
                Log.d(TAB, "Recipes Fragment new instance");
                return RecipesFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return NUM_TABS;
    }

    public CharSequence getPageTitle(int position, Context context) {
        mContext = context;
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                Log.d(TAB, "Ingredients Fragment title setup");
                return mContext.getResources().getString(R.string.title_section1).toUpperCase(l);
            case 1:
                Log.d(TAB, "Recipes Fragment title setup");
                return mContext.getResources().getString(R.string.title_section2).toUpperCase(l);
        }
        return null;
    }
}