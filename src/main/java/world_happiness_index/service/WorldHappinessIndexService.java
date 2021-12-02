package world_happiness_index.service;


import world_happiness_index.dao.WorldHappinessIndexDao;
import world_happiness_index.domain.WorldHappinessIndex;

/**
 * logic functions such as register
 * @author Akash Sunda
 *
 */
public class WorldHappinessIndexService {
	private WorldHappinessIndexDao entity1Dao = new WorldHappinessIndexDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(WorldHappinessIndex form) throws WorldHappinessIndexException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		WorldHappinessIndex entity1 = WorldHappinessIndexDao.findByCountry(form.getCountry());
		if(entity1.getCountry()!=null && entity1.getCountry().equals(form.getCountry())) throw new WorldHappinessIndexException("This country's happiness index has been registered!");
		entity1Dao.add(form);
	}

}
