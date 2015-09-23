package br.com.messages.utils;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import org.primefaces.context.RequestContext;

@ManagedBean
public class DialogBean {
 
    public void showMessageInfo() {
        RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Mensagem Info."));
    }
    
    public void showMessageError(){
    	RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error","Mensagem Erro"));
    }
    
    public void showMessageAlerta(){
    	RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_WARN,"Alert","Mensagem Alerta"));
    }
    
    public void showMessageErrorFatal(){
    	RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_FATAL,"Fatal","Mensagem Erro Fatal"));
    }
}