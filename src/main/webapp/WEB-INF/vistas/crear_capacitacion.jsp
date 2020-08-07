<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<jsp:include page="plantillas/nav.jsp"></jsp:include>

<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-10">
			<h1 class="page-header">Capacitacion</h1>
		</div>


		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12 col-md-6">
			<form:form method="post" action="/profesional/guardarcapacitaciones"
				modelAttribute="capacitaciones">

				<form:input path="idCaps" class="form-control" type="hidden" />
				<div class="form-group col-lg-5">
				
					<label>Capacitacion</label>
					<form:select path="cap" class="form-control">
						<form:option value="" label="--Selecciones Capacitacion--" />
						<c:forEach items="${listadocap}" var="obj">
							<form:option value="${obj.nomCap}">
								<c:out value="${obj.nomCap}" />
							</form:option>
						</c:forEach>
					</form:select>

				</div>

				<div class="form-group col-lg-5">
					<label>Empresa</label>
					<form:select path="empresa" class="form-control">
						<form:option value="" label="--Selecciones Empresa--" />
						<c:forEach items="${listadoemp}" var="obj">
							<form:option value="${obj.rutEmp}">
								<c:out value="${obj.nombreEmp}" />
							</form:option>
						</c:forEach>
					</form:select>

				</div>

				<div class="form-group col-lg-5">
					<label>Estado</label>
					<form:input path="estadoCap" class="form-control" type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Fecha Agendada</label>
					<form:input path="fechaAge" class="form-control" type="date" />
				</div>

				<div class="form-group col-lg-5">
					<label>Fecha Realizada</label>
					<form:input path="fechaReal" class="form-control" type="date" />
				</div>

				<div class="form-group col-lg-5">
					<label>Tema</label>
					<form:input path="temaCap" class="form-control" type="text" />
				</div>

				<div class="form-group col-lg-5">
					<label>Profesional</label>
					<form:select path="profesional" class="form-control">
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
					<form:textarea path="obs" class="form-control" rows="3"></form:textarea>
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
