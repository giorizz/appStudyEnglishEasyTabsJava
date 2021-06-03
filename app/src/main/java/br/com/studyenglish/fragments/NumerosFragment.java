package br.com.studyenglish.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import br.com.studyenglish.R;

public class NumerosFragment extends Fragment implements View.OnClickListener{

    private ImageButton btn1, btn2, btn3, btn4, btn5, btn6;
    private MediaPlayer mediaPlayer;

    public NumerosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        btn1 = view.findViewById(R.id.img_one);
        btn2 = view.findViewById(R.id.img_two);
        btn3 = view.findViewById(R.id.img_tree);
        btn4 = view.findViewById(R.id.img_four);
        btn5 = view.findViewById(R.id.img_five);
        btn6 = view.findViewById(R.id.img_six);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        return view;
}

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_one :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.one);
                startSound();
                break;
            case R.id.img_two :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.two);
                startSound();
                break;
            case R.id.img_tree :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.three);
                startSound();
                break;
            case R.id.img_four :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.four);
                startSound();
                break;
            case R.id.img_five :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.five);
                startSound();
                break;
            case R.id.img_six :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.six);
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