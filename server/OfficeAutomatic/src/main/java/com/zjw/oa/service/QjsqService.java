package com.zjw.oa.service;

import com.zjw.oa.entity.Qjsq;

import java.util.List;

public interface QjsqService {

    void addQjsq(Qjsq qjsq) throws Exception;

    List<Qjsq> getQjList(Qjsq qjsq);

    Qjsq getQj(Qjsq qjsq);

    void agreeQj(Qjsq qjsq) throws Exception;

}
