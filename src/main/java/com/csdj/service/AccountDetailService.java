package com.csdj.service;

import com.csdj.entity.AccountDetail;

import java.util.List;



/**
 * 账户明细
 */
public interface AccountDetailService {
	/**
	 * getAccountDetailList
	 * @param accountDetail
	 * @return
	 */
	public List<AccountDetail> getAccountDetailList(AccountDetail accountDetail) throws Exception;
	/**
	 * repostAgentDetail
	 * @param accountDetail
	 * @return
	 * @throws Exception
	 */
	public List<AccountDetail> repostAgentDetail(AccountDetail accountDetail) throws Exception;
	/**
	 * count
	 * @param accountDetail
	 * @return
	 */
	public Integer count(AccountDetail accountDetail) throws Exception;
	/**
	 * addAccountDetail
	 * @param accountDetail
	 * @return
	 */
	public int addAccountDetail(AccountDetail accountDetail) throws Exception;
	
	/**
	 * modifyAccountDetail
	 * @param accountDetail
	 * @return
	 */
	public int modifyAccountDetail(AccountDetail accountDetail) throws Exception;
	
	/**
	 * deleteAccountDetail
	 * @param accountDetail
	 * @return
	 */
	public int deleteAccountDetail(AccountDetail accountDetail) throws Exception;


	public List<AccountDetail> getAccountDetail(AccountDetail accountDetail);

}
