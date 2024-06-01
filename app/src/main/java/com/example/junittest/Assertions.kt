package com.example.junittest

class Assertions {

    private  val user = User("pepe", 30)

    fun getLuckyNumber(): Array<Int> {
        return arrayOf(21,117)
    }

    fun getName(): String{
        return user.name
    }

    fun checkHuman(user: User):Boolean{
        return user.isHuman
    }

    fun checkHuman(user: User? = null): Boolean?{
        if(user == null) return null
        return user.isHuman
    }

    fun isAdult(user: User): Boolean {
        if(!user.isHuman) return true
        return user.age >= 18
    }

}