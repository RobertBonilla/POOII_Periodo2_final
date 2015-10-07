package sistema.Visitas.Institucionales.Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sistema.Visitas.Institucionales.Form.RolForm;
import sistema.Visitas.Institucionales.Model.RolesModel;

public class RolAction extends DispatchAction{
	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {					
			RolForm _RolForm = (RolForm)form;
			RolesModel _asp = new RolesModel();
			if(_asp.guardarRol(_RolForm))
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
			RolForm _RolForm = (RolForm)form;
			RolesModel _asp = new RolesModel();
			if(_asp.modificarRol(_RolForm))
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
			RolForm _RolForm = (RolForm)form;
			RolesModel _asp = new RolesModel();
			if(_asp.eliminarRol(_RolForm.getId()))
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
		    RolesModel roles1=new RolesModel();
		    ArrayList<RolForm> listaRol=roles1.cosultarRoles();
		    request.setAttribute("rol", listaRol);
		    		    
		    return mapping.findForward("inicio");
		
	       }


}
