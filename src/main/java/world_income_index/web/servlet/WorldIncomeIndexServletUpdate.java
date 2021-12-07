package world_income_index.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import world_death_rate.dao.WorldDeathRateDao;
import world_death_rate.domain.WorldDeathRate;
import world_income_index.dao.WorldIncomeIndexDao;
import world_income_index.domain.WorldIncomeIndex;
//import entity1.service.Entity1Service;

/**
 * Servlet implementation class UserServlet
 */

public class WorldIncomeIndexServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorldIncomeIndexServletUpdate() {
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

		String method = request.getParameter("method");
		WorldIncomeIndexDao entity1dao = new WorldIncomeIndexDao();
		WorldIncomeIndex entity1 = null;
		
		if(method.equals("search"))
		{
			try {
				entity1 = WorldIncomeIndexDao.findByCountry(request.getParameter("country"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
//			Entity1Service entity1service = new Entity1Service();		
			if(entity1.getCountry()!=null){
				System.out.println("11");

						System.out.println(entity1);
						request.setAttribute("world_income_index", entity1);
						response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
						//request.getRequestDispatcher("/jsps/entity1/entity1_update_output.jsp").forward(request, response);
					
				}
				else{
					
				request.setAttribute("msg", "Entity not found");
				//request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			WorldIncomeIndex form = new WorldIncomeIndex();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				
				String[] values = paramMap.get(name);
				info.add(values[0]);
				System.out.println(name + ": " + Arrays.toString(values));
			}
			form.setAvg_income(Integer.parseInt(info.get(1)));
			form.setCountry(info.get(2));
			form.setContinent(info.get(3));
			

			try {
				entity1dao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Entity Updated");
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			//request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
		}
	}
}



