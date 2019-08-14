package barn.springframework.sfgpetclinic.services.map;

import java.util.Set;

import barn.springframework.sfgpetclinic.model.Owner;
import barn.springframework.sfgpetclinic.services.OwnerService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner Save(Long id,Owner object) {
		// TODO Auto-generated method stub
		return super.Save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
