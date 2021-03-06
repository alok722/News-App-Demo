package com.tollywood2bollywood.t2bliveapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategorySix extends Fragment {


    public CategorySix() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category_six, container, false);


        // Mapping and fetching content to RecycleView in category 6

        RecyclerView cat6_newsList = (RecyclerView)view.findViewById(R.id.cat6_recyclerView_layout);
        cat6_newsList.setLayoutManager(new LinearLayoutManager(getActivity()));
        String enterStories_heading[]={"A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients."};
        int enterStories_image[]={R.drawable.entertainment,
                R.drawable.entertainment,
                R.drawable.img1,
                R.drawable.img4,
                R.drawable.img2,
                R.drawable.entertainment,
                R.drawable.img5,
                R.drawable.img1,
                R.drawable.entertainment,
                R.drawable.entertainment,
                R.drawable.img1,
                R.drawable.entertainment,
                R.drawable.img1,
                R.drawable.img4,
                R.drawable.img2,
                R.drawable.img1,
                R.drawable.img3,
                R.drawable.entertainment,
                R.drawable.img2,
                R.drawable.img6,
                R.drawable.entertainment,
                R.drawable.entertainment
        };
        cat6_newsList.setAdapter(new NewsListAdapter(enterStories_heading,enterStories_image,getContext()));
        cat6_newsList.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));


        return view;


    }

}
