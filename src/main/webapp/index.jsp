<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <!-- isELIgnored is used for expression language such as ${result} below -->
<html>
<body>
	<h2>Hello World!</h2>

	<form action="calc">
		number 1:<input type="number" name="firstNum" /> <br>number 2:<input type="number"
			name="secondNum" /><br>operation type:<input type="text" name="operation"> <font style="color: red">Like add, subtract, multiply, divide </font>
			<input type="submit" name="add"> <input type="reset" name="reset">
	</form>
	<br><br>
	${result}
</body>
</html>
