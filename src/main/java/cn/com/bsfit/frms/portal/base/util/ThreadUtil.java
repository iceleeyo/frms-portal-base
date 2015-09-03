package cn.com.bsfit.frms.portal.base.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadUtil {

    /**
     * 线程池实例
     */
    private static ExecutorService pool;

    /**
     * 默认同时运行的线程数
     */
    private static final int DEFAULT_THREAD_NUM = 30;

    /**
     * 获得线程池。
     * 
     * @return
     */
    public static ExecutorService getThreadPool() {
        if (pool == null || pool.isShutdown() || pool.isTerminated()) {
            return Executors.newFixedThreadPool(DEFAULT_THREAD_NUM);
        }
        return pool;
    }

    /**
     * 添加待执行的线程。
     * 
     * @param command
     */
    public static void executeThread(Runnable command) {
        pool = getThreadPool();
        pool.execute(command);
    }

    /**
     * 关闭线程池，禁止线程池添加新线程。
     */
    public static void shutdown() {
        if (pool != null && !pool.isShutdown()) {
            pool.shutdown();
        }
    }
}
