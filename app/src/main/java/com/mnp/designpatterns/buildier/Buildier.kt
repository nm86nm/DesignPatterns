package com.mnp.designpatterns.buildier

class Hamburger private constructor(
    val cheese: Boolean,
    val beef: Boolean,
    val onions: Boolean
) {
    class Builder {
        private var cheese: Boolean = true
        private var beef: Boolean = true
        private var onions: Boolean = true

        fun cheese(value: Boolean) = apply { cheese = value }
        fun beef(value: Boolean) = apply { beef = value }
        fun onions(value: Boolean) = apply { onions = value }

        fun build() = Hamburger(cheese, beef, onions)
    }
}