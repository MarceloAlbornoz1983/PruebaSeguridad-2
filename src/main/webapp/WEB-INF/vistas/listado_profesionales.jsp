<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:include page="plantillas/nav.jsp"></jsp:include>

<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-10">
			<h1 class="page-header">Listado de Profesionales</h1>
		</div>
		<div class="col-lg-2">

			<a href="mantencioninfoprofesional"><button
					class="btn btn-success page-header">Agregar Nuevo</button></a>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<br>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Administradores</div>
				<!-- /.panel-heading -->
				<div class="panel-body">
					<table width="100%"
						class="table table-striped table-bordered table-hover"
						id="dataTables-example">
						<thead>
							<tr>
								<th>Nombre</th>														
								<th>Rut</th>
								<th>Departamento</th>
								<th>Telefono</th>
								<th>Correo</th>
								<th>Cargo</th>
								<th>Fecha ingreso</th>
								<th>Usuario</th>
								<th>Clave</th>
								<th>Acciones</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listado}" var="obj">
								<tr class="odd gradeX">
									<td><c:out value="${obj.nombrePro} ${obj.apellidoPro}" /></td>
									<td><c:out value="${obj.rutPro}" /></td>
									<td><c:out value="${obj.deptPro}" /></td>
									<td><c:out value="${obj.telPro}" /></td>
									<td><c:out value="${obj.correoPro}" /></td>
									<td><c:out value="${obj.cargoPro}" /></td>
									<td><c:out value="${obj.usuarioPro}" /></td>
									<td><c:out value="${obj.clavePro}" /></td>
									<td><c:out value="${obj.admRut}" /></td>
									<td align="center">
										<div class="btn-group">
											<a href="editarprofesional/${obj.idPro}"><button class="btn btn-warning">
												<i class="fa fa-pencil"></i>
											</button></a>
											<a onclick="eliminarprofesional([[${obj.idPro}]])"><button class="btn btn-danger">
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