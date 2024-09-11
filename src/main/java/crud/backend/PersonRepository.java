
package crud.backend;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    

    List<Person> findAllBy(Pageable pageable);
    
    List<Person> findByNameLikeIgnoreCase(String nameFilter);
    

    List<Person> findByNameLikeIgnoreCase(String nameFilter, Pageable pageable);
    
    long countByNameLikeIgnoreCase(String nameFilter);

}
