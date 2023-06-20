package com.mdtlabs.coreplatform.spiceservice.common.repository;

import com.mdtlabs.coreplatform.common.model.entity.spice.PatientComplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * This is the repository class for communicate link between server side and
 * database. This class used to perform all the PatientComplication module
 * action in database. In query annotation (nativeQuery = true) the below query
 * perform like SQL. Otherwise its perform like HQL default value for
 * nativeQuery FALSE
 * </p>
 *
 * @author Karthick Murugesan created on Feb 06, 2023
 */
@Repository
public interface PatientComplicationRepository extends JpaRepository<PatientComplication, Long> {

    /**
     * <p>
     * Get list of PatientComplication by patientTracker and isDeleted.
     * </p>
     *
     * @param patientTrackId {@link Long} patient track id
     * @return {@link List<PatientComplication>}  PatientComplication entity
     */
    List<PatientComplication> findByPatientTrackIdAndIsDeleted(Long patientTrackId,
                                                               Boolean isDeleted);

    /**
     * <p>
     * Get list of PatientComplication by patientTracker.
     * </p>
     *
     * @param patientTrackId {@param long} patient track id
     * @return {@link List<PatientComplication>} PatientComplication entity
     */
    List<PatientComplication> findByPatientTrackId(long patientTrackId);
}
