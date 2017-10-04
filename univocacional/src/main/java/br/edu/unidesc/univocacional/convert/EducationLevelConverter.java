package br.edu.unidesc.univocacional.convert;


import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Named;

import br.edu.unidesc.univocacional.model.EducationLevel;
 
//@FacesConverter(forClass=NivelEscolaridade.class) 
@Named
@SessionScoped
public class EducationLevelConverter implements Converter {
	

    
	@Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value)  {
        if (value != null && !value.isEmpty()) {
            return (EducationLevel) uiComponent.getAttributes().get(value);
        }
        return null;
    }
	

	@Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value)  {
        if (value instanceof EducationLevel) {
            EducationLevel entity= (EducationLevel) value;
            if (entity != null && entity instanceof EducationLevel && entity.getId() != null) {
                uiComponent.getAttributes().put( entity.getId().toString(), entity);
                return entity.getId().toString();
            }
        }
        return "";
    }
}         
           