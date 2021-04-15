package com.iqss;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Main {

  // Need to play with reactive streams introduced in java 9
    public static void main(String[] args) {
	      Flux<String> f = Flux.just("a", "b", "c");

        f.toStream().forEach(System.out::println);
//        f.doOnEach(a -> System.out.println("hello"));

      Mono<String> mn = Mono.just("hello");

    }
}
