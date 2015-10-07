package sistema.Visitas.Institucionales.Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sistema.Visitas.Institucionales.Form.VisitasForm;
import sistema.Visitas.Institucionales.Model.VisitasModel;

public class VisitasAction extends DispatchAction {
	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {					
			VisitasForm _VisitasForm = (VisitasForm)form;
			VisitasModel _asp = new VisitasModel();
			if(_asp.guardarVisita(_VisitasForm))
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
			VisitasForm _VisitasForm = (VisitasForm)form;
			VisitasModel _asp = new VisitasModel();
			if(_asp.modificarVisita(_VisitasForm))
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
			VisitasForm _VisitasForm = (VisitasForm)form;
			VisitasModel _asp = new VisitasModel();
			if(_asp.eliminarVisita(_VisitasForm))
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
		    VisitasModel visita1=new  VisitasModel();
		    ArrayList<VisitasForm> listaVisita=visita1.cosultarVisitas();
		    request.setAttribute("visita", listaVisita);
		    		    
		    return mapping.findForward("inicio");
		
	       }

}
