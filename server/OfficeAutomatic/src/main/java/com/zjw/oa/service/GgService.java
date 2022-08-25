package com.zjw.oa.service;

import com.zjw.oa.entity.Gsgg;
import com.zjw.oa.entity.Xmjd;

import java.util.List;

public interface GgService {


    List<Gsgg> getGgList();

    List<Xmjd> getxmList();

    void addGg(Gsgg gsgg);

    void delGg(Gsgg gsgg);
}
