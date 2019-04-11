package com.tollywood2bollywood.t2bliveapp;


import android.app.LauncherActivity.ListItem;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//Fragment of Category one
public class CategoryOne extends Fragment {


    private static final String URL_DATA="https://api.myjson.com/bins/1dgd4j";

    public CategoryOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category_one, container, false);

        // Mapping and fetching the content to RecyclerView in Fragment one.
        RecyclerView cat1_newsList = (RecyclerView)view.findViewById(R.id.cat1_recyclerView_layout);
        cat1_newsList.setLayoutManager(new LinearLayoutManager(getActivity()));

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
        cat1_newsList.setAdapter(new NewsListAdapter(enterStories_heading,enterStories_image,getContext()));


        //Giving a line separation between recyclerView List.
        cat1_newsList.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));


        return view;
    }

}
