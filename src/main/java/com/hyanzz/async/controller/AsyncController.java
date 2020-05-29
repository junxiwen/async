package com.hyanzz.async.controller;

import com.hyanzz.async.service.IAsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @Description 异步controller
 * @auther ywy
 * @create 2020-05-29 15:01
 */
@RestController
@RequestMapping("/async")
public class AsyncController {



    @Autowired
    private IAsyncService asyncService;

    @GetMapping("/test")
    public void test() throws InterruptedException {
        long start = System.currentTimeMillis();
        Future<String> jobRes1 = asyncService.doJob1();
        Future<String> jobRes2 = asyncService.doJob2();
        Future<String> jobRes3 = asyncService.doJob3();
        long end = System.currentTimeMillis();
        while(true) {//死循环，每隔100ms执行一次，判断一下这三个异步调用的方法是否全都执行完了。
            if(jobRes1.isDone() && jobRes2.isDone() && jobRes3.isDone()) {//使用Future的isDone()方法返回该方法是否执行完成
                //如果异步方法全部执行完，跳出循环
                break;
            }
            Thread.sleep(100);//每隔100毫秒判断一次
        }
        System.out.println("asyncService---执行完:"+(end-start));
    }
}

