package world_body_fat_percentage.service;


import java.util.List;

import world_body_fat_percentage.dao.WorldBodyFatPercentageDao;
import world_body_fat_percentage.domain.WorldBodyFatPercentage;

/**
 * logic functions such as register, login
 * @author Afnan Waseem
 *
 */
public class WorldBodyFatPercentageService {
	private WorldBodyFatPercentageDao WbfpDao = new WorldBodyFatPercentageDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(WorldBodyFatPercentage form) throws WorldBodyFatPercentageException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		WorldBodyFatPercentage bfp_entity = WorldBodyFatPercentageDao.findBybody_fat_percentage(form.getCountry());
		if(bfp_entity.getCountry() != null && bfp_entity.getCountry().equals(form.getCountry())) throw new WorldBodyFatPercentageException("This user name has been registered!");
		WbfpDao.add(form);
	}
	
	public List<Object> findCC() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return WbfpDao.findCC();
		
	}
}
