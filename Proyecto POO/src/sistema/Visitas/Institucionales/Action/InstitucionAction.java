package sistema.Visitas.Institucionales.Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sistema.Visitas.Institucionales.Form.InstitucionForm;
import sistema.Visitas.Institucionales.Model.InstitucionesModel;


public class InstitucionAction extends DispatchAction{
	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {					
			InstitucionForm _InstitucionForm = (InstitucionForm)form;
			InstitucionesModel _asp = new InstitucionesModel();
			if(_asp.guardarInstitucion(_InstitucionForm))
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
			InstitucionForm _InstitucionForm = (InstitucionForm)form;
			InstitucionesModel _asp = new InstitucionesModel();
			if(_asp.modificarInstitucion(_InstitucionForm))
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
			InstitucionForm _InstitucionForm = (InstitucionForm)form;
			InstitucionesModel _asp = new InstitucionesModel();
			if(_asp.eliminarInstitucion(_InstitucionForm.getId()))
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
		    InstitucionesModel institucion1=new  InstitucionesModel();
		    ArrayList<InstitucionForm> listaInstitucion=institucion1.cosultarInstituciones();
		    request.setAttribute("institucion", listaInstitucion);
		    		    
		    return mapping.findForward("inicio");
		
	       }


}
