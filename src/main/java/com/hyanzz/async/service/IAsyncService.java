package com.hyanzz.async.service;

import java.util.concurrent.Future;

/**
 * @Description
 * @auther ywy
 * @create 2020-05-29 15:03
 */
public interface IAsyncService {
    Future<String> doJob1();
    Future<String> doJob2();
    Future<String> doJob3();
}
