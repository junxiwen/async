package com.hyanzz.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * @Description
 * @auther ywy
 * @create 2020-05-29 15:03
 */
@Service
public class AsyncServiceImpl implements IAsyncService {

    @Async
    @Override
    public Future<String> doJob1() {
        System.out.println("IAsyncService---doJob1开始执行......");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        return new AsyncResult<String>("IAsyncService---doJob1执行完成......");
    }

    @Async
    @Override
    public Future<String> doJob2() {
        System.out.println("IAsyncService---doJob2开始执行......");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        return new AsyncResult<String>("IAsyncService---doJob2执行完成......");
    }

    @Async
    @Override
    public Future<String> doJob3() {
        System.out.println("IAsyncService---doJob3开始执行......");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        return new AsyncResult<String>("IAsyncService---doJob3执行完成......");
    }
}
