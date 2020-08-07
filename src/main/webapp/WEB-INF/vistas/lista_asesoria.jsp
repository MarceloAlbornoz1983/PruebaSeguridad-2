<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:include page="plantillas/nav.jsp"></jsp:include>

<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-10">
			<h1 class="page-header">Agenda de Asesorias</h1>
		</div>
		<div class="col-lg-2">

			<a href="ingresoasesoria"><button
					class="btn btn-success page-header">Agregar Nuevo</button></a>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<br>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">DataTables Advanced Tables</div>
				<!-- /.panel-heading -->
				<div class="panel-body">
					<table width="100%"
						class="table table-striped table-bordered table-hover"
						id="dataTables-example">
						<thead>
							<tr>
								<th>Tipo de asesoria</th>								
								<th>Tema</th>
								<th>Asesoria incluida</th>
								<th>Fecha agendada</th>
								<th>Fecha realizada</th>
								<th>Empresa</th>
								<th>Profesional</th>
								<th>Observaciones</th>
								<th>Acciones</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listado}" var="obj">
								<tr class="odd gradeX">
									<td><c:out value="${obj.tipoAse}"/></td>
									<td><c:out value="${obj.temaAse}"/></td>
									<td><c:out value="${obj.asesoriaInc}"/></td>
									<td><c:out value="${obj.fechaAsesoriaAge}"/></td>
									<td><c:out value="${obj.fechaAsesoriaReal}"/></td>
									<td><c:out value="${obj.empresaRut}"/></td>
									<td><c:out value="${obj.profesionalRut}"/></td>
									<td><c:out value="${obj.obsAse}"/></td>
									
									<td align="center">
										<div class="btn-group">
											<a href="editarasesoria/${obj.idAse}"><button class="btn btn-warning">
												<i class="fa fa-pencil"></i>
											</button></a>
											<a onclick="eliminarasesoria([[${obj.idAse}]])"><button class="btn btn-danger">
												<i class="fa fa-times"></i>
											</button></a>

										</div>
									</td>
								</tr>
							</c:forEach>						
						</tbody>
					</table>
					<!-- /.table-responsive -->
					
				</div>
				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->

</div>
<!-- /#page-wrapper -->

<jsp:include page="plantillas/scripts.jsp"></jsp:include>