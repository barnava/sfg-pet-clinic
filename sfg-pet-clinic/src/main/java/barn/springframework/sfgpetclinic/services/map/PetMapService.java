package barn.springframework.sfgpetclinic.services.map;

import java.util.Set;

import barn.springframework.sfgpetclinic.model.Pet;
import barn.springframework.sfgpetclinic.services.PetService;

public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	Pet Save(Long id, Pet object) {
		// TODO Auto-generated method stub
		return super.Save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	
	
	

}
