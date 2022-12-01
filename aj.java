<html>
<head>
<script>
var request;
function sendInfo()
{
var v=document.vinform.t1.value;
var url="index.jsp?val="+v;
if(window.XMLHttpRequest){
request=new XMLHttpRequest();
}
else if(window.ActiveXObject){
request=new ActiveXObject("Microsoft.XMLHTTP");
}
try
{
request.onreadystatechange=getInfo;
72
request.open("GET",url,true);
request.send();
}
catch(e)
{
alert("Unable to connect to server");
}
}
function getInfo(){
if(request.readyState==4){
var val=request.responseText;
document.getElementById('amit').innerHTML=val;
}
}
</script>
</head>
<body>
 <form name="vinform">
<input type="text" name="t1">
<input type="button" value="ShowTable" onClick="sendInfo()">
</form>
 <span id="amit"> </span>
</body>
</html>
index.jsp
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
73
 <title>JSP Page</title>
 </head>
 <body>
 <%
int n=Integer.parseInt(request.getParameter("val"));
for(int i=1;i<=10;i++)
out.print(i*n+"<br>");
 %>
 </body>
</html>
