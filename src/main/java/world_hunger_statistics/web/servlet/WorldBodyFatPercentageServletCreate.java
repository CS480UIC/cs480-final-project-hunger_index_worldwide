package world_body_fat_percentage.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import world_body_fat_percentage.domain.WorldBodyFatPercentage;
import world_body_fat_percentage.service.WorldBodyFatPercentageException;
import world_body_fat_percentage.service.WorldBodyFatPercentageService;


/**
 * Servlet implementation class UserServlet
 */

public class WorldBodyFatPercentageServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorldBodyFatPercentageServletCreate() {
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
		WorldBodyFatPercentageService entity1service = new WorldBodyFatPercentageService();
		Map<String,String[]> paramMap = request.getParameterMap();
		WorldBodyFatPercentage form = new WorldBodyFatPercentage();
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

		form.setBody_fat_percentage(Float.parseFloat(info.get(1)));
//		System.out.println("1");

		form.setCountry(info.get(2));
//		System.out.println("2");

		form.setContinent(info.get(4));		
		
		
		try {
			System.out.println("3");
			entity1service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | WorldBodyFatPercentageException e) {
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
