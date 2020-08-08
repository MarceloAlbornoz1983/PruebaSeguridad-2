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
				<h1 class="page-header">Asesoria</h1>
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

					<form:form method="post" action="/profesional/guardarasesoria"
						modelAttribute="asesoria">

						<form:input path="idAse" class="form-control" type="hidden" />


						<div class="form-group col-lg-5">
							<label>Tipo de asesoria</label>
							<form:input path="tipoAse" class="form-control" type="text" />
						</div>
						<div class="form-group col-lg-5">
							<label>Tema asesoria</label>
							<form:input path="temaAse" class="form-control" type="text" />
						</div>

						<div class="form-group col-lg-5">
							<label>Asesoria incluida</label>
							<form:input path="asesoriaInc" class="form-control" type="text" placeholder="2020-01-01"/>
						</div>

						<div class="form-group col-lg-5">
							<label>Fecha agendada</label>
							<form:input path="fechaAsesoriaAge" class="form-control"
								type="date" />
						</div>

						<div class="form-group col-lg-5">
							<label>Fecha realizada</label>
							<form:input path="fechaAsesoriaReal" class="form-control"
								type="date"/>
						</div>


						<div class="form-group col-lg-5">
							<label>Empresa</label>
							<form:select path="empresaRut" class="form-control">
								<form:option value="" label="--Selecciones Empresa--" />
								<c:forEach items="${listadoemp}" var="obj">
									<form:option value="${obj.nombreEmp}">
										<c:out value="${obj.nombreEmp}" />
									</form:option>
								</c:forEach>
							</form:select>

						</div>


						<div class="form-group col-lg-5">
							<label>Profesional</label>
							<form:select path="profesionalRut" class="form-control">
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
							<form:textarea path="obsAse" class="form-control" rows="3"></form:textarea>
						</div>
						<br>
						<button type="submit"
							class="offset-lg-1 btn btn-default btn-success btn-form">Aceptar</button>
						<button type="reset"
							class="offset-lg-1 btn btn-default btn-danger btn-form">Cancelar</button>

					</form:form>
				</div>
				<div class="panel-footer"></div>
			</div>
		</div>
	</div>

</div>
<jsp:include page="plantillas/scripts.jsp"></jsp:include>