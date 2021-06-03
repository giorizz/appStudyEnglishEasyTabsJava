package br.com.studyenglish.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import br.com.studyenglish.R;

public class BichosFragment extends Fragment implements View.OnClickListener{

    private ImageButton btnDog, btnCat, btnLion, btnMonkey, btnCoo, btnCoow;
    private MediaPlayer mediaPlayer;
    public BichosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        btnDog = view.findViewById(R.id.img_dog);
        btnCat = view.findViewById(R.id.img_cat);
        btnLion = view.findViewById(R.id.img_lion);
        btnMonkey = view.findViewById(R.id.img_monkey);
        btnCoo = view.findViewById(R.id.img_coo);
        btnCoow = view.findViewById(R.id.img_cow);

        btnDog.setOnClickListener(this);
        btnCat.setOnClickListener(this);
        btnLion.setOnClickListener(this);
        btnMonkey.setOnClickListener(this);
        btnCoo.setOnClickListener(this);
        btnCoow.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_dog :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);
                startSound();
                break;
            case R.id.img_cat :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cat);
                startSound();
                break;
            case R.id.img_monkey :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.monkey);
                startSound();
                break;
            case R.id.img_coo :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sheep);
                startSound();
                break;
            case R.id.img_cow :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cow);
                startSound();
                break;
            case R.id.img_lion :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lion);
                startSound();
                break;
        }
    }

    public void startSound(){
        if (mediaPlayer != null){
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                }
            });
        }
    }
}