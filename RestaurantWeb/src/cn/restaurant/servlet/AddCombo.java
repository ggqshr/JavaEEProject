package cn.restaurant.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.restaurant.dao.ComboDao;
import cn.restaurant.dao.impl.ComboDaoImpl;
import cn.restaurant.entity.Combo;

public class AddCombo extends HttpServlet {
	
	Combo combo=null;
	ComboDao comboDao=new ComboDaoImpl();

	/**
	 * Constructor of the object.
	 */
	public AddCombo() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String comboName=request.getParameter("comboName");
		String noodles=request.getParameter("noodlesNum");
		String meat=request.getParameter("meatNum");
		String vegetable=request.getParameter("vegetableNum");
		String soup=request.getParameter("soupNum");
		String comboPrice=request.getParameter("comboPrice");
		combo=comboDao.comboQueryAsName(comboName);
		if(combo!=null)
		{
			out.println("<script>alert('此套餐已存在，请重新输入')</script>");
			out.println("<script>location.href='addCombo.jsp'</script>");
			return ;
		}
		combo=new Combo();
		combo.setComboName(comboName);
		combo.setNoodlesNum(Integer.valueOf(noodles));
		combo.setMeatNum(Integer.valueOf(meat));
		combo.setVegetableNum(Integer.valueOf(vegetable));
		combo.setSoupNum(Integer.valueOf(soup));
		combo.setComboPrice(Float.valueOf(comboPrice));
		if(comboDao.comboInsert(combo)==true)
		{
			out.println("<script>alert('添加套餐成功')</script>");
			out.println("<script>location.href='manCombo.jsp'</script>");
		}
		else {
			out.println("<script>alert('添加套餐失败')</script>");
			out.println("<script>location.href='manCombo.jsp'</script>");
		}
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
