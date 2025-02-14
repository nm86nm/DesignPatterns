package com.mnp.designpatterns.observer_pattern

import android.content.ClipData.Item
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private val selected: MutableLiveData<Item> = MutableLiveData<Item>()

    fun select(item: Item) {
        selected.setValue(item)
    }

    fun getSelected(): LiveData<Item> {
        return selected
    }
}

