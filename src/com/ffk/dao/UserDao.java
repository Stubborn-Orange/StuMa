package com.ffk.dao;

import com.ffk.model.User;



/**
 *  ���ݿ���ʲ�-����Ա��CRUD����
 * @author DY1101shaoyuxian
 *
 */
public interface UserDao {
	    /**
	     * ��½�û���֤
	     * @param page
	     * @return
	     */
	  public boolean isLogin(User user);

		 /**
		  * �޸��û�������
		  * @param page
		  * @return
		  */
		
		public int updateUserPassWord(User  user);
}