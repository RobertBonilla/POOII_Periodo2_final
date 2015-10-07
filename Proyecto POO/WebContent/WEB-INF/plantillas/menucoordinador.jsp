 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/top-tags.jsp"%>
         <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">

                        <div class="menu_section">
                           <br/>
                            <ul class="nav side-menu">                            
                            	 <li><a href="pagina1msj.jsp"> Inicio </a></li>  
                            	 <li><html:link forward="escuela">Escuela</html:link> </li>                                
                                	<li><html:link forward="aspirante">Crear Institución</html:link> </li>                                
                               		  <li><html:link forward="visita">Agregar Visita</html:link></li>
                        		 <li><html:link forward="docente">Agregar Docente</html:link> </li>
                        		                                 
                                  <li><a><i class="fa fa-home"></i> Agenda de Visitas<span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><html:link forward="visitadocente">Docente</html:link></li>
                                        <li><html:link forward="visitapropia">Personal</html:link></li>                                      
                           </ul>
                                </li>
                                 <li><html:link forward="estudianteinteresado">Agregar Estudiantes</html:link> </li>
                                <li><html:link forward="aspirante">Reporte</html:link> </li>
                                <li><html:link forward="verinteresado">Consultar Estudiantes Interesados</html:link></li>
                                </ul>
                        </div>

                    </div>