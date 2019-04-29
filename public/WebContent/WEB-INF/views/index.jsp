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
				<h1 class="">ProControl</h1>		
					<hr>
               	<form action="criar_ProControl" method="post">
					<div class="row">
						<div class="col-md-6 border-right ">
							<label for="" class="text-left">Numero do Chamado</label>
                            <input id="" name="numeroChamado"  type="text" class="form-control" placeholder="" required>
	                    	<div class="form-group">
	                        	<label for="" class="text-left">Data de Abertura</label>
	                            <input id="" name="dataAbertura" type="text" class="form-control" required/> 
	                        </div>
							<div class="form-group">
								<label for="" class="text-left">Produto</label>
	                            <input id="" name="produto"  type="text" class="form-control" placeholder="" required>
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
                                				<input id="" name="horaFim" type="text" class="form-control" placeholder="" required/>
                            				</div>
                            			</div>	
                            		</div>
                            	</div>
                            </div>	
                        </div>
                        <div class="col-md-6 ">
                        	<div class="form-group">
                        		<label for="" class="text-left">Atuação</label>
                        		<select name="Atuacao" id="" class="form-control" required>
                        			<option selected>Escolha</option>
                        			<option>Direcionado</option>
                        			<option>Resolvido</option>
                        			<option>Falta de Contato</option>
                        		</select>
                        	</div>
                        	<div class="form-group">
                        		<label for="" class="text-left">Fila</label>
                        		<input id="" name="fila" type="text" class="form-control" placeholder="" required/>
                        	</div>
                        	<div class="form-group">
                        		<label for="o" class="text-left">Descrição</label>
								<textarea name="descricao" id="" cols="30" rows="10" maxlength="500" class="form-control" placeholder="" required></textarea>
			                </div>
			             </div>
	                     <div class="col-md-12 ">
	                     	<div>
	                     		<h5 class="">Produtividade do Dia: ${proControl.produtividade }</h5>
	                     		<h5 class="">Produtividade do Mês: ${proControl.produtividadeMensal }</h5>
	                     		<h5 class="">Tentativas de Contato: ${tentativaContato.numeroTentativa }</h5>
	                     		<div>
	                     			<a href="tentativaContato" ><button type="button" class="btn pi-btn btn-md  float-right mx-2" >Registrar Tentativa</button></a>
	                     			<a href="listar_ProControl" ><button type="button" class="btn pi-btn btn-md  float-right mx-2" >Listar Chamado</button></a>
			                		<button type="submit"  name="criar_ProControl" class="btn pi-btn btn-md  float-right mx-2" required>Registrar Chamado</button>
			             		</div>
			          		</div>
			          	</div>
			          </div>
		            </form>
		         </section>
		        </div>
		     </div>
     	</body>
    </html>