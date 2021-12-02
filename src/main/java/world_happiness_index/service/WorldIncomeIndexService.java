package world_happiness_index.service;


import world_happiness_index.dao.WorldIncomeIndexDao;
import world_happiness_index.domain.WorldIncomeIndex;

/**
 * logic functions such as register
 * @author Akash Sunda
 *
 */
public class WorldIncomeIndexService {
	private WorldIncomeIndexDao entity1Dao = new WorldIncomeIndexDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(WorldIncomeIndex form) throws WorldIncomeIndexException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		WorldIncomeIndex entity1 = WorldIncomeIndexDao.findByCountry(form.getCountry());
		if(entity1.getCountry()!=null && entity1.getCountry().equals(form.getCountry())) throw new WorldIncomeIndexException("This country's average income has been registered!");
		entity1Dao.add(form);
	}

}
