package cl.awakelab.miprimerspring.repository;

import cl.awakelab.miprimerspring.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno, Integer> {
}
