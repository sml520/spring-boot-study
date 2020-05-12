package com.sxb.thread;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 张元亮
 * @date 2020/5/7
 */
public class ThreadPoolTest {

    /**
     * 线程池信息，核心线程数量5，最大数量10，无界队列，超出核心线程数量的线程存活时间：5秒，指定拒绝策略的
     */
    private void threadPoolExecutorTest1() throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10,
                5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        testCommon(threadPoolExecutor);
        threadPoolExecutor.shutdown();

    }

    public void testCommon(ThreadPoolExecutor threadPoolExecutor) throws InterruptedException {
        // 测试，提交15个执行时间需要3秒的任务，看超过大小的2个，对应的处理情况
        for (int i = 0; i < 15; i++) {
            int n = i;
            threadPoolExecutor.submit(() -> {
                System.out.println("开始执行：" + n);
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行结束：" + n);
            });
            System.out.println("任务提交成功:" + i);
        }

        // 查看线程数量，查看队列等待数量
        Thread.sleep(500L);
        System.out.println("当前线程池线程数量为：" + threadPoolExecutor.getPoolSize());
        System.out.println("当前线程池等待的数量为：" + threadPoolExecutor.getQueue().size());
        // 等待15秒，查看线程数量和队列数量
        Thread.sleep(15000L);
        System.out.println("当前线程池线程数量为：" + threadPoolExecutor.getPoolSize());
        System.out.println("当前线程池等待的数量为：" + threadPoolExecutor.getQueue().size());
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolTest test = new ThreadPoolTest();
        test.threadPoolExecutorTest1();
    }

}
