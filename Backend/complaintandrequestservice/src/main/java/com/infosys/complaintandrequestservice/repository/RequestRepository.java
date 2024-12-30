package com.infosys.complaintandrequestservice.repository;

import com.infosys.complaintandrequestservice.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request,Long> {
}
