package com.example.PracticeWebServices.service;


import com.example.PracticeWebServices.domain.CCinfo;
import com.example.PracticeWebServices.repositories.CCInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CCInfoServiceImpl implements CCInfoService {

    private  final CCInfoRepository ccInfoRepository;

    public CCInfoServiceImpl(CCInfoRepository ccInfoRepository) {
        this.ccInfoRepository = ccInfoRepository;
    }


    @Override
    public CCinfo findByUser_Id(Integer id) {
        return ccInfoRepository.findByUser_Id(id);
    }

    @Override
    public CCinfo findCCInfoById(Integer id) {
        return ccInfoRepository.findById(id).get();
    }

    @Override
    public List<CCinfo> findAllCCInfo() {
        return ccInfoRepository.findAll();
    }
}
