package com.acme.catalogo

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.acme.catalogo")
		.start()
}

