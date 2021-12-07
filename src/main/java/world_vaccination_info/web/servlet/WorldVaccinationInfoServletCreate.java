package world_vaccination_info.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import world_vaccination_info.domain.WorldDeathRate;
import world_vaccination_info.service.WorldVaccinationInfoException;
import world_vaccination_info.service.WorldVaccinationInfoService;


/**
 * Servlet implementation class UserServlet
 */

public class WorldVaccinationInfoServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorldVaccinationInfoServletCreate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WorldVaccinationInfoService entity1service = new WorldVaccinationInfoService();
		Map<String,String[]> paramMap = request.getParameterMap();
		WorldDeathRate form = new WorldDeathRate();
		List<String> info = new ArrayList<String>();
		System.out.println(form);
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
			System.out.println(name + ": " + Arrays.toString(values));
			System.out.println(info.add(values[0]));

		}
//		System.out.println("1");
//		System.out.println(info);

		form.setVaccination_rate(Float.parseFloat(info.get(1)));
//		System.out.println("1");

		form.setCountry(info.get(2));
//		System.out.println("2");

		form.setContinent(info.get(4));		
//		System.out.println("3");
		
		
		try {
			System.out.println("3");
			entity1service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | WorldVaccinationInfoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
