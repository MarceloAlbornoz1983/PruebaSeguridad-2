<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<jsp:include page="plantillas/nav.jsp"></jsp:include>

<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-10">
			<h1 class="page-header">Profesional</h1>
		</div>

		
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12 col-md-6">
			<form:form method="post" action="/administrador/guardarprofesional"
				modelAttribute="profesional">
				<div class="form-group col-lg-5">
				
				<form:input path="idPro" class="form-control" type="hidden" />
				
					<label>Nombre</label>
					<form:input path="nombrePro" class="form-control" type="text" />
				</div>
				<div class="form-group col-lg-5">
					<label>Apellido</label>
					<form:input path="apellidoPro" class="form-control"
						type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Rut</label>
					<form:input path="rutPro" class="form-control" type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Departamento</label>
					<form:input path="deptPro" class="form-control" type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Telefono</label>
					<form:input path="telPro" class="form-control" type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Correo</label>
					<form:input path="correoPro" class="form-control" type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Cargo</label>
					<form:input path="cargoPro" class="form-control" type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Profesion</label>
					<form:input path="profesionPro" class="form-control"
						type="text" />
				</div>
				
				<div class="form-group col-lg-5">
					<label>Fecha Ingreso</label>
					<form:input path="fechaIngresoPro" class="form-control"
						type="date" />
				</div>
				<div class="form-group col-lg-5">
					<label>Usuario</label>
					<form:input path="usuarioPro" class="form-control"
						type="text" />
				</div>
				<div class="form-group col-lg-5">
					<label>Clave</label>
					<form:input path="clavePro" class="form-control"
						type="text" />
				</div>

				
				<div class="form-group col-lg-5">
					<label>Administrador que registra</label>
					<form:select path="admRut" class="form-control">
						<form:option value="" label="--Selecciones Administrador--" />
						<c:forEach items="${listado}" var="obj">
							<form:option value="${obj.rutAdm}">
								<c:out value="${obj.nombreAdm}" />
							</form:option>
						</c:forEach>
					</form:select>

				</div>

				<div class="col-lg-8">
					<button type="submit" class="btn btn-default btn-success btn-form">Submit
						Button</button>
					<button type="reset" class="btn btn-default btn-danger btn-form">Reset
						Button</button>
				</div>
			</form:form>
		</div>

	</div>
	<!-- /.row -->

</div>

<jsp:include page="plantillas/scripts.jsp"></jsp:include>