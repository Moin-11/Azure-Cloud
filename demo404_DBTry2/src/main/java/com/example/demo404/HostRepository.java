package com.example.demo404;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface HostRepository extends JpaRepository<Host,Integer> {

	 @Query("SELECT h FROM Host h")
	List<Host> getallhosts();
	
	 @Query("SELECT h FROM Host h where h.id=:id")
	 Host getbyId(int id);
	 
	 @Modifying
	 @Query("delete from Host h where h.id=:id")
	 void deleteHost(int id);
	

}

