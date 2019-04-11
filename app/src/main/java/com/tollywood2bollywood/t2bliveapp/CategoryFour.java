package com.tollywood2bollywood.t2bliveapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


//Fragment of Category four
public class CategoryFour extends Fragment {


    public CategoryFour() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category_four, container, false);


        // Mapping and fetching the content to RecyclerView in Fragment four.
        RecyclerView cat4_newsList = (RecyclerView)view.findViewById(R.id.cat4_recyclerView_layout);
        cat4_newsList.setLayoutManager(new LinearLayoutManager(getActivity()));
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
        int enterStories_image[]={R.drawable.img6,
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
        cat4_newsList.setAdapter(new NewsListAdapter(enterStories_heading,enterStories_image,getContext()));

        //Giving a line separation between recyclerView List.
        cat4_newsList.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));



        return view;
    }

}
