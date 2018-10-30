package com.anwesh.uiprojects.linkedgateshapestepview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.gateshapestepview.GateShapeStepView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GateShapeStepView.create(this)
    }
}
