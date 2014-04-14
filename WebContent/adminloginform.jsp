
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<HTML>
<head>
<link rel="stylesheet" href="sample.css" type="text/css" media="screen" charset="utf-8" />
<link rel="stylesheet" href="css/bootstrap.css" type="text/css" media="screen" charset="utf-8" />
    <title>Admin Login</title>
</head>
<BODY>

<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-7">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <span class="glyphicon glyphicon-lock"></span> Login</div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" action="AdminLoginAction" method = "post">
                    <div class="form-group">
                        <label for="username" class="col-sm-3 control-label">
                            UserName</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="adminLoginUsername" name = "adminLoginUsername" placeholder="UserName" required >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="password" class="col-sm-3 control-label">
                            Password</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="adminLoginPassword" name = "adminLoginPassword" placeholder="Password" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-9">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox"/>
                                    Remember me
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group last">
                        <div class="col-sm-offset-3 col-sm-9">
                            <button type="submit" class="btn btn-success btn-sm">
                                Sign in</button>
                                 <button type="reset" class="btn btn-default btn-sm">
                                Reset</button>
                        </div>
                    </div>
                    </form>
                </div>
                   
            </div>
        </div>
    </div>
</div>

</BODY>
</HTML>