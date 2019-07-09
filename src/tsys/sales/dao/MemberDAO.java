package tsys.sales.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tsys.sales.common.SalesSystemException;
import tsys.sales.entity.Member;

/**
 * MEMBERテーブルとのCRUDを行うためのクラス。
 */
public class MemberDAO
{
	/** SQLのコネクション */
	private Connection connection;

	/**
	 * SQLのコネクションを設定する。
	 * @param SQLのコネクション
	 */
	public MemberDAO ( Connection connection )
	{
		setConnection ( connection );
	}

	/**
	 * DBから、memberCodeでメンバー情報を探す。
	 *
	 * @param 検索するメンバーコード
	 * @return 検索結果、該当なしはnull
	 * @throws SalesSystemException
	 */
	public Member findMember ( String keywordsMemberCode ) throws SalesSystemException
	{
		// 取得したメンバー情報のセット先
		Member foundResultMember = null;

		// データ取得の準備
		String sql = "SELECT MEMBER_CODE, NAME, PASSWORD, ROLE, EMAIL, ZIPCODE, PREFECTURE, ADDRESS, TEL"
				+ " FROM MEMBER"
				+ " WHERE MEMBER_CODE = ?";
		PreparedStatement preStatement = null;
		ResultSet resultSet = null;

		try
		{
			// SQL文を動的に設定する
			preStatement = getConnection ().prepareStatement ( sql );
			preStatement.setString ( 1, keywordsMemberCode );

			// 取得データをオブジェクトに設定する
			resultSet = preStatement.executeQuery ();
			if ( resultSet.next () )
			{
				String memberCode = resultSet.getString ( "MEMBER_CODE" );
				String name = resultSet.getString ( "NAME" );
				String password = resultSet.getString ( "PASSWORD" );
				String role = resultSet.getString ( "ROLE" );
				String email = resultSet.getString ( "EMAIL" );
				String zipcode = resultSet.getString ( "ZIPCODE" );
				String prefecture = resultSet.getString ( "PREFECTURE" );
				String address = resultSet.getString ( "ADDRESS" );
				String tel = resultSet.getString ( "TEL" );

				foundResultMember = new Member ();
				foundResultMember.setMemberCode ( memberCode );
				foundResultMember.setName ( name );
				foundResultMember.setPassword ( password );
				foundResultMember.setRole ( role );
				foundResultMember.setEmail ( email );
				foundResultMember.setZipcode ( zipcode );
				foundResultMember.setPrefecture ( prefecture );
				foundResultMember.setAddress ( address );
				foundResultMember.setTel ( tel );
			}
		}
		catch ( SQLException e )
		{
			throw new SalesSystemException ( "SQLでエラーが発生しました。管理者を呼んでください。" );
		}
		finally
		{
			// 後処理
			try
			{
				if ( preStatement != null )
				{
					preStatement.close ();
				}
				if ( resultSet != null )
				{
					resultSet.close ();
				}
			}
			catch ( SQLException e )
			{
				throw new SalesSystemException ( "SQLのcloseに失敗しました。管理者を呼んでください。" );
			}
		}

		return foundResultMember;
	}

	/**
	 * SQLのコネクションを取得する。
	 * @return SQLのコネクション
	 */
	public Connection getConnection ()
	{
		return connection;
	}

	/**
	 * SQLのコネクションを設定する。
	 * @param SQLのコネクション
	 */
	public void setConnection ( Connection connection )
	{
		this.connection = connection;
	}
}
