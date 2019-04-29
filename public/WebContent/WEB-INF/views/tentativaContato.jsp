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
	<div class="wrapper px-5">
		<div id="content  mx-5">
			<section class=" pt-5 px-5">
			<h1 class="">Tentativa de Contato</h1>		
					<hr>
                    <form action="criar_Tentativa" method="post">
						<div class="row">
							<div class="col-md-6 border-right ">
								<label for="" class="text-left">Numero do Chamado</label>
                                <input id="" name="numeroChamado"  type="text" class="form-control" placeholder="" required>
                           </div>
                            <div class="row">
                            	<div class="form-group">
                            		<div class="container">
                            			<div class="row">
                            				<div class="col-sm-6">
                            					<label for="" class="text-left">Hora de Inicio</label>
                                				<input id="" name="horaInicio"  type="text" class="form-control" placeholder="" required />
                            				</div>
                            				<div class="col-sm-6">
                            					<label for="e" class="text-left">Hora de Fim</label>
                                				<input id="" name="horaFim" type="text" class="form-control" placeholder="" />
                            				</div>
                            			</div>	
                            		</div>
                            	</div>
                            </div>	
                        </div>
	                    <div><h5 class="">Tentativas de Contato: ${tentativaContato.numeroTentativa }</h5></div>
	                    <a href="proControl" ><button type="button" class="btn pi-btn btn-md  float-right mx-2" >Voltar</button></a>
	                    <button type="submit"  name="criar_Tentativa" class="btn pi-btn btn-md  float-right mx-2" required>Registrar Tentativa</button>
		            </form>
		          </section>
		          </div>
		     </div>
     	</body>
    </html>