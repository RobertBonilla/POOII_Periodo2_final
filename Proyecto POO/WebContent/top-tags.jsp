<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<style media="all" type="text/css">

@import url("${ctx}/css/bootstrap.min.css");
@import url("${ctx}/fonts/css/font-awesome.min.css");
@import url("${ctx}/css/animate.min.css");
@import url("${ctx}/css/custom.css");
@import url("${ctx}/css/icheck/flat/green.css");
@import url("${ctx}/css/floatexamples.css");


</style>

<script type="text/javascript" language="JavaScript">
function agregar(){
document.forms[0].method.value ="agregar"
document.forms[0].submit();
}
function modificar(){
document.forms[0].method.value ="modificar"
document.forms[0].submit();
}
function eliminar(){
document.forms[0].method.value ="eliminar"
document.forms[0].submit();
}
function mostrar(){
document.forms[0].method.value ="mostrar"
document.forms[0].submit();
}
</script>