package barn.springframework.sfgpetclinic.services.map;

import java.util.Set;

import barn.springframework.sfgpetclinic.model.Vet;
import barn.springframework.sfgpetclinic.services.VetService;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Vet Save(Long id, Vet object) {
		// TODO Auto-generated method stub
		return super.Save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

		
	

}
