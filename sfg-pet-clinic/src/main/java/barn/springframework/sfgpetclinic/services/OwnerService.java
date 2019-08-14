package barn.springframework.sfgpetclinic.services;

import barn.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudeService<Owner, Long> {
	
	Owner findByLastName(String lastName);

}
