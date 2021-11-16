package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAOImpl;
import dao.UserDAO;
import model.Account;
import model.Address;
import model.Customer;
import model.FullName;
import model.User;

/**
 * Servlet implementation class UpdateUser
 */
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAOImpl userDAO = new UserDAOImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("id");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
java.sql.Date ngaysinh= null;
		
		try {
			ngaysinh = new java.sql.Date((new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("ngaysinh"))).getTime());
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
                String sdt = request.getParameter("sdt");
		String quan = request.getParameter("quan");
		String diachi = request.getParameter("diachi");
		String duong = request.getParameter("duong");
		String thanhpho = request.getParameter("thanhpho");
                String ten = request.getParameter("ten");
                String tendem = request.getParameter("tendem");
                String ho = request.getParameter("ho");

		
		String err = "";
		String url = "/update_user.jsp";

		if (password.equals("") ||sdt.equals("") || quan.equals("") || duong.equals("") || thanhpho.equals("")) {
			err += "Phải nhập đầy đủ thông tin!";
		} else {
                        Pattern pattenObj2 = Pattern
                                        .compile("(09)\\d{8}|(01)\\d{9}");
                        Matcher matcherObj2 = pattenObj2.matcher(sdt);
                        if (!matcherObj2.matches()) {
                                err += "Sđt sai định dạng!";}
		}

		if (err.length() > 0) {
			request.setAttribute("err", err);
		}

		try {
			if (err.length() == 0) {
                                Account account = new Account(username, password);
                                Address address = new Address(diachi,duong, quan, thanhpho);
                                FullName fullName  = new FullName(ten, tendem, ho);
				Customer u= new Customer(Integer.parseInt(user_id),sdt, account, address, fullName);
				userDAO.updateUser(u);
				url = "/index.jsp";
			} else {
				url = "/update_user.jsp";
			}
			RequestDispatcher rd = getServletContext()
					.getRequestDispatcher(url);
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("/register.jsp");
		}
	}

}
