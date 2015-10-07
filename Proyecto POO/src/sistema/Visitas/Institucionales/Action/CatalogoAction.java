package sistema.Visitas.Institucionales.Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sistema.Visitas.Institucionales.Form.*;
import sistema.Visitas.Institucionales.Model.*;

public class CatalogoAction extends DispatchAction {
	public ActionForward CatalogoAspirante(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {		    
		AspirantesModel CatalogoAspirante=new AspirantesModel();
		ArrayList<AspiranteForm> listAspirante=CatalogoAspirante.cosultarAspirantes();
		request.setAttribute("aspirante", listAspirante);
		
		return mapping.findForward("ingresado");
		
			}
	
	public ActionForward CatalogoEscuela(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {		    
		EscuelasModel CatalogoEscuela=new EscuelasModel();
		ArrayList<EscuelaForm> listEscuela=CatalogoEscuela.cosultarEscuelas();
		request.setAttribute("escuela", listEscuela);
		
		return mapping.findForward("ingresado");	
			
			}
	
	public ActionForward CatalogoFacultad(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {		    
		FacultadModel CatalogoFacultad=new FacultadModel();
		ArrayList<FacultadForm> listFacultad=CatalogoFacultad.cosultarFacultades();
		request.setAttribute("facultad", listFacultad);
		
		return mapping.findForward("ingresado");	
			
			}
	
	public ActionForward CatalogoInstitucion(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {		    
		InstitucionesModel CatalogoInstitucion=new InstitucionesModel();
		ArrayList<InstitucionForm> listInstitucion=CatalogoInstitucion.cosultarInstituciones();
		request.setAttribute("institucion", listInstitucion);
		
		return mapping.findForward("ingresado");	
			
			}
	
	public ActionForward CatalogoRol(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {		    
		RolesModel CatalogoRol=new RolesModel();
		ArrayList<RolForm> listRol=CatalogoRol.cosultarRoles();
		request.setAttribute("rol", listRol);
		
		return mapping.findForward("ingresado");	
			
			}
	
	public ActionForward CatalogoUsuario(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {		    
		UsuariosModel CatalogoUsuario=new UsuariosModel();
		ArrayList<UsuarioForm> listUsuario=CatalogoUsuario.cosultarUsuarios();
		request.setAttribute("usuario", listUsuario);
		
		return mapping.findForward("ingresado");	
			
			}
	
	public ActionForward CatalogoVisita(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {		    
		VisitasModel CatalogoVisita=new VisitasModel();
		ArrayList<VisitasForm> listVisita=CatalogoVisita.cosultarVisitas();
		request.setAttribute("visita", listVisita);
		
		return mapping.findForward("ingresado");	
			
			}
	
}

