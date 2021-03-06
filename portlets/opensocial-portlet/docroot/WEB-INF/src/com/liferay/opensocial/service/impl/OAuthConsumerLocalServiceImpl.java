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

package com.liferay.opensocial.service.impl;

import com.liferay.opensocial.model.OAuthConsumer;
import com.liferay.opensocial.model.OAuthConsumerConstants;
import com.liferay.opensocial.service.base.OAuthConsumerLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;
import java.util.List;

/**
 * @author Dennis Ju
 */
public class OAuthConsumerLocalServiceImpl
	extends OAuthConsumerLocalServiceBaseImpl {

	public OAuthConsumer addOAuthConsumer(
			long companyId, long gadgetId, String serviceName,
			String consumerKey, String consumerSecret, String keyType)
		throws SystemException {

		if (keyType.equals(OAuthConsumerConstants.KEY_TYPE_RSA_PRIVATE)) {
			consumerSecret = StringPool.BLANK;
		}

		Date now = new Date();

		long oAuthConsumerId = counterLocalService.increment();

		OAuthConsumer oAuthConsumer = oAuthConsumerPersistence.create(
			oAuthConsumerId);

		oAuthConsumer.setCompanyId(companyId);
		oAuthConsumer.setCreateDate(now);
		oAuthConsumer.setModifiedDate(now);
		oAuthConsumer.setGadgetId(gadgetId);
		oAuthConsumer.setServiceName(serviceName);
		oAuthConsumer.setConsumerKey(consumerKey);
		oAuthConsumer.setConsumerSecret(consumerSecret);
		oAuthConsumer.setKeyType(keyType);

		oAuthConsumerPersistence.update(oAuthConsumer, false);

		return oAuthConsumer;
	}

	@Override
	public void deleteOAuthConsumer(long oAuthConsumerId)
		throws PortalException, SystemException {

		OAuthConsumer oAuthConsumer = oAuthConsumerPersistence.findByPrimaryKey(
			oAuthConsumerId);

		deleteOAuthConsumer(oAuthConsumer);
	}

	@Override
	public void deleteOAuthConsumer(OAuthConsumer oAuthConsumer)
		throws SystemException {

		// OAuth consumer

		oAuthConsumerPersistence.remove(oAuthConsumer);

		// OAuth tokens

		oAuthTokenLocalService.deleteOAuthTokens(
			oAuthConsumer.getGadgetId(), oAuthConsumer.getServiceName());
	}

	public void deleteOAuthConsumers(long gadgetId)
		throws SystemException {

		List<OAuthConsumer> oAuthConsumers =
			oAuthConsumerPersistence.findByGadgetId(gadgetId);

		for (OAuthConsumer oAuthConsumer : oAuthConsumers) {
			deleteOAuthConsumer(oAuthConsumer);
		}
	}

	public OAuthConsumer getOAuthConsumer(long gadgetId, String serviceName)
		throws PortalException, SystemException {

		return oAuthConsumerPersistence.findByG_S(gadgetId, serviceName);
	}

	public List<OAuthConsumer> getOAuthConsumers(long gadgetId)
		throws SystemException {

		return oAuthConsumerPersistence.findByGadgetId(gadgetId);
	}

	public List<OAuthConsumer> getOAuthConsumers(
			long gadgetId, int start, int end)
		throws SystemException {

		return oAuthConsumerPersistence.findByGadgetId(
			gadgetId, start, end);
	}

	public int getOAuthConsumersCount(long gadgetId) throws SystemException {
		return oAuthConsumerPersistence.countByGadgetId(gadgetId);
	}

	public OAuthConsumer updateOAuthConsumer(
			long oAuthConsumerId, String consumerKey, String consumerSecret,
			String keyType, String keyName, String callbackURL)
		throws PortalException, SystemException {

		if (keyType.equals(OAuthConsumerConstants.KEY_TYPE_RSA_PRIVATE)) {
			consumerSecret = StringPool.BLANK;
		}

		OAuthConsumer oAuthConsumer = oAuthConsumerPersistence.findByPrimaryKey(
			oAuthConsumerId);

		oAuthConsumer.setConsumerKey(consumerKey);
		oAuthConsumer.setConsumerSecret(consumerSecret);
		oAuthConsumer.setKeyType(keyType);

		oAuthConsumerPersistence.update(oAuthConsumer, false);

		return oAuthConsumer;
	}

}