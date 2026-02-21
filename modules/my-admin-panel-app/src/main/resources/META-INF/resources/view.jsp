<%@ include file="/init.jsp" %>

<div class="container-fluid container-fluid-max-xl">
	<div class="sheet">
		<div class="sheet-header">
			<h3 class="sheet-title">My Custom Admin App</h3>
		</div>
		<div class="sheet-body">
			<p class="mb-3">
				<liferay-ui:message key="myadminpanelapp.caption" />
			</p>
			
			<div class="alert alert-info">
				This module was created using the <strong>panel-app</strong> template and is registered as a <code>PanelApp</code> OSGi service.
			</div>
			
			<p>
				It is currently located in the <strong>Content & Data</strong> section of the Site Administration menu.
			</p>
		</div>
	</div>
</div>
