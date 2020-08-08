<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<jsp:include page="plantillas/nav.jsp"></jsp:include>

<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-10">
			<h1 class="page-header">Empresa</h1>
		</div>

		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12 col-md-6">
			<form:form method="post" action="/administrador/nuevaempresa"
				modelAttribute="empresa">

				<form:input path="idEmp" class="form-control" type="hidden" />

				<div class="form-group col-lg-5">
					<label>Nombre empresa</label>
					<form:input path="nombreEmp" class="form-control" type="text" />
				</div>
				<div class="form-group col-lg-5">
					<label>Representante</label>
					<form:input path="representanteEmp" class="form-control"
						type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Rut empresa</label>
					<form:input path="rutEmp" class="form-control" type="text" id="rut"
						name="rut" oninput="checkRut([[${rut}]])"
						placeholder="Ingrese RUT" />
				</div>

				<div class="form-group col-lg-5">
					<label>Direccion</label>
					<form:input path="direccionEmp" class="form-control" type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Telefono</label>
					<form:input path="telEmp" class="form-control" type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Correo</label>
					<form:input path="correoEmp" class="form-control" type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Giro</label>
					<form:input path="giroEmp" class="form-control" type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Fecha ingreso</label>
					<form:input path="fechaIngresoEmp" class="form-control" type="date" />
				</div>

				<div class="form-group col-lg-5">
					<label>Cantidad trabajadores</label>
					<form:input path="numeroTrabajadoresEne" class="form-control"
						type="text" />
				</div>


				<div class="form-group col-lg-5">
					<label>Administrador que registra Prueba select</label>

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
					<button type="submit" class="btn btn-default btn-success btn-form">Aceptar
					</button>
					<button type="reset" class="btn btn-default btn-danger btn-form">Cancelar
					</button>
				</div>
			</form:form>
		</div>

	</div>
	<!-- /.row -->

</div>

<jsp:include page="plantillas/scripts.jsp"></jsp:include>