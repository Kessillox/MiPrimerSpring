package cl.awakelab.miprimerspring.repository;

import cl.awakelab.miprimerspring.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Integer> {
}
