<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<jsp:include page="plantillas/nav.jsp"></jsp:include>
<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<div class="panel-heading">
				<h1 class="page-header">Administrador</h1>
			</div>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-green">
				<div class="panel-heading">
					<h4>Ingrese los datos</h4>
				</div>
				<div class="panel-body">
					<form:form method="post" action="/administrador/guardaradministrador"
						modelAttribute="administrador">
						<form:input path="idAdm" class="form-control" type="hidden" />
						<div class="form-group col-lg-5">
							<label>Nombre</label>
							<form:input path="nombreAdm" class="form-control" type="text" />
						</div>
						<div class="form-group col-lg-5">
							<label>Rut</label>
							<form:input path="rutAdm" class="form-control" type="text" />
						</div>

						<div class="form-group col-lg-5">
							<label>Telefono</label>
							<form:input path="telAdm" class="form-control" type="text" />
						</div>

						<div class="form-group col-lg-5">
							<label>Correo</label>
							<form:input path="correoAdm" class="form-control" type="text" />
						</div>

						<div class="form-group col-lg-5">
							<label>Usuario</label>
							<form:input path="usuarioAdm" class="form-control" type="text" />
						</div>

						<div class="form-group col-lg-5">
							<label>Clave</label>
							<form:input path="claveAdm" class="form-control" type="text" />
						</div>

						<br>
						<button type="submit" class="btn btn-default btn-success btn-form">Aceptar</button>
						<button type="reset" class="btn btn-default btn-danger btn-form">Cancelar</button>
					</form:form>
				</div>
				<div class="panel-footer">Software Prevencion de Riesgos</div>
			</div>
		</div>


	</div>
	<jsp:include page="plantillas/scripts.jsp"></jsp:include>