<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="/top-tags.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Estudiante interesado</title>

  <script src="js/jquery.min.js"></script>
</head>
<body>
<div class="right_col" role="main">

                <br />
                <div class="">

                 


<div class="page-title">
                        <div class="title_left">
                           <center> <h3>Estudiantes interesados</h3></center>
                        </div>
                
</div>


     <div class="clearfix"></div>

                    <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                      
                                <div class="x_content">
                                    <br />
                                    <html:form action="/interesado" method="post" styleClass="form-horizontal form-label-left">

                                        <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Nombres <span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                 <td><html:text property="nombre"/></td>
                                            </div>
                                        </div>
                                        
                                          <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Apellidos <span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                 <td><html:text property="apellido"/></td>
                                            </div>
                                        </div>
                                        
                                         <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Email <span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                 <td><html:text property="correo"/></td>
                                            </div>
                                        </div>
                                        
                                          <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Usuario <span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                 <td><html:text property="usuario"/></td>
                                            </div>
                                        </div>
                                    
                                          <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Teléfono<span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <td><html:text property="telefono"/></td>
                                            </div>
                                        </div>
                                        
                                        
                                         <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Escuela<span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                  <logic:present name="Institución">
                                                <html:select property="id_carrera1" styleClass="form-control">
                                                <html:options collection="1era Opción" property="id_carrera1" labelProperty="Institución" />
                                                </html:select>
                                                </logic:present> 
                                            </div>
                                        </div>
                                        
                                         
                                      
                                      
                                        <div class="ln_solid"></div>
                                        <div class="form-group">
                                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                       		  <button type="reset" class="btn btn-primary">Cancelar</button>
											    <html:submit property="submit" styleClass="btn btn-success" value="Agregar" onclick="agregar()"/> 
											    <html:submit property="submit" styleClass="btn btn-info" value="Consultar" onclick="mostrar()"/> 
											    <html:submit property="submit" styleClass="btn btn-warning" value="Modificar" onclick="modificar()"/>                                                
											    <html:submit property="submit" styleClass="btn btn-danger" value="Eliminar" onclick="eliminar()"/> 
											    <html:hidden property="method" value=""/>
                                           
                                             
&nbsp;&nbsp;
<html:reset value="Limpiar"/>
<html:hidden property="method" value="requesters"/>
                                           
                                            </div>
                                        </div>

                                    </html:form>
                                </div>
                            </div>
                        </div>
                    </div>              
                       

                     
                    <script src="js/jquery.inputmask.js"></script>
                           <script>
        $(document).ready(function () {
            $(":input").inputmask();
        });
    </script>
               

            </div>
            <!-- /page content -->
        </div>

</body>
</html:html>