package tsys.sales.web;

import javax.servlet.http.HttpServletRequest;

/**
 * Actionのインタフェース
 */
public interface Action
{
	/**
	 * 処理を実行する。
	 * @param リクエスト
	 * @return 遷移先ページ
	 */
	public String execute ( HttpServletRequest request );
}