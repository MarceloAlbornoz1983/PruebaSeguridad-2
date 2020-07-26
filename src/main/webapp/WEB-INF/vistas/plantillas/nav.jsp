<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Prevencion de Riesgos</title>

<!-- Bootstrap Core CSS -->
<link href="../resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="../resources/vendor/metisMenu/metisMenu.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="../resources/dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<!-- <link href="../resources/vendor/morrisjs/morris.css" rel="stylesheet"> -->

<!-- DataTables CSS -->
<link href="../resources/vendor/datatables-plugins/dataTables.bootstrap.css"	rel="stylesheet">

<!-- DataTables Responsive CSS -->
<link href="../resources/vendor/datatables-responsive/dataTables.responsive.css"	rel="stylesheet">

<!-- Custom Fonts -->
<link href="../resources/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/inicio">Software Prevencion de
					Riesgos</a>
			</div>
			<!-- /.navbar-header -->

			<ul class="nav navbar-top-links navbar-right">


				<!-- /.dropdown -->

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="#"><i class="fa fa-user fa-fw"></i> User
								Profile</a></li>
						<li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
						</li>
						<li class="divider"></li>
						<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>
								Logout</a></li>
					</ul> <!-- /.dropdown-user --></li>
				<!-- /.dropdown -->
			</ul>
			<!-- /.navbar-top-links -->

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">

						<li><a href="/inicio"><i class="fa fa-dashboard fa-fw"></i>Inicio</a>
						</li>
						<li><a href="#"><i class="fa fa-wrench fa-fw"></i>Administraci�n<span
								class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="/administrador/controlpagos">Controlar
										Pagos Cliente</a></li>
								<li><a href="/administrador/accidentabilidad">Calcular
										Accidentabilidad</a></li>
								<li><a href="/administrador/actividades">Visualizar
										Actividades</a></li>
								<li><a href="/administrador/atrasos">Notificar Atrasos</a>
								</li>
								<li><a href="/administrador/reportecliente">Generar
										Reportes Cliente</a></li>
								<li><a href="/administrador/reporteglobal">Generar
										Reportes Global</a></li>
								<li><a href="#"><i class="fa fa-wrench fa-fw"></i>Mantencion<span
										class="fa arrow"></span></a>
									<ul class="nav nav-second-level">
										<li><a href="/administrador/mantencioninfocliente">Mantener
												Informaci�n Clientes</a></li>
										<li><a href="/administrador/mantencioninfoprofesional">Mantener
												Informaci�n Profesionales</a></li>
									</ul></li>
							</ul> <!-- /.nav-second-level --></li>

						<li><a href="#"><i class="fa fa-wrench fa-fw"></i>Profesional<span
								class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="/profesional/capacitacion">Crear
										Capacitacion</a></li>
								<li><a href="/profesional/lista_capacitacion">Lista de
										Capacitaciones</a></li>
								<li><a href="/profesional/visita">Planificar Visita</a></li>
								<li><a href="/profesional/revisar_cliente">Revisar
										Cliente</a></li>
								<li><a href="/profesional/asesoria">Crear Caso de
										Asesoria</a></li>
								<li><a href="/profesional/mejora">Ingresar Actividad de
										Mejora</a></li>
								<li><a href="/profesional/ingreso_asesoria">Ingresar
										Asesoria</a></li></li>
						<li><a href="/profesional/crear_check">Crear Check List</a></li>
						<li><a href="/profesional/responder_check">Responder
								Check List</a></li>
					</ul>
					<!-- /.nav-second-level -->
					</li>
					<li><a href="#"><i class="fa fa-wrench fa-fw"></i>Clientes<span
							class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="/clientes/reporte_accidente">Reportar
									Accidentes</a></li>
							<li><a href="/clientes/asesoria_especial">Solicitar
									Asesoria Especial</a></li>

						</ul> <!-- /.nav-second-level --></li>
					</ul>
				</div>
				<!-- /.sidebar-collapse -->
			</div>
			<!-- /.navbar-static-side -->
		</nav>