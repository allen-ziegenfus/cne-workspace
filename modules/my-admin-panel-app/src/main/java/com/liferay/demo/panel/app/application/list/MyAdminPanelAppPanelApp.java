package com.liferay.demo.panel.app.application.list;

import com.liferay.demo.panel.app.constants.MyAdminPanelAppPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author allenz
 */
@Component(
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT
	},
	service = PanelApp.class
)
public class MyAdminPanelAppPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return MyAdminPanelAppPortletKeys.MYADMINPANELAPP;
	}

	@Override
	public Portlet getPortlet() {
		return _portlet;
	}

	@Reference(target = "(jakarta.portlet.name=" + MyAdminPanelAppPortletKeys.MYADMINPANELAPP + ")")
	private Portlet _portlet;

}