package com.example.PracticeWebServices.repositories;

import com.example.PracticeWebServices.domain.CCinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CCInfoRepository extends JpaRepository<CCinfo,Integer> {

    public CCinfo findByUser_Id(Integer id);
}
