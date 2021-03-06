/********************************************************************************************
 * Copyright (C) 2020 Acoustic, L.P. All rights reserved.
 *
 * NOTICE: This file contains material that is confidential and proprietary to
 * Acoustic, L.P. and/or other developers. No license is granted under any intellectual or
 * industrial property rights of Acoustic, L.P. except as may be provided in an agreement with
 * Acoustic, L.P. Any unauthorized copying or distribution of content from this file is
 * prohibited.
 ********************************************************************************************/
package com.tl.uic.appDarkHolo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;

import com.tl.uic.appDarkHolo.util.TLHelper;

/**
 * @author ohernandezltmac
 */
public class ControlsFragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.controls2, container, false);

        RadioButton rb = v.findViewById(R.id.radioButton1);
        rb.setOnClickListener(TLHelper.getOnClickListener());

        Spinner s = v.findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        s.setSelection(0, false);
        s.setOnItemSelectedListener(TLHelper.onItemSelected());


        ProgressBar pb1 = v.findViewById(R.id.progressBar1);
        pb1.setOnClickListener(TLHelper.getOnClickListener());

        ProgressBar pb2 = v.findViewById(R.id.progressBar2);
        pb2.setOnClickListener(TLHelper.getOnClickListener());

        ProgressBar pb3 = v.findViewById(R.id.progressBar3);
        pb3.setOnClickListener(TLHelper.getOnClickListener());

        ProgressBar pb4 = v.findViewById(R.id.progressBar4);
        pb4.setMax(100);
        pb4.setProgress(45);
        pb4.setOnClickListener(TLHelper.getOnClickListener());

        SeekBar sb = v.findViewById(R.id.seekBar1);
        sb.setOnSeekBarChangeListener(TLHelper.getOnSeekBarChangeListener());

        RadioGroup rg = v.findViewById(R.id.radioGroup1);
        rg.setOnCheckedChangeListener(TLHelper.getOnCheckedChangeListener());

        RatingBar rab = v.findViewById(R.id.ratingBar1);
        rab.setOnRatingBarChangeListener(TLHelper.getOnRatingBarChangeListener());
        return v;
    }
}
