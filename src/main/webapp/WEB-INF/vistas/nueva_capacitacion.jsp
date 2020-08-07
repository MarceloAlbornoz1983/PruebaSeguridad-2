<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@  taglib  prefix = "form"  uri = "http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 


            <jsp:include page="plantillas/nav.jsp"></jsp:include>

            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Capacitacion</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-md-6">
                        <form:form method="post" action="/administrador/guardarcapacitacion" modelAttribute="capacitacion">
                            <form:input path="idCap" class="form-control" type="hidden"/>
                            
                            <div class="form-group col-lg-8">
                                <label>Nombre capacitación</label>
                                <form:input path="nomCap" class="form-control" type="text"/>
                            </div>
                            <div class="form-group col-lg-8">
                                <label>Fecha creacion</label>
                                <form:input path="fechaCreacionCap" class="form-control" type="date"/>
                            </div>
                            
                            <div class="form-group col-lg-8">
                                <label>Estado de vigencia</label>
                                <form:input path="vigenciaCap" class="form-control" type="text"/>
                            </div>
                            
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