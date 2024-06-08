<html>
<body>
<h2>Hello World!</h2>
<h2><a href="home">Home</a></h2>
<h2><a href="contact">Contact</a></h2>
<%int id = (Integer)(request.getAttribute("id")); %>
<% String name= (String)request.getAttribute("name"); %>
<%long contact = (Long)request.getAttribute("contact"); %>
<h1><%out.print(id); %></h1>
<h1><%out.print(name); %></h1>
<h1><%out.print(contact); %></h1>

</body>
</html>
