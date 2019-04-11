package com.tollywood2bollywood.t2bliveapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// Adapter to Return Tab items along with their fragment
class SectionsPagerAdapter extends FragmentPagerAdapter{

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //Assigning Tab fragment to respective positions
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                CategoryOne categoryOne = new CategoryOne();
                return categoryOne;

            case 1:
                CategoryTwo categoryTwo = new CategoryTwo();
                return categoryTwo;
            case 2:
                CategoryThree categoryThree = new CategoryThree();
                return  categoryThree;
            case 3:
                CategoryFour categoryFour = new CategoryFour();
                return  categoryFour;
            case 4:
                CategoryFive categoryFive = new CategoryFive();
                return  categoryFive;
            case 5:
                CategorySix categorySix = new CategorySix();
                return  categorySix;
            case 6:
                CategorySeven categorySeven = new CategorySeven();
                return  categorySeven;
            default:
                return null;
        }
    }


    // Returning number of Tab items.
    @Override
    public int getCount() {
        return 7;
    }


    //  Assigning the name of Tab Items.
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "For You";
            case 1:
                return "World";
            case 2:
                return "Business";
            case 3:
                return "Technology";
            case 4:
                return "Sports";
            case 5:
                return "Beauty";
            case 6:
                return "Education";
            default:
                return null;
        }
    }
}
