package tsys.sales.web;

import javax.servlet.http.HttpServletRequest;

import tsys.sales.common.SalesBusinessException;
import tsys.sales.common.SalesSystemException;
import tsys.sales.entity.Member;
import tsys.sales.logic.LoginLogic;

/**
 * ログインのAction。
 */
public class LoginAction implements Action
{

	/**
	 * @see tsys.sales.web.Action#execute(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public String execute ( HttpServletRequest request )
	{
		// 遷移先ページ
		String transitionPage = null;

		// LoginLogicをインスタンス化
		LoginLogic loginLogic = new LoginLogic ();

		// Webページからログイン情報を取得
		String memberCode = request.getParameter ( "MEMBER_CODE" );
		String password = request.getParameter ( "PASSWORD" );

		// ログイン処理
		try
		{
			Member resultMember = loginLogic.login ( memberCode, password );
			request.getSession ().setAttribute ( "LOGIN_MEMBER", resultMember );
			transitionPage = "./MainMenuView.jsp";
		}
		catch ( SalesBusinessException e )
		{
			// ログイン失敗
			request.setAttribute ( "MESSAGE", e.getMessage () );
			transitionPage = "./LoginView.jsp";
		}
		catch ( SalesSystemException e )
		{
			// SQLエラー
			request.setAttribute ( "MESSAGE", e.getMessage () );
			transitionPage = "./ErrorView.jsp";
		}

		return transitionPage;
	}

}