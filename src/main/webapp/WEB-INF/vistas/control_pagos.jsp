<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<jsp:include page="plantillas/nav.jsp"></jsp:include>
<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Control Pagos Clientes</h1>
				<div class="panel panel-default">
				<div class="panel-heading">Control de pagos</div>
				<!-- /.panel-heading -->
				<div class="panel-body">
					<table width="100%"
						class="table table-striped table-bordered table-hover"
						id="dataTables-example">
						<thead>
							<tr>
								<th>Rut Empresa</th>														
								<th>Monto de Pago</th>
								<th>Fecha de pago</th>
								<th>Estado</th>
								<th>Acciones</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listado}" var="obj">
								<tr class="odd gradeX">
									<td><c:out value="${obj.rutEmpresa}" /></td>
									<td><c:out value="${obj.montoPago}" /></td>
									<td><c:out value="${obj.fechaPago}" /></td>
									<td><c:out value="${obj.estado}" /></td>
									<td align="center">
										<div class="btn-group">
											<button class="btn btn-warning">
												<i class="fa fa-pencil"></i>
											</button>
											<button class="btn btn-danger">
												<i class="fa fa-times"></i>
											</button>

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
						
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->

	<!-- /.row -->

</div>
<jsp:include page="plantillas/scripts.jsp"></jsp:include>