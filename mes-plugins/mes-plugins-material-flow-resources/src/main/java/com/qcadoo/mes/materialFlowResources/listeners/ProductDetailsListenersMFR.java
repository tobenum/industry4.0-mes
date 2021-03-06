package com.qcadoo.mes.materialFlowResources.listeners;

/**
 * Created by alex on 2017/6/4.
 */
import org.springframework.stereotype.Service;

import com.qcadoo.view.api.ComponentState;
import com.qcadoo.view.api.ViewDefinitionState;
import com.qcadoo.view.api.components.FormComponent;

@Service
public class ProductDetailsListenersMFR {

    public void showStorageLocationHistory(final ViewDefinitionState view, final ComponentState state, final String[] args) {
        FormComponent form = (FormComponent) view.getComponentByReference("form");

        Long id = form.getEntityId();
        String url = "../page/materialFlowResources/productStorageLocationHistoryDetails.html?context={\"form.id\":\"" + id
                + "\"}";
        view.openModal(url);
    }

}
