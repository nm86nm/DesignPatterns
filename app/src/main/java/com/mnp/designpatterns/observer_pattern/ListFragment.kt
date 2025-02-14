package com.mnp.designpatterns.observer_pattern

import android.app.Fragment
import android.content.ClipData
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider


/*
class ListFragment : Fragment() {
    private var model: SharedViewModel? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model =
            ViewModelProvider(requireActivity()).get<SharedViewModel>(SharedViewModel::class.java)
        itemSelector.setOnClickListener { item ->
            model!!.select(item)
        }
        model!!.getSelected().observe(
            getViewLifecycleOwner()
        ) { item: ClipData.Item? -> }
    }
}*/
