package org.jsp.sample.repository;

import org.jsp.sample.dto.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRespository extends JpaRepository<Sample, Integer>
{

}
