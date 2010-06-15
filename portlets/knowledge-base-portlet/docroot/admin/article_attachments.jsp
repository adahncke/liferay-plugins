<%
/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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
%>

<%@ include file="/admin/init.jsp" %>

<%
Article article = (Article)request.getAttribute(WebKeys.KNOWLEDGE_BASE_ARTICLE);

String dirName = ParamUtil.getString(request, "dirName");

long companyId = (article != null) ? article.getCompanyId() : company.getCompanyId();
String[] fileNames = (article != null) ? article.getAttachmentsFileNames() : new String[0];

if (Validator.isNotNull(dirName)) {
	companyId = company.getCompanyId();
	fileNames = DLServiceUtil.getFileNames(companyId, CompanyConstants.SYSTEM, dirName);
}
%>

<c:if test="<%= fileNames.length > 0 %>">
	<div class="kb-article-attachments">

		<%
		for (String fileName : fileNames) {
		%>

			<div>
				<portlet:resourceURL id="attachment" var="clipURL">
					<portlet:param name="companyId" value="<%= String.valueOf(companyId) %>" />
					<portlet:param name="fileName" value="<%= fileName %>" />
				</portlet:resourceURL>

				<liferay-ui:icon
					image="clip"
					label="<%= true %>"
					message='<%= FileUtil.getShortFileName(fileName) + " (" + TextFormatter.formatKB(DLServiceUtil.getFileSize(companyId, CompanyConstants.SYSTEM, fileName), locale) + "k)" %>'
					method="get"
					url="<%= clipURL %>"
				/>
			</div>

		<%
		}
		%>

	</div>
</c:if>