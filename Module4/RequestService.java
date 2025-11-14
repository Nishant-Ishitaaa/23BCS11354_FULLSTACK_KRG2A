package com.example.taxing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.taxing.repo.ServiceRequestRepository;
import com.example.taxing.model.ServiceRequest;

import java.util.List;

@Service
public class RequestService {

    @Autowired
    private ServiceRequestRepository repo;

    public List<ServiceRequest> getAllRequests() {
        return repo.findAll();
    }


    public ServiceRequest save(ServiceRequest request) {
        return repo.save(request);
    }

    public ServiceRequest getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

