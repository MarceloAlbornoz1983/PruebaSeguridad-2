<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<jsp:include page="plantillas/nav.jsp"></jsp:include>

<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-10">
			<h1 class="page-header">Visita</h1>
		</div>


		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12 col-md-6">
			<form:form method="post" action="/profesional/guardarvisita"
				modelAttribute="visitas">

				<form:input path="idVisita" class="form-control" type="hidden" />
				
				<div class="form-group col-lg-5">
					<label>Motivo Visita</label>
					<form:input path="motivoVis" class="form-control" type="text" />
				</div>
				
				
				<div class="form-group col-lg-5">
					<label>Empresa</label>
					<form:select path="rutEmp" class="form-control">
						<form:option value="" label="--Selecciones Empresa--" />
						<c:forEach items="${listadoemp}" var="obj">
							<form:option value="${obj.rutEmp}">
								<c:out value="${obj.nombreEmp}" />
							</form:option>
						</c:forEach>
					</form:select>

				</div>

				<div class="form-group col-lg-5">
					<label>Profesional</label>
					<form:select path="profesionalesRut" class="form-control">
						<form:option value="" label="--Seleccione Profesional--" />
						<c:forEach items="${listadopro}" var="obj">
							<form:option value="${obj.rutPro}">
								<c:out value="${obj.nombrePro}" />
							</form:option>
						</c:forEach>
					</form:select>

				</div>

				<div class="form-group col-lg-12">
					<label>Observaciones</label>
					<form:textarea path="observacionVis" class="form-control" rows="3"></form:textarea>
				</div>
				<br>

				<div class="col-lg-8">
					<button type="submit" class="btn btn-default btn-success btn-form">Aceptar</button>
					<button type="reset" class="btn btn-default btn-danger btn-form">Cancelar</button>
				</div>
			</form:form>
		</div>

	</div>
	<!-- /.row -->

</div>

<jsp:include page="plantillas/scripts.jsp"></jsp:include>
