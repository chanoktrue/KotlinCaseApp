package com.trueddns.homenano.kotlincaseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val addCaseButton: Button by lazy {
        findViewById(R.id.addCaseButton)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create data1
        CaseModel.createData1()

        // Send datas to Adapter
        val caseAdapter = CaseAdapter(CaseModel.cases)

        // Set title button
        setTitleButton()

        // Config recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        recyclerView.layoutManager = GridLayoutManager(this,2,GridLayoutManager.VERTICAL, false)
        recyclerView.adapter  = caseAdapter


        // Tab buttton add data2
        addCaseButton.setOnClickListener {
            // Create data2
            CaseModel.createData2()

            // Refresh adapter
            caseAdapter.notifyDataSetChanged()

            // Set title button
            setTitleButton()
        }
    }

    fun setTitleButton() {
        addCaseButton.text = "Add Case (total: ${CaseModel.cases.size} item)"
    }
}