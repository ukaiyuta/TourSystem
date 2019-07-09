package tsys.sales.entity;

import java.io.Serializable;

/**
 * メンバー情報
 */
public class Member implements Serializable
{
	/** メンバーコード */
	private String	memberCode;

	/** 名前 */
	private String	name;

	/** パスワード */
	private String	password;

	/** 権限 */
	private String	role;

	/** メールアドレス */
	private String	email;

	/** 郵便番号 */
	private String	zipcode;

	/** 都道府県 */
	private String	prefecture;

	/** 住所 */
	private String	address;

	/** 電話番号 */
	private String	tel;

	/** 空のコンストラクタ。 */
	public Member () {}

	/**
	 * メンバーコードを取得する。
	 * @return メンバーコード
	 */
	public String getMemberCode ()
	{
		return memberCode;
	}

	/**
	 * メンバーコードを設定する。
	 * @param メンバーコード
	 */
	public void setMemberCode ( String memberCode )
	{
		this.memberCode = memberCode;
	}

	/**
	 * 名前を取得する。
	 * @return 名前
	 */
	public String getName ()
	{
		return name;
	}

	/**
	 * 名前を設定する。
	 * @param 名前
	 */
	public void setName ( String name )
	{
		this.name = name;
	}

	/**
	 * パスワードを取得する。
	 * @return パスワード
	 */
	public String getPassword ()
	{
		return password;
	}

	/**
	 * パスワードを設定する。
	 * @param パスワード
	 */
	public void setPassword ( String password )
	{
		this.password = password;
	}

	/**
	 * 権限を取得する。
	 * @return 権限
	 */
	public String getRole ()
	{
		return role;
	}

	/**
	 * 権限を設定する。
	 * @param 権限
	 */
	public void setRole ( String role )
	{
		this.role = role;
	}

	/**
	 * メールアドレスを取得する。
	 * @return メールアドレス
	 */
	public String getEmail ()
	{
		return email;
	}

	/**
	 * メールアドレスを設定する。
	 * @param メールアドレス
	 */
	public void setEmail ( String email )
	{
		this.email = email;
	}

	/**
	 * 郵便番号を取得する。
	 * @return 郵便番号
	 */
	public String getZipcode ()
	{
		return zipcode;
	}

	/**
	 * 郵便番号を設定する。
	 * @param 郵便番号
	 */
	public void setZipcode ( String zipcode )
	{
		this.zipcode = zipcode;
	}

	/**
	 * 都道府県を取得する。
	 * @return 都道府県
	 */
	public String getPrefecture ()
	{
		return prefecture;
	}

	/**
	 * 都道府県を設定する。
	 * @param 都道府県
	 */
	public void setPrefecture ( String prefecture )
	{
		this.prefecture = prefecture;
	}

	/**
	 * 住所を取得する。
	 * @return 住所
	 */
	public String getAddress ()
	{
		return address;
	}

	/**
	 * 住所を設定する。
	 * @param 住所
	 */
	public void setAddress ( String address )
	{
		this.address = address;
	}

	/**
	 * 電話番号を取得する。
	 * @return 電話番号
	 */
	public String getTel ()
	{
		return tel;
	}

	/**
	 * 電話番号を設定する。
	 * @param 電話番号
	 */
	public void setTel ( String tel )
	{
		this.tel = tel;
	}
}
