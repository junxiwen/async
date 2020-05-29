package com.hyanzz.sync.service;

import org.springframework.stereotype.Service;

/**
 * @Description
 * @auther ywy
 * @create 2020-05-29 15:03
 */
@Service
public class SyncServiceImpl implements ISyncService {
    @Override
    public void doJob1() {
        System.out.println("ISyncService---doJob1开始执行......");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }

    }

    @Override
    public void doJob2() {
        System.out.println("ISyncService---doJob2开始执行......");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }

    @Override
    public void doJob3() {
        System.out.println("ISyncService---doJob3开始执行......");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }
}
