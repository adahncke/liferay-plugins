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

package com.liferay.knowledgebase.hook.upgrade.v1_1_0.util;

import com.liferay.documentlibrary.service.DLLocalServiceUtil;
import com.liferay.knowledgebase.model.KBArticle;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CompanyConstants;
import com.liferay.portal.model.GroupConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * @author Peter Shin
 */
public class KBArticleAttachmentsUtil {

	public static void deleteAttachmentsDirectory(long companyId) {
		try {
			String[] fileNames = DLLocalServiceUtil.getFileNames(
				companyId, CompanyConstants.SYSTEM, "knowledgebase/articles");

			if (fileNames.length > 0) {
				if (_log.isWarnEnabled()) {
					_log.warn("Unable to delete knowledgebase/articles");
				}

				return;
			}

			DLLocalServiceUtil.deleteDirectory(
				companyId, CompanyConstants.SYSTEM_STRING,
				CompanyConstants.SYSTEM, "knowledgebase/articles");
		}
		catch (Exception e) {
			_log.error(e.getMessage());
		}
	}

	public static void updateAttachments(KBArticle kbArticle) {
		try {
			long folderId = kbArticle.getClassPK();

			String oldDirName = "knowledgebase/articles/" + folderId;
			String newDirName = "knowledgebase/kbarticles/" + folderId;

			DLLocalServiceUtil.addDirectory(
				kbArticle.getCompanyId(), CompanyConstants.SYSTEM, newDirName);

			String[] fileNames = DLLocalServiceUtil.getFileNames(
				kbArticle.getCompanyId(), CompanyConstants.SYSTEM, oldDirName);

			ServiceContext serviceContext = new ServiceContext();

			serviceContext.setCompanyId(kbArticle.getCompanyId());
			serviceContext.setScopeGroupId(kbArticle.getGroupId());

			for (String fileName : fileNames) {
				String shortFileName = FileUtil.getShortFileName(fileName);
				byte[] bytes = DLLocalServiceUtil.getFile(
					kbArticle.getCompanyId(), CompanyConstants.SYSTEM,
					fileName);

				DLLocalServiceUtil.addFile(
					kbArticle.getCompanyId(), CompanyConstants.SYSTEM_STRING,
					GroupConstants.DEFAULT_PARENT_GROUP_ID,
					CompanyConstants.SYSTEM,
					newDirName + StringPool.SLASH + shortFileName, 0,
					StringPool.BLANK, serviceContext.getModifiedDate(null),
					serviceContext, bytes);
			}

			DLLocalServiceUtil.deleteDirectory(
				kbArticle.getCompanyId(), CompanyConstants.SYSTEM_STRING,
				CompanyConstants.SYSTEM, oldDirName);

			if (_log.isInfoEnabled()) {
				_log.info("Added attachments for " + folderId);
			}
		}
		catch (Exception e) {
			_log.error(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		KBArticleAttachmentsUtil.class);

}