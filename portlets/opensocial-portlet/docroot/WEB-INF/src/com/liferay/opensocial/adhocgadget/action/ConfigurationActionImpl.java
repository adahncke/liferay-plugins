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

package com.liferay.opensocial.adhocgadget.action;

import com.liferay.opensocial.gadget.action.BaseConfigurationAction;
import com.liferay.opensocial.model.Gadget;
import com.liferay.opensocial.shindig.util.ShindigUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author Michael Young
 */
public class ConfigurationActionImpl extends BaseConfigurationAction {

	@Override
	public void processAction(
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse)
		throws Exception {

		String tabs2 = ParamUtil.get(actionRequest, "tabs2", "gadget");

		if (tabs2.equals("preferences")) {
			doProcessAction(portletConfig, actionRequest, actionResponse);
		}
		else {
			String url = getParameter(actionRequest, "url");

			setPreference(actionRequest, "url", url);

			super.processAction(portletConfig, actionRequest, actionResponse);
		}
	}

	@Override
	public String render(
			PortletConfig portletConfig, RenderRequest renderRequest,
			RenderResponse renderResponse)
		throws Exception {

		if (hasUserPrefs(portletConfig, renderRequest)) {
			doRender(portletConfig, renderRequest, renderResponse);
		}

		return "/adhoc_gadget/configuration.jsp";
	}

	@Override
	protected Gadget getGadget(
			PortletConfig portletConfig, PortletRequest portletRequest)
		throws Exception {

		String portletResource = ParamUtil.getString(
			portletRequest, "portletResource");

		PortletPreferences portletPreferences =
			PortletPreferencesFactoryUtil.getPortletSetup(
				portletRequest, portletResource);

		return ShindigUtil.getGadget(portletPreferences);
	}

}