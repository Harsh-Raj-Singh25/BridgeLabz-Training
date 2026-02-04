package com.lambda.banking;

//Custom interface for SI since Java only provides BiFunction (2 args)
interface TriFunction<T, U, V, R> {
	R apply(T t, U u, V v);
}