package com.tollywood2bollywood.t2bliveapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CategoryFive extends Fragment {



    //Fragment of Category five

    public CategoryFive() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category_five, container, false);


        // Mapping and fetching the content to RecyclerView in Fragment five.

        RecyclerView cat5_newsList = (RecyclerView)view.findViewById(R.id.cat5_recyclerView_layout);
        cat5_newsList.setLayoutManager(new LinearLayoutManager(getActivity()));
        String enterStories_heading[]={"A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "A meatier lorem ipsum because who doesn’t love bacon? Certain to help grease even the most pig-headed clients.",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit."};


        int enterStories_image[]={R.drawable.entertainment,
                R.drawable.img1,
                R.drawable.entertainment,
                R.drawable.img3,
                R.drawable.img2,
                R.drawable.entertainment,
                R.drawable.img6,
                R.drawable.entertainment,
                R.drawable.img1,
                R.drawable.entertainment,
                R.drawable.img4,
                R.drawable.entertainment,
                R.drawable.entertainment,
                R.drawable.img3,
                R.drawable.entertainment,
                R.drawable.entertainment,
                R.drawable.img4,
                R.drawable.entertainment,
                R.drawable.img1,
                R.drawable.img6,
                R.drawable.entertainment,
                R.drawable.img1
        };

        cat5_newsList.setAdapter(new NewsListAdapter(enterStories_heading,enterStories_image,getContext()));

        //Giving a line separation between recyclerView List.
        cat5_newsList.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));


        return view;
    }

}
