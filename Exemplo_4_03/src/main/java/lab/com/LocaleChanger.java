package lab.com;

import java.io.Serializable;
import java.util.Locale;
import javax.faces.bean.ManagedBean;
// or 
import javax.faces.bean.SessionScoped;
// or 
import javax.faces.context.FacesContext;

@ManagedBean// or 
@SessionScoped
public class LocaleChanger implements Serializable {

	private static final long serialVersionUID = 1L;

	public String germanAction() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(Locale.GERMAN);
		return null;
	}

	public String englishAction() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(Locale.ENGLISH);
		return null;
	}
}