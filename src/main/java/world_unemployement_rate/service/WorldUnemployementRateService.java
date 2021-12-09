package world_unemployement_rate.service;


import world_unemployement_rate.dao.WorldUnemployementRateDao;
import world_unemployement_rate.domain.WorldUnemployementRate;

/**
 * logic functions such as register, login
 * @author Afnan Waseem
 *
 */
public class WorldUnemployementRateService {
	private WorldUnemployementRateDao entity1Dao = new WorldUnemployementRateDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(WorldUnemployementRate form) throws WorldUnemployementRateException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		WorldUnemployementRate entity1 = WorldUnemployementRateDao.findByUsername(form.getCountry());
		if(entity1.getCountry()!=null && entity1.getCountry().equals(form.getCountry())) throw new WorldUnemployementRateException("This user name has been registered!");
		entity1Dao.add(form);
	}
//	/**
//	 * Login function
//	 * @param form
//	 * @return
//	 * @throws UserException 
//	 * @throws ClassNotFoundException 
//	 * @throws IllegalAccessException 
//	 * @throws InstantiationException 
//	 */
//	public void login(WorldDeathRate form) throws WorldDeathRateException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//		WorldDeathRate user = WorldDeathRateDao.findByUsername(form.getUsername());
//		if(user.getUsername()==null) throw new WorldDeathRateException("The user is not in the database");
//		
//		String password = user.getPassword();
//		
//		if(password!=null && !password.equals(form.getPassword()))
//			throw new WorldDeathRateException(" The password is not right");
//		
//	}
}
