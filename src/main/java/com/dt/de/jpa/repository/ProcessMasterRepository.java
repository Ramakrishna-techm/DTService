package com.dt.de.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dt.de.model.ProcessMaster;


public interface ProcessMasterRepository extends JpaRepository<ProcessMaster, Integer>{

	@Query(value="select NULL AS PROCESSID, DT_TBL_PROCESS_STAGE_MASTER.* from DT_TBL_PROCESS_STAGE_MASTER where pROCESSSTAGEDESCRIPTION in (:pROCESSSTAGEDESCRIPTIONS)",nativeQuery=true)
	List<ProcessMaster> findByPROCESSSTAGEDESCRIPTIONS(@Param("pROCESSSTAGEDESCRIPTIONS") List<String> pROCESSSTAGEDESCRIPTIONS);
	
	@Query(value = "select ps.*,pm.PROCESSID,pm.PROCESSSTAGEID from DT_TBL_PROCESS_STAGE_MASTER ps left join DT_TBL_PROCESS_MONITORING pm "
			+ "on ps.processstageid = pm.PROCESSSTAGEID and PM.PROCESSID=?1 ORDER BY PS.PROCESSSTAGEID", nativeQuery = true)
	List<ProcessMaster> fetchByPROCESSID(String processId);
}
