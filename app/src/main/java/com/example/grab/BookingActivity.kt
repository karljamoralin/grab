package com.example.grab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class BookingActivity : AppCompatActivity(), BookingContract.View {

    lateinit var presenter: BookingContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        presenter = BookingPresenter(this)
        presenter.start()
    }

    override fun gotoAllocationScreen() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.stop()
    }
}
