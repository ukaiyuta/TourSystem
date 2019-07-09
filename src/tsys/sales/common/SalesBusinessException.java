package tsys.sales.common;

/**
 * 業務系の例外
 */
public class SalesBusinessException extends Exception
{
	/**
	 * メッセージを設定する。
	 * @param メッセージ
	 */
	public SalesBusinessException ( String message )
	{
		super ( message );
	}
}