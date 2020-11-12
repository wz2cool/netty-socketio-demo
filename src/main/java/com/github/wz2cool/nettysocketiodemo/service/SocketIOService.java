package com.github.wz2cool.nettysocketiodemo.service;

import com.github.wz2cool.nettysocketiodemo.model.PushMessage;

public interface SocketIOService {

    //推送的事件
    public static final String PUSH_EVENT = "push_event";

    // 启动服务
    void start() throws Exception;

    // 停止服务
    void stop();

    // 推送信息
    void pushMessageToUser(PushMessage pushMessage);
}