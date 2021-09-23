package com.trueddns.homenano.kotlincaseapp

class CaseModel {
    val image: Int
    val name: String
    val detail: String
    val price: Int

    constructor(image: Int, name: String, detail: String, price: Int) {
        this.image = image
        this.name = name
        this.detail = detail
        this.price = price
    }

    companion object  {
        val cases = ArrayList<CaseModel>()

        fun createData1() {
            val case1 = CaseModel(R.drawable.case1,"case1", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout", 1000)
            val case2 = CaseModel(R.drawable.case2,"case2", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout", 1100)
            val case3 = CaseModel(R.drawable.case3,"case3", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout", 1200)
            cases.add(case1)
            cases.add(case2)
            cases.add(case3)
        }

        fun createData2() {
            val case1 = CaseModel(R.drawable.case4,"case4", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout", 1300)
            val case2 = CaseModel(R.drawable.case5,"case5", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout", 1400)
            val case3 = CaseModel(R.drawable.case6,"case6", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout", 1500)
            cases.add(case1)
            cases.add(case2)
            cases.add(case3)
        }
    }
}