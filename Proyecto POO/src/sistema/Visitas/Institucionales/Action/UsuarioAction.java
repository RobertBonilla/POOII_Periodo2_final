package sistema.Visitas.Institucionales.Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sistema.Visitas.Institucionales.Form.UsuarioForm;
import sistema.Visitas.Institucionales.Model.UsuariosModel;

public class UsuarioAction extends DispatchAction{
	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {					
			UsuarioForm _UsuarioForm = (UsuarioForm)form;
			UsuariosModel _asp = new UsuariosModel();
			if(_asp.guardarUsuario(_UsuarioForm))
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
			UsuarioForm _UsuarioForm = (UsuarioForm)form;
			UsuariosModel _asp = new UsuariosModel();
			if(_asp.modificarUsuario(_UsuarioForm))
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
			UsuarioForm _UsuarioForm = (UsuarioForm)form;
			UsuariosModel _asp = new UsuariosModel();
			if(_asp.eliminarUsuario(_UsuarioForm.getId()))
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
		    UsuariosModel usuario1=new UsuariosModel();
		    ArrayList<UsuarioForm> listaUsuario=usuario1.cosultarUsuarios();
		    request.setAttribute("usuario", listaUsuario);
		    		    
		    return mapping.findForward("inicio");
		
	       }


}
