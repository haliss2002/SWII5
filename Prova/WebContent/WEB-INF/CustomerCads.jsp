<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Cadastro de Clientes</title>
</head>
<body>
	<center>
		<h1>Customer</h1>
        <h2>
        	<a href="CustomerCads.jsp">Cadastro de Clientes</a>
        	<a href="Salesman.jsp">Cadastro de Vendedores</a>
        	<a href="Customer.jsp">Realizar Venda</a>
        </h2>
	</center>
        <c:if test="${book == null}">
			<form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
        		<c:if test="${book != null}">
        			<input type="hidden" name="id" value="" />
        		</c:if>            
            <tr>
                <th>CUSTOMER NAME:</th>
                <td>
                	<input type="text" name="CUSTOMER NAME" size="45"
                			value=""
                		/>
                </td>
            </tr>
            <tr>
                <th>CITY: </th>
                <td>
                	<input type="text" name="CITY" size="45"
                			value=""
                	/>
                </td>
            </tr>
            <tr>
                <th>GRADE: </th>
                <td>
                	<input type="number" name="GRADE" size="5"
                			value=""
                	/>
                </td>
            </tr>
            <tr>
            	<td colspan="2" align="center">
            		<input type="submit" value="Save" />
            	</td>
            </tr>
        </table>
        </form>
    </div>	
</body>
</html>
