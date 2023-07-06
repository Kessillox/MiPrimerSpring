package cl.awakelab.miprimerspring.repository;

import cl.awakelab.miprimerspring.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfesorRepository extends JpaRepository<Profesor,Integer> {
}
