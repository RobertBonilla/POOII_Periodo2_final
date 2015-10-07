package sistema.Visitas.Institucionales.Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sistema.Visitas.Institucionales.Form.FacultadForm;
import sistema.Visitas.Institucionales.Model.FacultadModel;

public class FacultadAction extends DispatchAction{
	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {					
			FacultadForm _FacultadForm = (FacultadForm)form;
			FacultadModel _asp = new FacultadModel();
			if(_asp.guardarFacultad(_FacultadForm))
			{
				return mapping.findForward("Inicio");
			}
			else
			{
				return mapping.findForward("error");
			}			
			
		}

	public ActionForward modificar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {		
			FacultadForm _FacultadForm = (FacultadForm)form;
			FacultadModel _asp = new FacultadModel();
			if(_asp.modificarFacultad(_FacultadForm))
			{
				return mapping.findForward("Inicio");
			}
			else
			{
				return mapping.findForward("error");
			}
			
			}
	
	public ActionForward eliminar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {		
			FacultadForm _FacultadForm = (FacultadForm)form;
			FacultadModel _asp = new FacultadModel();
			if(_asp.eliminarFacultad(_FacultadForm.getId()))
			{
				return mapping.findForward("Inicio");
			}
			else
			{
				return mapping.findForward("error");
			}
			}
	public ActionForward mostrar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {		
		    FacultadModel facultad1=new  FacultadModel();
		    ArrayList<FacultadForm> listaFacultad=facultad1.cosultarFacultades();
		    request.setAttribute("facultad", listaFacultad);
		    		    
		    return mapping.findForward("inicio");
		
	       }


}
