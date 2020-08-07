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
				<h1 class="page-header">Asesoria Especial</h1>
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

					<form:form method="post" action="/profesional/guardarasesoriaespecial"
						modelAttribute="asesoriaespecial">

						<form:input path="idAsesoriaEspecial" class="form-control" type="hidden" />


						<div class="form-group col-lg-5">
							<label>Tipo de asesoria Especial</label>
							<form:input path="tipoAsesoria" class="form-control" type="text" />
						</div>
						
						<div class="form-group col-lg-5">
							<label>Empresa</label>
							<form:select path="rutEmpresa" class="form-control">
								<form:option value="" label="--Selecciones Empresa--" />
								<c:forEach items="${listadoemp}" var="obj">
									<form:option value="${obj.nombreEmp}">
										<c:out value="${obj.nombreEmp}" />
									</form:option>
								</c:forEach>
							</form:select>

						</div>

						<div class="form-group col-lg-12">
							<label>Observaciones</label>
							<form:textarea path="obserSolicEspecial" class="form-control" rows="3"></form:textarea>
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