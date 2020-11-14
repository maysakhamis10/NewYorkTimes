package com.example.newyorktimes.views

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.newyorktimes.R
import com.example.newyorktimes.data.datamodels.ResultStories
import com.example.newyorktimes.utilis.BookMarksAdapter
import com.example.newyorktimes.viewmodels.CommunicatorViewModel


class BookMarksFragment : Fragment() {

    private lateinit var bookMarksList : GridView

    lateinit var bookMarksAdapter :  BookMarksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_book_marks, container, false)

        initViews(rootView)

        //fetchBookMak()

        return rootView
    }


    private fun initViews(rootView :  View){
        bookMarksList = rootView.findViewById(R.id.bookMarkList)
        bookMarksAdapter= BookMarksAdapter(requireContext(), NewFeedsFragment().test)
        bookMarksList.adapter = bookMarksAdapter
    }


//    private fun fetchBookMak(){
//        ViewModelProviders.of(requireActivity()).get(CommunicatorViewModel::class.java)
//            .getMessageContainerA().observe(viewLifecycleOwner,
//                {
//                    Log.d("BOOK MARKKKKKK", "${it.title}!")
//                    bookMarksAdapter.apply {
//                        bookMarksAdapter.addNewItem(it)
//                       bookMarksAdapter.notifyDataSetChanged()
//                    }
//
//                })
//
//    }

}