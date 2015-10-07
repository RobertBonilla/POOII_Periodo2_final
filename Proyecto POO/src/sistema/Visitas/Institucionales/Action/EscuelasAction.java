package sistema.Visitas.Institucionales.Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sistema.Visitas.Institucionales.Form.EscuelaForm;
import sistema.Visitas.Institucionales.Form.FacultadForm;
import sistema.Visitas.Institucionales.Model.EscuelasModel;
import sistema.Visitas.Institucionales.Model.FacultadModel;

public class EscuelasAction extends DispatchAction {
	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {					
			EscuelaForm _EscuelaForm = (EscuelaForm)form;
			EscuelasModel _asp = new EscuelasModel();
			if(_asp.guardarEscuela(_EscuelaForm))
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
			EscuelaForm _EscuelaForm = (EscuelaForm)form;
			EscuelasModel _asp = new EscuelasModel();
			if(_asp.modificarEscuela(_EscuelaForm))
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
			EscuelaForm _EscuelaForm = (EscuelaForm)form;
			EscuelasModel _asp = new EscuelasModel();
			if(_asp.eliminarEscuela(_EscuelaForm.getId()))
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
		    EscuelasModel escuela1=new  EscuelasModel();
		    ArrayList<EscuelaForm> listaEscuela=escuela1.cosultarEscuelas();
		    request.setAttribute("escuela", listaEscuela);
		    FacultadModel facultad = new FacultadModel();
		    ArrayList<FacultadForm> listaFacultad=facultad.cosultarFacultades();
		    request.setAttribute("facultad", listaFacultad);
		    
		    return mapping.findForward("escuela");
		
			}
			

}
