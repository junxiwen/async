package com.hyanzz.sync.controller;

import com.hyanzz.sync.service.ISyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @auther ywy
 * @create 2020-05-29 15:03
 */
@RestController
@RequestMapping("/sync")
public class SyncController {

    @Autowired
    private ISyncService syncService;

    @GetMapping("/test")
    public void test(){
        long start = System.currentTimeMillis();
        syncService.doJob1();
        syncService.doJob2();
        syncService.doJob3();
        long end = System.currentTimeMillis();
        System.out.println("syncService---执行完:"+(end-start));
    }
}
