<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.css" type="text/css" media="screen" charset="utf-8" />

<title>Register</title>
</head>
<body>

<div class="container">
	<div class="row">
		 <form class="form-horizontal" action = RegisterAction>
            <fieldset>
         
         
                <h3>Register</h3>
        

                <!-- first-name input-->
                <div class="control-group">
                    <label class="control-label"> Name</label>
                    <div class="controls">
                        <input id="name" name="name" type="text" placeholder="name"
                        class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
                <!-- Last-name input-->
                <div class="control-group">
                    <label class="control-label">Email</label>
                    <div class="controls">
                        <input id="email" name="email" type="text" placeholder="email"
                        class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
                  <!--Gender-->
                <div class="control-group">
                    <label class="control-label">Address</label>
                    <div class="controls">
                        <input id="address" name="address" type="text" placeholder="address"
                        class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
                 <!-- phone input-->
                <div class="control-group">
                    <label class="control-label">Username</label>
                    <div class="controls">
                        <input id="username" name="username" type="text" placeholder="username"
                        class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
                 <!-- Study-->
                <div class="control-group">
                    <label class="control-label">Password</label>
                    <div class="controls">
                        <input id="password" name="password" type="text" placeholder="password"
                        class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
        
              
             
                <div class="control-group">
                  <button class="btn btn-primary">Register</button>
                    
                </div>
            </fieldset>
        </form>
	</div>

</body>
</html>