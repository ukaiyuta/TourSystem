package tsys.sales.common;

/**
 * システム系の例外
 */
public class SalesSystemException extends Exception
{
	/**
	 * メッセージを設定する。
	 * @param メッセージ
	 */
	public SalesSystemException ( String message )
	{
		super ( message );
	}
}