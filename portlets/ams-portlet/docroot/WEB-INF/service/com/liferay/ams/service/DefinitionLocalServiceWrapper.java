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

package com.liferay.ams.service;

/**
 * <p>
 * This class is a wrapper for {@link DefinitionLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       DefinitionLocalService
 * @generated
 */
public class DefinitionLocalServiceWrapper implements DefinitionLocalService {
	public DefinitionLocalServiceWrapper(
		DefinitionLocalService definitionLocalService) {
		_definitionLocalService = definitionLocalService;
	}

	/**
	* Adds the definition to the database. Also notifies the appropriate model listeners.
	*
	* @param definition the definition
	* @return the definition that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.ams.model.Definition addDefinition(
		com.liferay.ams.model.Definition definition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _definitionLocalService.addDefinition(definition);
	}

	/**
	* Creates a new definition with the primary key. Does not add the definition to the database.
	*
	* @param definitionId the primary key for the new definition
	* @return the new definition
	*/
	public com.liferay.ams.model.Definition createDefinition(long definitionId) {
		return _definitionLocalService.createDefinition(definitionId);
	}

	/**
	* Deletes the definition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param definitionId the primary key of the definition
	* @throws PortalException if a definition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDefinition(long definitionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_definitionLocalService.deleteDefinition(definitionId);
	}

	/**
	* Deletes the definition from the database. Also notifies the appropriate model listeners.
	*
	* @param definition the definition
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDefinition(com.liferay.ams.model.Definition definition)
		throws com.liferay.portal.kernel.exception.SystemException {
		_definitionLocalService.deleteDefinition(definition);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _definitionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _definitionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _definitionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _definitionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the definition with the primary key.
	*
	* @param definitionId the primary key of the definition
	* @return the definition
	* @throws PortalException if a definition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.ams.model.Definition getDefinition(long definitionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _definitionLocalService.getDefinition(definitionId);
	}

	/**
	* Returns a range of all the definitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of definitions
	* @param end the upper bound of the range of definitions (not inclusive)
	* @return the range of definitions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.ams.model.Definition> getDefinitions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _definitionLocalService.getDefinitions(start, end);
	}

	/**
	* Returns the number of definitions.
	*
	* @return the number of definitions
	* @throws SystemException if a system exception occurred
	*/
	public int getDefinitionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _definitionLocalService.getDefinitionsCount();
	}

	/**
	* Updates the definition in the database. Also notifies the appropriate model listeners.
	*
	* @param definition the definition
	* @return the definition that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.ams.model.Definition updateDefinition(
		com.liferay.ams.model.Definition definition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _definitionLocalService.updateDefinition(definition);
	}

	/**
	* Updates the definition in the database. Also notifies the appropriate model listeners.
	*
	* @param definition the definition
	* @param merge whether to merge the definition with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the definition that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.ams.model.Definition updateDefinition(
		com.liferay.ams.model.Definition definition, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _definitionLocalService.updateDefinition(definition, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _definitionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_definitionLocalService.setBeanIdentifier(beanIdentifier);
	}

	public DefinitionLocalService getWrappedDefinitionLocalService() {
		return _definitionLocalService;
	}

	public void setWrappedDefinitionLocalService(
		DefinitionLocalService definitionLocalService) {
		_definitionLocalService = definitionLocalService;
	}

	private DefinitionLocalService _definitionLocalService;
}