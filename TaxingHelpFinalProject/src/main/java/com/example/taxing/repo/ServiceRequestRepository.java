
package com.example.taxing.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.taxing.model.ServiceRequest;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Long> {
}
