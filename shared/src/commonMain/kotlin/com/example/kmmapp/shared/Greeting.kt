package com.example.kmmapp.shared


class Greeting {
    fun greeting(): String {
        return "Guess what it is! >, ${Platform().platform.reversed()}!"
    }
}
