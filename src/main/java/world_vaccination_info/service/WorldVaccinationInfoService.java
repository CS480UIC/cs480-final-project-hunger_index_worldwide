package world_vaccination_info.service;


import java.util.List;

import world_happiness_index.dao.WorldHappinessIndexDao;
import world_vaccination_info.dao.WorldVaccinationInfoDao;
import world_vaccination_info.domain.WorldVaccinationInfo;

/**
 * logic functions such as register
 * @author Akash Sunda
 *
 */
public class WorldVaccinationInfoService {
	private WorldVaccinationInfoDao entity1Dao = new WorldVaccinationInfoDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(WorldVaccinationInfo form) throws WorldVaccinationInfoException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		WorldVaccinationInfo entity1 = WorldVaccinationInfoDao.findByCountry(form.getCountry());
		if(entity1.getCountry()!=null && entity1.getCountry().equals(form.getCountry())) throw new WorldVaccinationInfoException("This country's vaccination rate has been registered!");
		entity1Dao.add(form);
	}

	public List<Object> findcq1() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return WorldVaccinationInfoDao.findcq1();
	}

}
