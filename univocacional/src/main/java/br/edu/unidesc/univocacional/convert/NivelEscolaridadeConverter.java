package br.edu.unidesc.univocacional.convert;



import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.unidesc.univocacional.facade.NivelEscolaridadeFacade;
import br.edu.unidesc.univocacional.model.NivelEscolaridade;
 
//@FacesConverter(forClass=NivelEscolaridade.class) //this doesn't work with @Inject
@Named
public class NivelEscolaridadeConverter implements Converter {
	
	@Inject
	private NivelEscolaridadeFacade facade;
	
	/*
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
    	if (value == null || value.isEmpty()) return null;
    
    	Integer id = Integer.valueOf(value);
        NivelEscolaridade ne = facade.findById(id); 
        return ne;
    }
   
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if(object != null) {
            //return String.valueOf(((NivelEscolaridade) object).getId());
        	return String.valueOf(object);
        }
        else {
            return null;
        }
    }
    */
    
	@Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (NivelEscolaridade) uiComponent.getAttributes().get(value);
        }
        return null;
    }
	

	@Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof NivelEscolaridade) {
            NivelEscolaridade entity= (NivelEscolaridade) value;
            if (entity != null && entity instanceof NivelEscolaridade && entity.getId() != null) {
                uiComponent.getAttributes().put( entity.getId().toString(), entity);
                return entity.getId().toString();
            }
        }
        return "";
    }
}         
           