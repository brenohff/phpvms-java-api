package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.RealscheduleliteLocation;

public interface RealscheduleliteLocationRepository extends JpaRepository<RealscheduleliteLocation, Integer>, JpaSpecificationExecutor<RealscheduleliteLocation> {

}