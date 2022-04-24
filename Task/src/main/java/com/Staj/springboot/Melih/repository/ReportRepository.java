package com.Staj.springboot.Melih.repository;

import com.Staj.springboot.Melih.entity.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends CrudRepository<Report, Long> {
}