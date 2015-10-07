<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="/top-tags.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Visitas</title>

  <script src="js/jquery.min.js"></script>
</head>
<body>
<div class="right_col" role="main">

                <br />
                <div class="">

                 


<div class="page-title">
                        <div class="title_left">
                           <center> <h3>Visitas</h3></center>
                        </div>
                
</div>

 <div class="clearfix"></div>

                    <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                      
                                <div class="x_content">
                                    <br />
                                    <html:form action="/visita" method="post" styleClass="form-horizontal form-label-left">

                                        <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Asignado por: <span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <html:text property="listUsario" styleClass="form-control col-md-7 col-xs-12"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name">Estado <span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                 <html:text property="estado" styleClass="form-control col-md-7 col-xs-12"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">Fecha de Comienzo </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <html:text property="fechaInicio" styleClass="form-control col-md-7 col-xs-12"/>
                                            </div>
                                        </div>
                                         <div class="form-group">
                                            <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">Fecha de Fin </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <html:text property="fechaFin" styleClass="form-control col-md-7 col-xs-12"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Visita Realizada</label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                               
                                                  <div class="btn-group" data-toggle="buttons">
                                            <label class="btn btn-default">                                                 
                                            </label>
                                            <label class="btn btn-default">
                                                <html:checkbox property="visitaRealizada"></html:checkbox>
                                            </label>
                                        
                                        </div>
                                                
                                            </div>
                                        </div>
                                        
                                           <div class="form-group">
                                            <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">Comentarios</label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <textarea class="form-control" rows="3"></textarea>
                                            </div>
                                        </div>
                                        
                                           <div class="form-group">
                                            <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">Comentarios sobre visita</label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <textarea class="form-control" rows="3" ></textarea>
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