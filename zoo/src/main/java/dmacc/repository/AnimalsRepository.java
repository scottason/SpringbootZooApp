
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dmacc.beans.Animals;

public interface AnimalsRepository extends JpaRepository<Animals, Long> {

}
