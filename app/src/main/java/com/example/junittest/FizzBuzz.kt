package com.example.junittest

class FizzBuzz {
    /*
    fun fizzBuzz (n:Int):String {
        return if (n%15 ==0) {
            "FizzBuzz"
        } else if(n%3 == 0) {
            "Fizz"
        } else if(n%5 == 0) {
            "Buzz"
        }
        else {
            n.toString()
        }
    }
    */
    fun fizzBuzz(n: Int): String = when {
        n % 15 == 0 -> "FizzBuzz"
        n % 3 == 0 -> "Fizz"
        n % 5 == 0 -> "Buzz"
        else -> n.toString()
    }

}