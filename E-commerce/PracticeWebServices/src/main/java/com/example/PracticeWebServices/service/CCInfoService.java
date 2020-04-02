package com.example.PracticeWebServices.service;


import com.example.PracticeWebServices.domain.CCinfo;

import java.util.List;


public interface CCInfoService {

    public CCinfo findByUser_Id(Integer id);

    public CCinfo findCCInfoById(Integer id);

    public List<CCinfo> findAllCCInfo();
}
