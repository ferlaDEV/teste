<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

    <!-- Font Awesome CSS -->
    <link rel="stylesheet" href="css/fontawesome/all.css">

</head>
<body>
	<div class="wrapper px-5 ">
	 		<div id="content mx-5">
		<!-- navBar -->
	 	 	<div class="panel pt-5  px-5">
	 	 		<div class="mx-3 painel-heading mt-5">
	 	 			<div class="px-3 row">
            			<div class="col-md-8  col-sm-12 float-left">
                			<h1>Chamados</h1>
                		</div>
                		<a href="proControl" ><button type="button" class="btn pi-btn btn-md  float-right mx-2" >Voltar</button></a>
                    </div>
                 </div>
            
            <form action="listar_ProControl" method="post">
            	<div class="panel col-md-12">
            		<section>
                    <div>
                    	<div style="overflow: auto; height: 600px; border:solid 1px">
                            <table class=" table table-striped" >
                                <thead>
                                    <tr>
                                        <th scope="col">Numero do Chamado</th>
                                        <th scope="col">Data de abertura</th>
                                        <th scope="col">HoraInicio</th>
                                        <th scope="col">horaFim</th>
                                        <th scope="col">Fila</th>
                                        <th scope="col">Atuação</th>
                                        <th scope="col">Descrição</th>
                                    </tr>
                                </thead>
                                <tbody>
                                 	<c:forEach var="proControl" items="${listaProControl}">
                                 		<tr>
                                            <td>
                                                ${proControl.numeroChamado }
                                            </td>
                                            <td>
                                                ${proControl.dataAbertura }
                                            </td>
                                             <td>
                                                ${proControl.horaInicio }
                                            </td>
                                             <td>
                                                ${proControl.horaFim }
                                            </td>
                                             <td>
                                                ${proControl.fila }
                                            </td>
                                            <td>
                                                ${proControl.atuacao }
                                            </td>
                                            <td>
                                                ${proControl.descricao }
                                            </td>
                                        </tr>
                                 	</c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </section>
            </div>
            </form>
        </div>
    </div>
</div>		
</body>
</html>