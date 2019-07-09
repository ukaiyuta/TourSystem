package tsys.sales.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FrontController ()
	{
		super ();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init ( ServletConfig config ) throws ServletException
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet ( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException
	{
		// 遷移先ページ
		String transitionPage = null;

		// エンコードを設定
		request.setCharacterEncoding ( "UTF-8" );

		// 目的IDを取得
		String targetId = request.getParameter ( "TARGET_ID" );

		// 目的IDから必要なActionを呼び出す
		switch ( targetId )
		{
			case "GOTO_LOGIN":
			case "GOTO_TOP":
			default:
				transitionPage = "/TopView.jsp";
				request.getSession ().invalidate ();
			break;
		}

		// ページ遷移する
		RequestDispatcher reqDispatcher = request.getRequestDispatcher ( transitionPage );
		reqDispatcher.forward ( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost ( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet ( request, response );
	}

}