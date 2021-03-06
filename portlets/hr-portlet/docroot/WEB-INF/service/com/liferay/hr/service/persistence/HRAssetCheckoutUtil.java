/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.hr.service.persistence;

import com.liferay.hr.model.HRAssetCheckout;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the h r asset checkout service. This utility wraps {@link HRAssetCheckoutPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Wesley Gong
 * @see HRAssetCheckoutPersistence
 * @see HRAssetCheckoutPersistenceImpl
 * @generated
 */
public class HRAssetCheckoutUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(HRAssetCheckout hrAssetCheckout) {
		getPersistence().clearCache(hrAssetCheckout);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HRAssetCheckout> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HRAssetCheckout> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HRAssetCheckout> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static HRAssetCheckout remove(HRAssetCheckout hrAssetCheckout)
		throws SystemException {
		return getPersistence().remove(hrAssetCheckout);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static HRAssetCheckout update(HRAssetCheckout hrAssetCheckout,
		boolean merge) throws SystemException {
		return getPersistence().update(hrAssetCheckout, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static HRAssetCheckout update(HRAssetCheckout hrAssetCheckout,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(hrAssetCheckout, merge, serviceContext);
	}

	/**
	* Caches the h r asset checkout in the entity cache if it is enabled.
	*
	* @param hrAssetCheckout the h r asset checkout
	*/
	public static void cacheResult(
		com.liferay.hr.model.HRAssetCheckout hrAssetCheckout) {
		getPersistence().cacheResult(hrAssetCheckout);
	}

	/**
	* Caches the h r asset checkouts in the entity cache if it is enabled.
	*
	* @param hrAssetCheckouts the h r asset checkouts
	*/
	public static void cacheResult(
		java.util.List<com.liferay.hr.model.HRAssetCheckout> hrAssetCheckouts) {
		getPersistence().cacheResult(hrAssetCheckouts);
	}

	/**
	* Creates a new h r asset checkout with the primary key. Does not add the h r asset checkout to the database.
	*
	* @param hrAssetCheckoutId the primary key for the new h r asset checkout
	* @return the new h r asset checkout
	*/
	public static com.liferay.hr.model.HRAssetCheckout create(
		long hrAssetCheckoutId) {
		return getPersistence().create(hrAssetCheckoutId);
	}

	/**
	* Removes the h r asset checkout with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hrAssetCheckoutId the primary key of the h r asset checkout
	* @return the h r asset checkout that was removed
	* @throws com.liferay.hr.NoSuchAssetCheckoutException if a h r asset checkout with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRAssetCheckout remove(
		long hrAssetCheckoutId)
		throws com.liferay.hr.NoSuchAssetCheckoutException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(hrAssetCheckoutId);
	}

	public static com.liferay.hr.model.HRAssetCheckout updateImpl(
		com.liferay.hr.model.HRAssetCheckout hrAssetCheckout, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(hrAssetCheckout, merge);
	}

	/**
	* Returns the h r asset checkout with the primary key or throws a {@link com.liferay.hr.NoSuchAssetCheckoutException} if it could not be found.
	*
	* @param hrAssetCheckoutId the primary key of the h r asset checkout
	* @return the h r asset checkout
	* @throws com.liferay.hr.NoSuchAssetCheckoutException if a h r asset checkout with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRAssetCheckout findByPrimaryKey(
		long hrAssetCheckoutId)
		throws com.liferay.hr.NoSuchAssetCheckoutException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(hrAssetCheckoutId);
	}

	/**
	* Returns the h r asset checkout with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hrAssetCheckoutId the primary key of the h r asset checkout
	* @return the h r asset checkout, or <code>null</code> if a h r asset checkout with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.hr.model.HRAssetCheckout fetchByPrimaryKey(
		long hrAssetCheckoutId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(hrAssetCheckoutId);
	}

	/**
	* Returns all the h r asset checkouts.
	*
	* @return the h r asset checkouts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRAssetCheckout> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the h r asset checkouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r asset checkouts
	* @param end the upper bound of the range of h r asset checkouts (not inclusive)
	* @return the range of h r asset checkouts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRAssetCheckout> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the h r asset checkouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r asset checkouts
	* @param end the upper bound of the range of h r asset checkouts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of h r asset checkouts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.hr.model.HRAssetCheckout> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the h r asset checkouts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of h r asset checkouts.
	*
	* @return the number of h r asset checkouts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HRAssetCheckoutPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HRAssetCheckoutPersistence)PortletBeanLocatorUtil.locate(com.liferay.hr.service.ClpSerializer.getServletContextName(),
					HRAssetCheckoutPersistence.class.getName());

			ReferenceRegistry.registerReference(HRAssetCheckoutUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(HRAssetCheckoutPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(HRAssetCheckoutUtil.class,
			"_persistence");
	}

	private static HRAssetCheckoutPersistence _persistence;
}