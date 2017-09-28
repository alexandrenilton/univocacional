package br.edu.unidesc.univocacional.convert;



import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import br.edu.unidesc.univocacional.facade.NivelEscolaridadeFacade;
import br.edu.unidesc.univocacional.model.NivelEscolaridade;
 
@FacesConverter(forClass=NivelEscolaridade.class)
public class NivelEscolaridadeConverter implements Converter {
	
	@Inject
	private NivelEscolaridadeFacade facade;
	
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
}         
           