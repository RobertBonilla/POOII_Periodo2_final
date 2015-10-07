package sistema.Visitas.Institucionales.Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sistema.Visitas.Institucionales.Form.AspiranteForm;
import sistema.Visitas.Institucionales.Model.AspirantesModel;

public class AspiranteAction extends DispatchAction {
	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {					
			AspiranteForm _aspiranteForm = (AspiranteForm)form;
			AspirantesModel _asp = new AspirantesModel();
			if(_asp.guardarAspirante(_aspiranteForm))
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
			AspiranteForm _aspiranteForm = (AspiranteForm)form;
			AspirantesModel _asp = new AspirantesModel();
			if(_asp.modificarAspirante(_aspiranteForm))
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
			AspiranteForm _aspiranteForm = (AspiranteForm)form;
			AspirantesModel _asp = new AspirantesModel();
			if(_asp.eliminarAspirante(_aspiranteForm.getId()))
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
		    AspirantesModel aspirante1=new  AspirantesModel();
		    ArrayList<AspiranteForm> listaAspirante=aspirante1.cosultarAspirantes();
		    request.setAttribute("aspirante", listaAspirante);
		    
		    
		    return mapping.findForward("inicio");
		
	       }
			
			

			}