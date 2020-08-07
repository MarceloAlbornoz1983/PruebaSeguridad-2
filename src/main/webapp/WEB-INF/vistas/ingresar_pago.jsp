<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<jsp:include page="plantillas/nav.jsp"></jsp:include>

<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Crear Capacitacion</h1>
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
					<form:form method="post" action="ingresocapacitacion"
						modelAttribute="ingresocapacitacion">
						<div class="form-group col-lg-6">
							<label>Tipo Capacitacion</label>
							<form:select path="cap" class="form-control" items="${listado}" multiple="true">
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
							</form:select>
						</div>
						<div class="form-group col-lg-6">
							<label>Profesional</label>
							<form:input path="profesional" class="form-control" id="disabledInput" type="text"
								placeholder="Paula Carrasco"/> 	
						</div>
						<div class="form-group col-lg-6">
							<label>Empresa</label>
							<form:select path="empresa" class="form-control">
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
							</form:select>
						</div>
						<div class="form-group col-lg-6">
							<label>Fecha agendada</label>
							<form:input path="fechaAge" class="form-control" type="date" />
						</div>
						<div class="form-group col-lg-6">
							<label>Fecha Realizada</label>
							<form:input path="fechaReal" class="form-control" type="date" />
						</div>
						<!--
                            <div class="form-group col-lg-6">
                                <label>Estado capacitacion</label>
                                <form:input path="estadoCap" class="form-control" type="text"/>
							</div>
							-->
						<div class="form-group col-lg-6">
							<label>Tema capacitacion</label>
							<form:input path="temaCap" class="form-control" type="text" />
						</div>
						<div class="form-group col-lg-12">
							<label>Observaciones</label>
							<form:textarea path="obs" class="form-control" rows="3"></form:textarea>
						</div>
						<br>


					</form:form>
				</div>
				<div class="panel-footer">

					<button type="submit" class="btn btn-default btn-success btn-form">Crear
					</button>
					<button type="reset" class="btn btn-default btn-danger btn-form">Reset
						Button</button>

				</div>
			</div>
			<!-- /.row -->

		</div>

		<jsp:include page="plantillas/scripts.jsp"></jsp:include>