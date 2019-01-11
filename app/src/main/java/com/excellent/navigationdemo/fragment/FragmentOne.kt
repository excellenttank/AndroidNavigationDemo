package com.excellent.navigationdemo.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.excellent.navigationdemo.R
import kotlinx.android.synthetic.main.fragment_one.*

/**
 * 作者：WangBinBin on 1/9 15:19
 * 邮箱：1205998131@qq.com
 */
class FragmentOne : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goto_fragment_two.setOnClickListener { Navigation.findNavController(view).navigate(R.id.goto_fragment_two) }
    }

}