<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Cadastro de Ordens de Venda</title>
</head>
<body>
	<center>
		<h1>Vendas</h1>
        <h2>
        	<a href="CustomerCads.jsp">Cadastro de Clientes</a>
        	<a href="Salesman.jsp">Cadastro de Vendedores</a>
        	<a href="Customer.jsp">Realizar Venda</a>
        </h2>
	</center>
    <div align="center">
        <c:if test="${book == null}">
			<form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
        		<c:if test="${book != null}">
        			<input type="hidden" name="id" value="" />
        		</c:if>            
            <tr>
                <th>PURCH_AMT:</th>
                <td>
                	<input type="number" name="PURCH_AMT" size="45"
                			value=""
                		/>
                </td>
            </tr>
            <tr>
                <th>ORD_DATE:</th>
                <td>
                	<input type="date" name="ORD_DATE" size="45"
                			value=""
                		/>
                </td>
            </tr>
            <tr>
                <th>SALESMAN_ID: </th>
                <td>
                	<input type="number" name="SALESMAN_ID" size="45"
                			value=""
                	/>
                </td>
            </tr>
            <tr>
                <th>CUSTOMER_ID: </th>
                <td>
                	<input type="number" name="CUSTOMER_ID" size="5"
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
