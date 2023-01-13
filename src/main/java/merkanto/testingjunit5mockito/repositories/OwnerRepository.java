package merkanto.testingjunit5mockito.repositories;


import merkanto.testingjunit5mockito.model.Owner;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
