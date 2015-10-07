<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ include file="/top-tags.jsp"%>
  
<html:html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Login de Sistema de Visitas </title>

    <!-- Bootstrap core CSS -->
 

</head>

<body style="background:#F7F7F7;">
    
    <div class="">
        <a class="hiddenanchor" id="toregister"></a>
        <a class="hiddenanchor" id="tologin"></a>

        <div id="wrapper">
            <div id="login" class="animate form">
                <section class="login_content">
                    <html:form action="/validar" method="post">
                        <h1>Formulario de Ingreso</h1>
                        <div>
                            <html:text property="usuario" styleClass="form-control"/>                            
                        </div>
                        <div>
                            <html:text property="password" styleClass="form-control"/>
                            
                        </div>
                        <div>                   
                            <html:hidden property="method" value="login"/>
                            <html:submit property="submit" styleClass="btn btn-default submit" value="Inicie sesión" />                        
                        </div>
                        <div class="clearfix"></div>
                        <div class="separator">                        
                            <div class="clearfix"></div>
                            <br />
                         <div>
                                <h1><img src="../images/udb.png" width="70" height="70"/> UDB</h1>

                                      <p>©2015 Derechos Reservados UDB</p>
                            </div>
                        </div>
                    </html:form>
                    <!-- form -->
                </section>
                <!-- content -->
            </div>
       
        </div>
    </div>
    
 <script src="../js/jquery.min.js"></script>
 
</body>

</html:html>