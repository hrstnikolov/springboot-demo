package com.hristocode.springboot3;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers(){
        return softwareEngineerRepository.findAll();
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id){
        return softwareEngineerRepository
                .findById(id)
                .orElseThrow(() -> new IllegalStateException("id " + id + " not found"));
    }

    public void addSoftwareEngineer(SoftwareEngineer softwareEngineer){
        softwareEngineerRepository.save(softwareEngineer);
    }
}
