package com.fengxinzi.learning.newfeature.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fengxinzi
 */
public class CompletableFutureDemo {

    public static void completedFutureExample() {
        CompletableFuture<String> completableFuture = CompletableFuture.completedFuture("message")
                .thenApply(s -> {
                    System.out.println(Thread.currentThread().isDaemon());
                    return s.toUpperCase();
                });
        System.out.println(completableFuture.getNow(null));
    }

    public void submit() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("ThreadName:"+Thread.currentThread().getName()+" run has end");
                }
            });
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            new Processor().print(i);
        }
        System.err.println("syn main spend " + (System.currentTimeMillis() - start));

        long newStart = System.currentTimeMillis();
//        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync();

        System.err.println("asy main spend " + (System.currentTimeMillis() - newStart));
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Processor implements Callable {

        private Integer i;

        private Integer print(int i) {
            long start = System.currentTimeMillis();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            System.err.println("sub print spend " + (System.currentTimeMillis() - start));
            return i;
        }

        @Override
        public Integer call() throws Exception {
            return print(i);
        }
    }
}
